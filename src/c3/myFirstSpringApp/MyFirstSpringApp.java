package c3.myFirstSpringApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyFirstSpringApp {

    public static void main(String[] args) {

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("c3/myFirstSpringApp/applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TeacherConfiguration.class);

        ITeacher mathTeacher = context.getBean("mathTeacher", ITeacher.class);
        ITeacher javaTeacher = context.getBean("javaTeacher", ITeacher.class);

        System.out.println(mathTeacher.getHomework());
        System.out.println(javaTeacher.getHomework());

        context.close();
    }

}
