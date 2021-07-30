package matriz;

import java.util.Scanner;

public class Matrizes {

    public static void main (String [] args) {

        //Revisão do conceito de matriz
        //Declaração e instanciação
        //Acesso aos elementos / como percorrer uma matriz
        //Propriedade length

        /*
        Em programação, "Matriz" é o nome dado a arranjos bidimensionais
            Atenção: vetor de vetores

        Arranjo (array) é uma estrutura de dados:
            homogênea (dados do mesmo tipo)
            Ordenada (elementos acessados por meio de posições)
            Alocada de uma vez só, em um bloco contiguo de memória

        Vantagens:
            Acesso imediato aos elementos pela sua posição

        Desvantagens:
            Tamanho fixo
            Dificuldade para se realizar as inserções e deleções

        Exercício: Fazer um programa para ler um número inteiro N e uma matriz de
        ordem N contendo números inteiros. Em seguida, mostrar a diagonal principal
        e a quantidade de valores negativos da matriz.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para n: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n]; //estamos usando colchetes duas vezes para indicar que vai ser um arranjo bi-dimensional

        //Para darmos os valores dentro da matriz temos que criar dois laços de repetição:
        for (int i=0; i<n; i++) { //Esse for vai ser para percorrer as linhas e agregar os válores
            for (int j = 0; j < n; j++) { //Vai percorrer as colunas
                mat[i][j] = sc.nextInt(); //vamos dar os valores para as linhas e coluna
            }
        }

        System.out.println("Main diagonal: ");
        for (int i=0; i<n; i++) {
            System.out.print(mat[i][i] + " ");
        }

        //Contador para achar números negativos
        int count = 0;
        for (int i=0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }

        //a quantidade de linhas nós identificamos com a variável n, mas também podemos usar
        //A propriedade lenght do java, desse modo: math.lenght
        //no caso das colunas seria: math[i].lenght

        System.out.println("Negative numbers: " + count);
        sc.close();

    }
}
