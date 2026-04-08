package lab4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AppLab4 {
    //4.5.1 a)
    public static void main(String[] args) {
        HashMap<String, Integer> varste = new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);
        Map<String, String> adrese = Map.of("Ioan", "Sibiu", "Maria", "Bucuresti", "Victor",
                "Cluj","Simina", "Alba-Iulia","Marius", "Medias", "Mihai", "Cisnadie","Daniela", "Sibiu");
System.out.println("Varsta studentilor: "+varste);
varste.put("Vlad", 19);
varste.put("Iulia", 19);
System.out.println("Varsta dupa ce au mai venit studenti: "+ varste);
    }

}