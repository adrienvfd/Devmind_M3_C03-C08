package c3.ex010203;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class AnimalRunner {
    public static void main(String[] args) {

        System.out.println(" ----- Before context initialization ----- ");

        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("c3/ex010203/applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnimalConfiguration.class);

        IAnimal myFirstAnimal = (IAnimal) context.getBean("myDog", IAnimal.class);
        Map<String, IAnimal> myAnimalMap = context.getBeansOfType(IAnimal.class);

        System.out.println(myFirstAnimal.makeSound());

        myAnimalMap.forEach((beanId, animal) -> System.out.println("beanId = " + beanId + " ; animal = " + animal.makeSound()));

        context.close();

        System.out.println(" ----- After context initialization ----- ");
    }
}
