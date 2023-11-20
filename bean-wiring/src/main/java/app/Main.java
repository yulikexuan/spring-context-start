package app;


import app.config.MainConfig;
import app.domain.model.Parrot;
import app.domain.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(MainConfig.class);

        var person = context.getBean(Person.class);
        var parrot = context.getBean(Parrot.class);

        System.out.printf(">>> Registered person who has a Parrot %s%n",
                context.getBean(Person.class));

        System.out.printf(">>> Only one Parrot in context? %b%n",
                parrot == person.parrot());
    }

}