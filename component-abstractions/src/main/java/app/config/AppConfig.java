//: app.config.MainConfig.java


package app.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"app.proxy", "app.repository", "app.service"})
public class AppConfig {

}///:~