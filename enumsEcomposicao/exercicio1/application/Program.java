package enumsEcomposicao.exercicio1.application;

import enumsEcomposicao.exercicio1.entities.Department;
import enumsEcomposicao.exercicio1.entities.HourContract;
import enumsEcomposicao.exercicio1.entities.Worker;
import enumsEcomposicao.exercicio1.entititesEnum.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main (String [] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: "); //Entre com o nome do departamento
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.println("Level: ");
        String workerLevel = sc.nextLine();

        System.out.println("Base salary");
        Double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
        //Associado a este objeto existe o objeto do tipo departamento, que vai ser o nome que eu digitei

        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i=1; i<= n;i++) {
            System.out.println("Enter contract #" + i + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value por hour");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
            //Isso faz o contrato ser associado com o trabalhador, entao esse for vai se repetir ate instanciar todos os contratos e associalos com o trabalhador.
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2)); //Isso serve para voce recortar uma String, no ultimo número precisamos sempre colocar um nuúmero a mais. Depois convertemos essa String para inteiro
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();

    }
}
