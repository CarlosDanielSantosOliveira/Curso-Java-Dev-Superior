package enumsEcomposicao.exercicio1.entities;

import enumsEcomposicao.exercicio1.entititesEnum.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>(); //Sempre que eu for trabalhar com uma lista, vou ter que usar o arraylist
    //Eu nao declaro esse atributo no construtor, eu apenas instancio o arrayList


    public Worker() {

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        //Aqui vamos pegar a lista de contratos que temos nos atributos e adicionar um contrato da função
        contracts.add(contract);
    }

    public void removeContract (HourContract contract) {
        contracts.remove(contract);
    }

    //Não existe a função setContracts porque inicialmente vamos criar uma lista de contratos que vai usar a função adicionar e remover contrato dessa lista.
    //E  DE MANEIRA ALGUMA vou poder trocar essa lista por outra, por isso removemos.

    public double income(int year, int month) {

        double sum = baseSalary;

        Calendar cal = Calendar.getInstance();

        for (HourContract c : contracts) {
            //vai percorrer os contratos do usuario
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if(c_year == year  && c_month ==  month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}



