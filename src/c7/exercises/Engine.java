package c7.exercises;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
public class Engine {

    Integer horsePower;
    String name;
    Integer cylinders;

    public Engine() {
        this.horsePower = 100;
        this.name = "V8";
        this.cylinders =8;
    }

    public String toString() {
        return "Engine [horsePower=" + horsePower + ", name=" + name + ", cylinders=" + cylinders + "]";
    }
}
