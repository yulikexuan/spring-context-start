//: app.service.CommentServiceImpl.java


package app.service;


import app.domain.model.Comment;
import app.proxy.CommentNotificationProxy;
import app.repository.CommentRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor(staticName = "of", access = AccessLevel.PACKAGE)
final class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    @Override
    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
        System.out.printf(">>> Comment Publish Completed! %s <<< %n", comment);
    }

}///:~