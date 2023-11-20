package app;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Data
@Component
@Accessors(fluent = true)
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class Parrot {

    String name;

    @PostConstruct
    void init() {
        this.name = "Miki";
    }

}