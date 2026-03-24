package lab3;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
//ex.3.5.1
        Path path = Paths.get("in.txt");
        try {

            List<String> linii = Files.readAllLines(path);
            List<String> rezultatFinal = new ArrayList<>();
            System.out.println("Se proceseaza textul");
            for (String linie : linii) {
                //b
                String linieModificata = linie.replace(".", ".\n");
                //a
                linieModificata = linieModificata + "\n";
                System.out.print(linieModificata);
                rezultatFinal.add(linieModificata);
            }
            //c
            Files.write(Paths.get("out.txt"), rezultatFinal);

            System.out.println("\n Fisierul out.txt a fost creat pe Desktop");

        } catch (IOException e) {
            e.printStackTrace();
        }
        }





}