package app;


import app.config.MainConfig;
import app.repository.CommentRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {

        System.out.println(">>> Before Retrieving Repository ... ");
        var context = new AnnotationConfigApplicationContext(MainConfig.class);

        System.out.println(">>> Retrieving Repository ... ");
        CommentRepository repository = context.getBean(CommentRepository.class);
    }

}