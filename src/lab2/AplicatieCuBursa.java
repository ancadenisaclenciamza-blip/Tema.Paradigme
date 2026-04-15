package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AplicatieCuBursa {

    public List<StudentBursier> genereaza() {
        List<StudentBursier> lista = new ArrayList<>();
        lista.add(new StudentBursier(1025, "Andrei", "Popa", "ISM141/2", 8.70, 725.50));
        lista.add(new StudentBursier(1024, "Ioan", "Mihalcea", "ISM141/1", 9.80, 801.10));
        lista.add(new StudentBursier(1029, "Bianca", "Popescu", "TI131/1", 9.10, 780.80));
        lista.add(new StudentBursier(1026, "Anamaria", "Prodan", "TI131/1", 8.90, 745.50));
        lista.add(new StudentBursier(1029, "Bianca", "Popescu", "TI131/1", 9.10, 100.00));
        return lista;
    }

    public List<StudentBursier> sorteaza(List<StudentBursier> lst) {
        Collections.sort(lst, new Comparator<StudentBursier>() {
            @Override
            public int compare(StudentBursier s1, StudentBursier s2) {
                int res = s1.getFormatieDeStudiu().compareTo(s2.getFormatieDeStudiu());
                if (res != 0) return res;
                res = s1.getNume().compareTo(s2.getNume());
                if (res != 0) return res;
                res = s1.getPrenume().compareTo(s2.getPrenume());
                if (res != 0) return res;
                res = Double.compare(s2.getNota(), s1.getNota());
                if (res != 0) return res;
                return Double.compare(s2.getCuantumBursa(), s1.getCuantumBursa());
            }
        });
        return lst;
    }
}