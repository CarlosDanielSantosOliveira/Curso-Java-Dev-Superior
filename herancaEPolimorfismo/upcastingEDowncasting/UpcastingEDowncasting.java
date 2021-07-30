package herancaEPolimorfismo.upcastingEDowncasting;

import herancaEPolimorfismo.upcastingEDowncasting.entities.Account;
import herancaEPolimorfismo.upcastingEDowncasting.entities.BusinessAccount;
import herancaEPolimorfismo.upcastingEDowncasting.entities.SavingsAccount;

public class UpcastingEDowncasting {
    //Upcasting: Estou subindo da subclasse para a superclasse, é como se eu tivesse um objeto do tipo BusinessAccount e quisesse atribuir o objeto a uma variavel do tipo Account.
    //Usamos muito isso em Polimorfismo

    //Downcasting: Casting da superclasse para subclasse. É como se eu tivesse um objeto do tipo Account e quisesse atribuir o objeto a uma variavel do tipo BusinessAccount
    //instanceOf
    //Uso comum: métodos que recebem parâmetros genéricos (ex: Equals)

    public static void main (String [] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2; //nesse caso nao posso converter de Account para businessAccount, por isso deu erro. Nesse caso vamos fazer a conversão na força
        //Vamos fazer um casting manual que é: colocar o BusinessAccount entre parênteses ao lado do acc2.
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3; //nesse caso vai dar erro, pois, o acc3 é do tipo savingsAccount. Podemos evitar esse tipo de erro dessa forma:
        if (acc3 instanceof BusinessAccount) { //Se o que esta na variavel acc3 for um objeto que seja instancia de BusinessAccount, ai sim eu posso fazer o casting
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

    }

}
