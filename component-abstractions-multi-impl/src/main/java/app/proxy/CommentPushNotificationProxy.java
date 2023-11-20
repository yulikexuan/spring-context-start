//: app.proxy.CommentPushNotificationProxy.java


package app.proxy;


import app.domain.model.Comment;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
@Component
@NoArgsConstructor
@Qualifier("PUSH_NOTIFICATION_PROXY")
final class CommentPushNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.printf(">>> Sending push notification for comment: %s%n",
                comment.text());
    }

}///:~