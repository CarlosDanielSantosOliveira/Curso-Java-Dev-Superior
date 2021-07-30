package herancaEPolimorfismo.metodosAbstratos;

import herancaEPolimorfismo.metodosAbstratos.entities.Circle;
import herancaEPolimorfismo.metodosAbstratos.entities.Retangle;
import herancaEPolimorfismo.metodosAbstratos.entities.Shape;
import herancaEPolimorfismo.metodosAbstratos.entitiesEnums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    /*
    São métodos que não possuem implementação.

    Métodos precisam ser abstratos quando a classe é genérica para conter sua implementação.

    Se uma classe possuir pelo menos um método abstrato, então esta classe também é abstrata.

    Notação UML: itálico

     */

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Shape #" + i + " data: ");

            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next()); //A palavra que for digitada aqui vai ser convertida para o meu objeto do tipo enumerado color.

            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height= sc.nextDouble();

                list.add(new Retangle(color, width, height)); //inserindo o retangulo na lista

            }else {
                System.out.print("radius");
                double radius = sc.nextDouble();

                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("Shape Areas: ");

        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();

    }
}
