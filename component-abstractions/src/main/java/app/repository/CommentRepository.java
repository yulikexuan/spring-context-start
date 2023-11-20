//: app.repository.CommentRepository


package app.repository;


import app.domain.model.Comment;


public interface CommentRepository {

    void storeComment(Comment comment);

    static CommentRepository create() {
        return new DBCommentRepository();
    }

}///:~