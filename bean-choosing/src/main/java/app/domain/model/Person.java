//: app.domain.model.Person.java


package app.domain.model;


import lombok.Value;
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;


@Value
@Component
@Accessors(fluent = true)
@AllArgsConstructor(staticName = "of")
public class Person {

    String name;

    Parrot parrot;

}///:~