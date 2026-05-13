package lab9;
import java.util.*;
import java.util.stream.*;
public class pb932 {
    public static void main(String[] args) {
        String text = "Acesta este un program scris in java pentru expresii lambda";
        List<String> cuvinte = Arrays.asList(text.split(" "));

        System.out.println("Lista inițială: " + cuvinte);

        // a) Filtrare lungime >= 5 și numărare
        List<String> cuvinteLungi = cuvinte.stream()
                .filter(s -> s.length() >= 5)
                .collect(Collectors.toList());

        long numarCuvinte = cuvinteLungi.stream().count();

        System.out.println("a) Lista filtrată (lungime >= 5): " + cuvinteLungi);
        System.out.println("   Nr de cuvinte găsite: " + numarCuvinte);

        // b) Ordonarea listei noi și afișarea ei
        List<String> cuvinteSortate = cuvinteLungi.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("b) Lista ordonată alfabetic: " + cuvinteSortate);

        // c) Gasirea primului element care incepe cu litera "p"
        String cuvantCuP = cuvinte.stream()
                .filter(s -> s.startsWith("p"))
                .findFirst()
                .orElse("Nu a fost gasit niciun cuvant");

        System.out.println("c) Primul cuvant care incepe cu 'p': " + cuvantCuP);
}
}
