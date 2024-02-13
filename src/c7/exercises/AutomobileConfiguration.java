package c7.exercises;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("c7.exercises")
public class AutomobileConfiguration {

    @Bean("myCar")
    public Automobile myCar() {
        return new Car();
    }

    @Bean("myAutocar")
    public Automobile myAutocar() {
        return new Autocar();
    }

    @Bean("myMotorcycle")
    public Automobile myMotorcycle() {
        return new Motorcycle(new Engine(100, "2 Stroke Engine", 2));
    }

}
