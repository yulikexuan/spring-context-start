//: app.proxy.EmailCommentNotificationProxy.java


package app.proxy;


import app.domain.model.Comment;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("EMAIL_NOTIFICATION_PROXY")
@NoArgsConstructor
final class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        var text = comment.text();
        System.out.printf(">>> Sending notification for comment: %s%n", text);
    }

}///:~