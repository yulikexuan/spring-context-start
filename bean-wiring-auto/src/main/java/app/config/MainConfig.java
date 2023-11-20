//: app.config.MainConfig.java


package app.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan({"app.domain.model"})
public class MainConfig {

}///:~