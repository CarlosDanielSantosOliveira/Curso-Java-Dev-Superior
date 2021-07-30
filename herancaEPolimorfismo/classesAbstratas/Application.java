package herancaEPolimorfismo.classesAbstratas;

import herancaEPolimorfismo.classesAbstratas.entities.Account;
import herancaEPolimorfismo.classesAbstratas.entities.BusinessAccount;
import herancaEPolimorfismo.classesAbstratas.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Application {

    /*
    São Classes que não podem ser instanciadas

    É uma forma de garantir herança total: somente subclasses não abstratas podem ser instanciadas, mas nunca a superclasse abstrata

    no UML, nos identificamos se uma classe é abstrata, quando o nome dela esta em italico.


     */
    public static void main (String [] args) {


        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Carlos", 500.0, 0,01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1004, "Daniel", 500.0, 0.001));
        list.add(new BusinessAccount(1005, "Michel", 1000.0, 500.0));

        double sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for (Account acc: list) {
            acc.deposit(10.0);
        }

        for (Account acc: list) {
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
    }


}
