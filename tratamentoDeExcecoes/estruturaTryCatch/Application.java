package tratamentoDeExcecoes.estruturaTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Application {

    public static void main(String [] args) {

        method1();

        System.out.println("End of program");

    }

    public static void method1() {
        System.out.println("***Method1 start");
            method2();
        System.out.println("***Method1 end");
    }

    public static void method2() {
        System.out.println("***Method2 Start***");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split("");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace(); //da mais detalhes do erro para detectar o que acarretou a exceção
            sc.next();
        }
        catch (InputMismatchException e) {
            System.out.println("Input error!");
        }
        System.out.println("***Method2 end***");

        sc.close();
    }
}
