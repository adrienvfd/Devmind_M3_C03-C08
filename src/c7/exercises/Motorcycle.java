package c7.exercises;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Motorcycle implements Automobile {

    private final Engine engine;

    public Motorcycle(Engine engine) {
        this.engine = engine;
    }
    @Override
    public void travel() {
        System.out.println("Traveling with Motorcycle");
    }

    @Override
    public int maxDrivingSpeed() {
        System.out.println("Max driving speed with Motorcycle: 200km/h");
        return 200;
    }
}
