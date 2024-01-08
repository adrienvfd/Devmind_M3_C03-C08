package c3.myFirstSpringApp;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements ITeacher{

    @Override
    public String getHomework() {
        return "Solve 100 calculus problems";
    }

}
