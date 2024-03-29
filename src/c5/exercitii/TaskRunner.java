package c5.exercitii;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TaskRunner {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("c5/exercitii/applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskConfiguration.class);

        Task task = context.getBean("myTask", Task.class);
        task.run();

        Task task2 = context.getBean("myTask", Task.class);
        task2.run();

        context.close();
    }
}
