package herancaEPolimorfismo.sobreposicaoPalavraSuperAnotacaoOverride;

import herancaEPolimorfismo.sobreposicaoPalavraSuperAnotacaoOverride.entities.Account;
import herancaEPolimorfismo.sobreposicaoPalavraSuperAnotacaoOverride.entities.BusinessAccount;
import herancaEPolimorfismo.sobreposicaoPalavraSuperAnotacaoOverride.entities.SavingsAccount;

public class Sobreposicao {

    //Sobreposição é a implementação de um método de uma superClasse na subClasse

    //É fortemente recomendável usar a anotação @Override em um método sobrescrito

    //Facilita a leitura e compreensão do código

    //Avisamos ao compilador (boa prática)

    public static void main (String [] args) {

        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(400.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Carlos", 1500.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

    }
}
