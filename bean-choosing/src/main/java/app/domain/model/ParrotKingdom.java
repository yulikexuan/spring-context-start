//: app.domain.model.ParrotKingdom.java


package app.domain.model;


import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.experimental.Accessors;


@Value
@Accessors(fluent = true)
@AllArgsConstructor(staticName = "of")
public class ParrotKingdom {

    Parrot king;
    Parrot queen;
    Parrot princess;

}///:~