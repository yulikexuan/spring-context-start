package app;


import app.config.MainConfig;
import app.domain.model.ParrotKingdom;
import app.domain.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(MainConfig.class);

        var person = context.getBean(Person.class);

        System.out.printf(">>> Registered person who has a Parrot %s%n", person);

        var kingdom = context.getBean(ParrotKingdom.class);

        System.out.printf(">>> Registered Parrot Kingdom: %s%n", kingdom);
    }

}