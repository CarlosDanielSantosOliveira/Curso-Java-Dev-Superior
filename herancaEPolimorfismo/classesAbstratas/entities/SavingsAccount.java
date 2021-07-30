package herancaEPolimorfismo.classesAbstratas.entities;

public class SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount() {
        super(); //Acessa os atributos da superClasse
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public SavingsAccount(int i, String carlos, double v, int i1, int i2) {
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        //Vai atualizar o saldo com base na taxa de juros
        balance += balance * interestRate;
    }
}
