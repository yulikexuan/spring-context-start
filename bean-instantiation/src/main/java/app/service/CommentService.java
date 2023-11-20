//: app.service.CommentService


package app.service;


import org.springframework.stereotype.Component;


public interface CommentService {

    void publishComment(String comment);

}

@Component
final class CommentServiceImpl implements CommentService {

    CommentServiceImpl() {
        System.out.printf(">>> Instantiating class %s%n", this.getClass().getName());
    }

    @Override
    public void publishComment(String comment) {
        System.out.printf(">>> Comment: %s%n", comment);
    }
}

///:~