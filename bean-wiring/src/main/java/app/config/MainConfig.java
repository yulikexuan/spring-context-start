//: app.config.MainConfig.java


package app.config;


import app.domain.model.Parrot;
import app.domain.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MainConfig {

    @Bean
    public Parrot miki() {
        return Parrot.of("Miki");
    }

    /*
     * When two methods annotated with @Bean call each other
     * Spring knows you want to create a link between the beans
     * If the bean already exists in the context,
     * Spring returns the existing bean without forwarding the call to
     * the @Bean method
     *
     * If the bean does not exist, Spring creates the bean and returns its
     * reference
     */
    @Bean
    public Person person(Parrot miki) {
        return Person.of("Ella", miki);
    }

}///:~