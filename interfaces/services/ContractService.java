package interfaces.services;

import interfaces.entities.Contract;
import interfaces.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {

    //Composição de objetos (nesse caso serviços)
    //Inversão de controle/injeção de dependência: -> Estudar por fora
    //Você não pode deixar sua classe responsável pelo controle de qual instância ela vai precisar para executar. Tem que ser uma agente externo que vai fazer isso.

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    //O nome disso é injeção de dependência

    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;  //Parcela básica

        for (int i = 1; i <= months; i ++) {
            double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i); //Atualização da parcela
            //vai estar valendo 202 de acordo com o calculo ate agora.

            double fullquota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
            //Agora esta valendo 206.04
            Date dueDate = addMonths(contract.getDate(), i);
            contract.getInstallments().add(new Installment(dueDate, fullquota));
        }
    }

    private Date addMonths(Date date, int N) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, N);
        return calendar.getTime();

    }

}
