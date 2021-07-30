package enumsEcomposicao.ex2;

import enumsEcomposicao.ex2.entities.Comment;
import enumsEcomposicao.ex2.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExercicioResolvido2StringBuilder {

    public static void main (String [] args) throws ParseException {

        SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Uau, como o StringBuilder é incrivel");
        Comment c2 = new Comment("Verdade, ele é mesmo!");

        Post p1 = new Post(spf.parse("14/07/2021 00:44:55"), "Apresentando o StringBuilder", "Mais legivel e agil que o toString", 12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }
}
