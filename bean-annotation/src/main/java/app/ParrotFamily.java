//: app.ParrotFamily.java


package app;


import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;


@Component
@Value
@Accessors(fluent = true)
@AllArgsConstructor(staticName = "of")
public class ParrotFamily {

    Parrot king;
    Parrot queen;
    Parrot princess;

}///:~