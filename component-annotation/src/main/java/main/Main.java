package main;


import main.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(MainConfig.class);
        Parrot parrot = context.getBean(Parrot.class);
        System.out.printf(">>> Is the parrot name Miki? %b%n",
                parrot.name.equals("Miki"));
    }

}