//: app.config.MainConfig.java


package app.config;


import app.proxy.CommentNotificationProxy;
import app.repository.CommentRepository;
import app.service.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    CommentRepository commentRepository() {
        return CommentRepository.create();
    }

    @Bean
    CommentNotificationProxy commentNotificationProxy() {
        return CommentNotificationProxy.create();
    }

    @Bean
    CommentService commentService(
            CommentRepository commentRepository,
            CommentNotificationProxy commentNotificationProxy) {

        return CommentService.of(commentRepository, commentNotificationProxy);
    }

}///:~