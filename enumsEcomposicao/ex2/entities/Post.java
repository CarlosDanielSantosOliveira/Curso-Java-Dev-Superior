package enumsEcomposicao.ex2.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    //Declaramos ele aqui para não ter que instanciar toda hora;

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public Post() {

    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    //A função de add e remove vai substituir o setComment, pois, nao podemos usar o set nesse caso em que existe uma Lista

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" likes - ");
        sb.append(spf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");

        for (Comment c: comments) {
            sb.append(c.getText() + "\n");
        }
        //Criamos o for each para cada comment c na lista de comments, vamos acrescentar o comment c na StringBuilder
        return sb.toString(); //Aqui convertemos o StringBuilder para uma String
    }
    //Vamos usar a classe StringBuilder, pois, comparado ao toString normal, consome menos memória e deixa a leitura do código mais agil.

}
