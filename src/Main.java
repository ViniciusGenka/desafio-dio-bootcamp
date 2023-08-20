import com.genka.domain.Course;
import com.genka.domain.Mentorship;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Aprendendo POO", "Consolidando conhecimendos de Programação Orientada a Objetos", 5);
        Course course2 = new Course("Aprendendo Spring Boot", "Consolidando conhecimentos em Java com o Framework Spring Boot", 10);
        System.out.println(course1);
        System.out.println(course2);

        Mentorship mentorship1 = new Mentorship("Spring Boot na Prática", "Praticando Java com o Framework Spring Boot", LocalDate.now());
        System.out.println(mentorship1);
    }
}