//: app.config.MainConfig.java


package app.config;


import app.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@ComponentScan({"app"})
@Configuration
public class MainConfig {

    @Bean("princess")
    public Parrot parrotKoko() {
        return Parrot.of("Koko");
    }

    @Bean("king")
    // @Primary
    public Parrot parrotMiki() {
        return Parrot.of("Miki");
    }

    @Bean("queen")
    public Parrot parrotRiki() {
        return Parrot.of("Riki");
    }

    public List<Parrot> parrots(List<Parrot> parrots) {
        return parrots;
    }

    @Bean
    public String greeting(List<Parrot> parrots) {
        return ">>> Hello %s, Welcome to Spring!".formatted(parrots);
    }

}///:~