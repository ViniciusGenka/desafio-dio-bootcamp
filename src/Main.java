import com.genka.domain.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Aprendendo POO", "Consolidando conhecimendos de Programação Orientada a Objetos", 5);
        Course course2 = new Course("Aprendendo Spring Boot", "Consolidando conhecimentos em Java com o Framework Spring Boot", 10);

        Mentorship mentorship1 = new Mentorship("Spring Boot na Prática", "Praticando Java com o Framework Spring Boot", LocalDate.now());

        Set<Content> bootcampContents = new LinkedHashSet<>(Arrays.asList(course1, course2, mentorship1));
        Bootcamp bootcamp = new Bootcamp(
                bootcampContents,
                "Spring Boot",
                "Bootcamp sobre Spring Boot"
        );

        Student vinicius = new Student("Vinicius Genka");
        System.out.println("Conteúdos inscritos do Vinicius: " + vinicius.getSubscribedContents());
        vinicius.subscribeToBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos do Vinicius: " + vinicius.getSubscribedContents());
        System.out.println("Conteúdos concluídos do Vinicius: " + vinicius.getCompletedContents());
        vinicius.progressInBootcamp();
        System.out.println("Conteúdos concluídos do Vinicius: " + vinicius.getCompletedContents());
        System.out.println("XP do Vinicius: " + vinicius.getStudentXP());
    }
}