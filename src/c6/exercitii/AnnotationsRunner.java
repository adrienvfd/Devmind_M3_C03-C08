package c6.exercitii;

public class AnnotationsRunner {
    public static void main(String[] args) {
        Annotations test1 = new Annotations("Adrien");
        System.out.println("Name 1 = " +test1.getName());

        Annotations test2 = new Annotations("Adrien");
        System.out.println("Name 2 = " + test2.getName());

        System.out.println("Name 1 == Name 2 = " + test1.equals(test2));

        Annotations test3 = new Annotations("Radu");
        System.out.println("Name 3 = " + test3.getName());
        System.out.println("Name 1 == Name 3 = " + test1.equals(test3));

// Lombok Annotations added the getters and setters for the entity Annotations.
// Moreover, the annotation @Data generated the toString method,
// and the annotation @Getter and @Setter generated the getters and setters, as well as the equals method and the hashCode.
    }
}
