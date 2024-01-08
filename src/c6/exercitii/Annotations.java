package c6.exercitii;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Annotations {

    private final String name;

    public Annotations (String name) {
        this.name = name;
    }
}
