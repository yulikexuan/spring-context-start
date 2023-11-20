//: app.service.CommentService


package app.service;


import app.domain.model.Comment;
import app.proxy.CommentNotificationProxy;
import app.repository.CommentRepository;
import lombok.NonNull;


public interface CommentService {

    void publishComment(Comment comment);

    static CommentService of(
            @NonNull final CommentRepository commentRepository,
            @NonNull final CommentNotificationProxy commentNotificationProxy) {

        return CommentServiceImpl.of(commentRepository, commentNotificationProxy);
    }

}///:~