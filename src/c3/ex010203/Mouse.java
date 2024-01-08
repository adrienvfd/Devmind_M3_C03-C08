package c3.ex010203;

import org.springframework.stereotype.Component;

@Component("myMouse")
public class Mouse implements IAnimal{

    @Override
    public String makeSound() {
        return "I love cheese";
    }
}
