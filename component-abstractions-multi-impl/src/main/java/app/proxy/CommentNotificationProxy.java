//: app.proxy.CommentNotificationProxy


package app.proxy;


import app.domain.model.Comment;


@FunctionalInterface
public interface CommentNotificationProxy {

    void sendComment(Comment comment);

    static CommentNotificationProxy create() {
        return new EmailCommentNotificationProxy();
    }

}///:~