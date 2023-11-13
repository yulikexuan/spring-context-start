package main;


import main.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(MainConfig.class);

        context.registerBean(
                Parrot.class,
                () -> Parrot.of("Miki"),
                beanConfig -> beanConfig.setPrimary(true));

        System.out.printf(">>> Registered parrot having name %s%n",
                context.getBean(Parrot.class).name());
    }

}