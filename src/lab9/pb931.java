package lab9;
import java.util.*;
import java.util.stream.*;
public class pb931 {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> numere = IntStream.range(0, 10)
                .map(i -> 5 + random.nextInt(21))
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Lista random: " + numere);
        // PUNCTUL a
        int suma = numere.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("a) Suma nr este: " + suma);

        // b) Determinarea valorii maxime și minime
        int max = numere.stream()
                .max(Integer::compare)
                .get();

        int min = numere.stream()
                .min(Integer::compare)
                .get();

        System.out.println("b) Maximul este: " + max);
        System.out.println("b) Minimul este: " + min);


        // c) Crearea unei liste cu elementele din intervalul [10, 20]
        List<Integer> listaFiltrata = numere.stream()
                .filter(n -> n >= 10 && n <= 20)
                .collect(Collectors.toList());

        System.out.println("c) Elementele între 10 și 20 sunt: " + listaFiltrata);

        // d) Transformarea listei de Integer într-o listă de Double
        List<Double> listaDouble = numere.stream()
                .map(n -> Double.valueOf(n))
                .collect(Collectors.toList());

        System.out.println("d) Lista transformată în Double: " + listaDouble);

        // e) Afișarea dacă în listă se găsește valoarea 12
        boolean gasit12 = numere.stream()
                .anyMatch(n -> n == 12);

        System.out.println("e) Se găsește numărul 12 în listă? " + gasit12);
    }

}

