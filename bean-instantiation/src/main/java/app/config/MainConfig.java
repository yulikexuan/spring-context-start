//: app.config.MainConfig.java


package app.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan({"app.service", "app.repository"})
public class MainConfig {

}///:~