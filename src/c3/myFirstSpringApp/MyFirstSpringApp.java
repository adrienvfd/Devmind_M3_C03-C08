package c3.myFirstSpringApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp{

    public static void main(String[] args) {

        // load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("c3/ex010203/applicationContext.xml");

        // retrieve bean from Spring container
        ITeacher theTeacher = context.getBean("myTeacher", ITeacher.class);

        // call methods on the bean
        System.out.println(theTeacher.getHomework());

        // close the context
        context.close();
    }

}
