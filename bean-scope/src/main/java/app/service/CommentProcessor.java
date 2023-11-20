//: app.service.CommentProcessop.java


package app.service;


import app.domain.model.Comment;
import app.repository.CommentRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;


public interface CommentProcessor {

    Comment comment();

    CommentProcessor comment(Comment comment);

    CommentProcessor process(Comment comment);

    CommentProcessor validate(Comment comment);
}

@Component
@Scope(SCOPE_PROTOTYPE)
@RequiredArgsConstructor(staticName = "of", access = AccessLevel.PACKAGE)
final class CommentProcessorImpl implements CommentProcessor {

    private Comment comment;

    private final CommentRepository commentRepository;

    @Override
    public Comment comment() {
        return this.comment;
    }

    @Override
    public CommentProcessor comment(Comment comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public CommentProcessor process(Comment comment) {
        System.out.printf(">>> Processing Comment %s%n", comment);
        return comment(comment);
    }

    @Override
    public CommentProcessor validate(Comment comment) {
        System.out.printf(">>> Validating Comment %s%n", comment);
        return comment(comment);
    }

}

///:~