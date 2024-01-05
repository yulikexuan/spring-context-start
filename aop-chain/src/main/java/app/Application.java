package app;


import app.config.AppConfig;
import app.domain.model.Comment;
import app.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        CommentService cs = context.getBean(CommentService.class);

        cs.publishComment(Comment.of("YUL", "New Spring Boot Book published!"));
    }

}