package lab7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 7.6.1.
        Form f1 = new Form("red");
        Form f2 = new Form("yellow");
        Form f3 = new Form("blue");

        System.out.println("7.6.1) Test Form:");
        System.out.println(f1);
        System.out.println("Total instance count is: " + Form.getInstanceCount());

        System.out.println("\n7.6.2) Generated passwords:");
        System.out.println("1: " + PasswordMaker.getInstance());
        System.out.println("2: " + PasswordMaker.getInstance());
        System.out.println("Number of times getInstance() has been called: " + PasswordMaker.getCallingCounts());

        System.out.println("\n7.6.3 b) Impartirea studentilor in formatii:");

        List<Studentt> studenti = new ArrayList<>();
        studenti.add(new Studentt(131, "Luca", "Diaconeasa", "TI22/1", 6.5));
        studenti.add(new Studentt(114, "Mark", "Vikram", "TI22/1", 8.3));
        studenti.add(new Studentt(114, "Vladu", "Denis", "TI22/2", 8.3));
        studenti.add(new Studentt(211, "Maria", "Petrea", "TI22/2", 5.0));
        studenti.add(new Studentt(121, "Vlad", "Stef", "TI22/1", 10.0));


        int mijloc = (studenti.size() + 1) / 2;
        List<Studentt> formatia1 = new ArrayList<>(studenti.subList(0, mijloc));
        List<Studentt> formatia2 = new ArrayList<>(studenti.subList(mijloc, studenti.size()));

        System.out.println("Formatia 1 ");
        for (Studentt s : formatia1) {
            System.out.println(s);
        }

        System.out.println("\n Formatia 2 ");
        for (Studentt s : formatia2) {
            System.out.println(s);
        }
    }
}