package c7.exercises;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutomobileRunner {

    Car car;

    public static void main(String[] args) {

        // citeste fisierul de configurare
        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("c7/exercises/applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutomobileConfiguration.class);

        // obtine bean-ul din containerul de Spring
        Car car = (Car) context.getBean("myCar", Car.class);
        // foloseste functionalitatile bean-ului
        car.travel();
        System.out.println(car.getEngine().toString());

        Autocar autocar = (Autocar) context.getBean("myAutocar", Autocar.class);
        autocar.travel();
        autocar.maxDrivingSpeed();
        System.out.println(autocar.getEngine().toString());

        Motorcycle motorcycle = (Motorcycle) context.getBean("myMotorcycle", Motorcycle.class);
        motorcycle.travel();
        motorcycle.maxDrivingSpeed();
        System.out.println(motorcycle.getEngine().toString());
        context.close();
    }
}