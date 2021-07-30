package herancaEPolimorfismo.exercicio;

import herancaEPolimorfismo.exercicio.entities.Employee;
import herancaEPolimorfismo.exercicio.entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        //Agora vamos criar um for para ler repetinamente a quantidade de funcionarios
        for (int i=1; i<=n; i++) {
            System.out.println("Employee #" + i + "data:");

            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourceEmployee(name, (int) hours, valuePerHour, additionalCharge)); //Instanciamos um funcionarios terceirizado); //adicionamos o funcionario a nossa lista
            } else {
                list.add(new Employee(name, (int) hours, valuePerHour));
            }

            System.out.println();
            System.out.println("PAYMENTS: ");

            for (Employee emp : list) {
                System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
            }
            //Toda vez que criamos uma lista de algo, precisamos criar um for each para percorrer a lista e trazer os resultados

        }


        sc.close();

    }
}
