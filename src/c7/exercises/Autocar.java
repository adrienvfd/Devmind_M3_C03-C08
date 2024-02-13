package c7.exercises;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Getter
@Setter
@Component
public class Autocar implements Automobile {

    // Engine is injected through setter
    private Engine engine;

    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void travel() {
        System.out.println("Traveling with Autocar");
    }

    @Override
    public int maxDrivingSpeed() {
        System.out.println("Max driving speed with Autocar: 90km/h");
        return 90;
    }
}
