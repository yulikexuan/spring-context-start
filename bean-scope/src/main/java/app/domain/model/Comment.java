//: app.domain.model.Comment.java


package app.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;


@Data
@Accessors(fluent = true)
@AllArgsConstructor(staticName = "of")
public class Comment {

    String author;

    String text;

    int publishedTimes;

}///:~