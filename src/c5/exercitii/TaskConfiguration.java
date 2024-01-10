package c5.exercitii;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("c5.exercitii")
public class TaskConfiguration {

    @Bean
    public Task myTask() {
        return new Task();
    }
}
