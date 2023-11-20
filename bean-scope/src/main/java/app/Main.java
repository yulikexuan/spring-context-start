package app;


import app.config.MainConfig;
import app.domain.model.Comment;
import app.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(MainConfig.class);

        CommentService service = context.getBean(CommentService.class);

        Comment comment_1 = Comment.of(
                "LAURENȚIU SPILCĂ",
                "Published a new book about Spring",
                0);

        Comment comment_2 = Comment.of(
                "YUL",
                "New twit published",
                0);

        service.publishComment(comment_1);
        service.publishComment(comment_2);
    }

}