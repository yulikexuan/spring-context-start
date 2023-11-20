//: app.service.SimpleCommentService.java


package app.service;


import app.domain.model.Comment;
import app.proxy.CommentNotificationProxy;
import app.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
class SimpleCommentService implements CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    SimpleCommentService(
            CommentRepository commentRepository,
            @Qualifier("PUSH_NOTIFICATION_PROXY")
            CommentNotificationProxy commentNotificationProxy) {

        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    @Override
    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
        System.out.printf(">>> Simple Comment Publish Completed! %s <<< %n",
                comment);
    }

}///:~