package c3.ex010203;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("c3.ex010203")
public class AnimalConfiguration {

    @Bean("myCat")
    public IAnimal myCat() {
        return new Cat("Bob");
    }

    @Bean("myDog")
    public IAnimal myDog() {
        return new Dog();
    }

    @Bean ("myMouse")
    public IAnimal myMouse() {
        return new Mouse();
    }
}
