package app;


import app.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(MainConfig.class);

        ParrotFamily parrotFamily = context.getBean(ParrotFamily.class);
        System.out.println(parrotFamily);
//        List<Parrot> parrots = context.getBean("parrots", List.class);
//        System.out.println(parrots);
//
//        Parrot popularParrot = context.getBean(Parrot.class);
//
//        System.out.printf(">>> The most popular parrot is %s%n", popularParrot.name());
//
////        System.out.printf(">>> The parrot in Spring is %s%n", parrot.name());
////
//        System.out.println(context.getBean("greeting"));
//
//        Parrot kingOfParrot = context.getBean("kingOfParrot", Parrot.class);
//
//        System.out.printf(">>> %s is the King of parrots!%n", kingOfParrot.name());
    }

}