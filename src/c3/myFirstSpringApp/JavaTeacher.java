package c3.myFirstSpringApp;

import org.springframework.stereotype.Component;

@Component
public class JavaTeacher implements ITeacher{

    @Override
    public String getHomework() {
        return "Create 100 classes";
    }

}
