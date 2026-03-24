package lab3;
import lab2.Student;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Studenti {
    public static void main(String[] args) {
        //3.5.2
        try {
           //citire studenti
            List<String> linii = Files.readAllLines(Paths.get("studenti_in.txt"));
            List<Student> listaStudenti = new ArrayList<>();
            for (String linie : linii){
                String[] date = linie.split(",");
                if (date.length == 4) {
                    Student s=new Student(
                            Integer.parseInt(date[0].trim()), date[2].trim(), date[1].trim(), date[3].trim()
                    );
                    listaStudenti.add(s);
                }
            }
            //afis studenti
            System.out.println("Studentii cititi:");
            for (Student s : listaStudenti) {
                System.out.println(s);
            }
            //sortare studenti
            //3.5.3
            Collections.sort(listaStudenti, Comparator.comparing(Student::getFormatieDeStudiu).thenComparing(Student::getNume));
            //salvare stud
            List<String> deSalvat = new ArrayList<>();
            for (Student s : listaStudenti) {
                deSalvat.add(s.toFileFormat());
            }
            Files.write(Paths.get("studenti_out_sorted.txt"), deSalvat);
            System.out.println("rezultatul a fost salvat in studenti_out_sorted.txt");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}