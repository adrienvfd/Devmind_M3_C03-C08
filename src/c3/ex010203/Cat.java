package c3.ex010203;

import org.springframework.stereotype.Component;

@Component("myCat")
public class Cat implements IAnimal {
    private final String animalName;

    public Cat(String animalName) {
        this.animalName = animalName;
    }

    public Cat() {
        this.animalName = "Bob";
    }
    @Override
    public String makeSound() {
        return "meeeeww... my name is " + animalName;
    }
}
