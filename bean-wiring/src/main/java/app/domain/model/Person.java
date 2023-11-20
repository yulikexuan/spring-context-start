//: app.domain.model.Person.java


package app.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;


@Data
@Component
@Accessors(fluent = true)
@AllArgsConstructor(staticName = "of")
public class Person {

    String name;
    Parrot parrot;

}///:~