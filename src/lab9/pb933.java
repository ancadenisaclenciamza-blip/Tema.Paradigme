package lab9;
import java.util.*;
import java.util.stream.*;
public class pb933 {
    public static void main(String[] args) {
        List<Student> studenti = Arrays.asList(
                new Student(1029, "Marius", "Nasta", "TI131/2", 10.0),
                new Student(1029, "Marius", "Nasta", "TI131/1", 10.0),
                new Student(1029, "Andrei", "Dobrescu", "TI131/2", 8.45),
                new Student(1029, "Marius", "Nasta", "TI131/2", 3.20),
                new Student(1029, "Marius", "Nasta", "TI131/1", 5.12),
                new Student(1029, "Andrei", "Dobrescu", "TI131/2", 2.22)
        );

        // a
        List<Student> nota10 = studenti.stream()
                .filter(s -> s.nota == 10.0)
                .collect(Collectors.toList());

        System.out.println("Studenți cu nota 10: " + nota10);

        //  b
        List<Student> sub5 = studenti.stream()
                .filter(s -> s.nota < 5.0)
                .collect(Collectors.toList());

        System.out.println("Studenți cu nota sub 5: " + sub5);

        //  c
        List<Student> studentiNoteModificate = studenti.stream()
                .map(s -> {
                    if (s.nota < 4.0) {
                        return new Student(s.id, s.prenume, s.nume, s.grupa, 4.0);
                    }
                    return s;
                })
                .collect(Collectors.toList());

        System.out.println("Studenți după modificare note < 4: " + studentiNoteModificate);

        //  d & e
        double sumaNote = studentiNoteModificate.stream()
                .map(s -> s.nota)
                .reduce(0.0, (a, b) -> a + b);

        double media = sumaNote / studentiNoteModificate.size();

        System.out.println("Suma notelor (pe lista modificata): " + sumaNote);
        System.out.println("Media notelor: " + media);
    }
}