//: app.service.CommentService


package app.service;


import app.domain.model.Comment;
import app.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;


public interface CommentService {

    void publishComment(Comment comment);

}

@Service
@RequiredArgsConstructor(staticName = "of")
final class CommentServiceImpl implements CommentService {

    private final ApplicationContext appCtx;
    private final CommentRepository commentRepository;

    @Override
    public void publishComment(Comment comment) {

        var commentProcessor = this.appCtx.getBean(CommentProcessor.class);

        System.out.printf(">>> New comment processor: %s%n", commentProcessor);

        var processedComment = commentProcessor
                .validate(comment)
                .process(comment)
                .comment();

        processedComment.publishedTimes(processedComment.publishedTimes() + 1);

        System.out.printf(">>> Publishing Comment: %s%n", processedComment);
    }

}

///:~