package c3.ex010203;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class AnimalRunner {
    public static void main(String[] args) {

        // load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("c3/ex010203/applicationContext.xml");

        // retrieve bean from Spring container
        IAnimal myFirstAnimal = context.getBean("myDog", IAnimal.class);
        Map<String, IAnimal> myAnimalMap = context.getBeansOfType(IAnimal.class);


        // call methods on the bean
        System.out.println(myFirstAnimal.makeSound());

        myAnimalMap.forEach((beanId, animal) -> System.out.println("beanId = " + beanId + " ; animal = " + animal.makeSound()));

        // close the context
        context.close();
    }

    // 3. Alege una dintre implementările tale și adaugă un constructor care primește un parametru de tip String, și setează
    // un field de tipul String animalName. Configurează un bean cu implementarea modificată și încearcă să îl extragi din Spring container.
    // Observă comportamentul aplicației și discută cu trainer-ul despre observațiile făcute.

    // -> Optiunea 1 -> Sa creez si noArgsConstructor
    // -> Optiunea 2 -> Sa pasez arg din xml
}
