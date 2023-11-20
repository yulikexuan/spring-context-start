package app;


import app.config.AppConfig;
import app.domain.model.Comment;
import app.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        var commentService = context.getBean(
                "defaultCommentService", CommentService.class);

        var comment = Comment.of("Laurentiu", "Demo Comment");

        commentService.publishComment(comment);
    }

}