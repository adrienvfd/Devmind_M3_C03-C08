package c3.ex010203;

import org.springframework.stereotype.Component;

@Component("myDog")
public class Dog implements IAnimal {

    @Override
    public String makeSound() {
        return "woof woof";
    }
}
