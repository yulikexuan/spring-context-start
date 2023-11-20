//: app.proxy.EmailCommentNotificationProxy.java


package app.proxy;


import app.domain.model.Comment;


final class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        var text = comment.text();
        System.out.printf(">>> Sending notification for comment: %s%n", text);
    }

}///:~