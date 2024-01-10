package c3.myFirstSpringApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("c3.myFirstSpringApp")
@Configuration
public class TeacherConfiguration {

    @Bean("javaTeacher")
    public ITeacher javaTeacher() {
        return new JavaTeacher();
    }

    @Bean("MathTeacher")
    public ITeacher mathTeacher() {
        return new MathTeacher();
    }
}
