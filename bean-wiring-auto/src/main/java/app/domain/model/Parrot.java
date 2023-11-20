package app.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;


@Data
@Component
@Accessors(fluent = true)
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class Parrot {
    String name = "KoKo";
}