//: app.repository.CommentRepository


package app.repository;


import org.springframework.stereotype.Repository;


public interface CommentRepository {
    void save(String comment);
}

@Repository
final class CommentRepositoryImpl implements CommentRepository {

    CommentRepositoryImpl() {
        System.out.printf(">>> Instantiating class %s%n", this.getClass().getName());
    }

    @Override
    public void save(String comment) {
        System.out.printf(">>> Saving Comment %s%n", comment);
    }

}

///:~