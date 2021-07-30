package tratamentoDeExcecoes.estruturaTryCatch.blocoFamily;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class application {

    public static void main (String [] args) {

        /*
        É um bloco que contém código a ser executado independente de ter ocorrido ou não uma exceção.

        Exemplo classico: fechar um arquivo, conexão com banco de dados, ou outro recurso específico ao final do processamento.

        Sintaxe:
        try {

        }
        catch (ExcepetionType e) {

        }
        finally {

        }
         */

        File file = new File("C:\\Users\\Carlos Daniel\\Desktop\\a.txt"); //para encontrar o arquivo que quero fazer o programa ler
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error opning file: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Finally block executed");
        }
    }
}
