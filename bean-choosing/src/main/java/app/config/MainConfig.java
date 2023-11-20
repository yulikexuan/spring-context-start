//: app.config.MainConfig.java


package app.config;


import app.domain.model.Parrot;
import app.domain.model.ParrotKingdom;
import app.domain.model.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan({"app.domain.model"})
public class MainConfig {

    @Bean
    public Parrot parrotKoko() {
        return Parrot.of("Koko");
    }

    @Bean
    public Parrot parrotMiki() {
        return Parrot.of("Miki");
    }

    @Bean
    public Parrot parrotRiki() {
        return Parrot.of("Riki");
    }

    @Bean
    public Person person(@Qualifier("parrotRiki") Parrot parrot) {
        return Person.of("Ella", parrot);
    }

    @Bean
    public ParrotKingdom parrotKingdom(
            @Qualifier("parrotMiki") Parrot king,
            @Qualifier("parrotKoko") Parrot queen,
            @Qualifier("parrotRiki") Parrot princess) {

        return ParrotKingdom.of(king, queen, princess);
    }

}///:~