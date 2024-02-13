package c4.curs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp {
    public static void main(String args[]) {
        // load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("c4/curs/applicationContext.xml");

        // retrieve bean from the Spring container
        ITeacher theTeacher = context.getBean("myTeacher", ITeacher.class);

        // call methods on the bean
        System.out.println(theTeacher.getWisdom());

        // close the context
        context.close();
    }
}

