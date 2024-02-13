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
public class Car implements Automobile{

    @Autowired
    // Engine is autowired
    private Engine engine;

    @Override
    public void travel() {
        System.out.println("Traveling with Car");
    }

    @Override
    public int maxDrivingSpeed() {
        System.out.println("Max driving speed with Car: 130km/h");
        return 130;
    }
}
