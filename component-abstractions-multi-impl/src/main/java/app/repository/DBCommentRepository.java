//: app.repository.DBCommentRepository.java


package app.repository;


import app.domain.model.Comment;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;


@Repository
@NoArgsConstructor
class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.printf(">>> Storing comment: %s%n", comment.text());
    }

}///:~