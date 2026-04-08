package lab2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ex 2.5.1(lab2)
        System.out.println("ex 2.5.1");
        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList(); //a
        Set<Integer> zSet = new TreeSet(); //b
        List<Integer> xMinusY = new ArrayList();//c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList(); //d

        System.out.println("introduceti 5 nr in domeniul [0...10] pt x:");
        for(int i=0;i<5;i++){ x.add(sc.nextInt()); }
        System.out.println("introduceti 7 nr in domeniul [0...10] pt x:");
        for(int i=0;i<7;i++){ y.add(sc.nextInt()); }
        Collections.sort(x);
        Collections.sort(y);

        //2.5.1 a
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);

        //2.5.1 b
        zSet.addAll(x);
        zSet.retainAll(y);

        //2.5.1 c
        xMinusY.addAll(x);
        xMinusY.removeAll(y);

        //2.5.1 d
        for(int i=0; i<xPlusY.size();i++){
            Integer val=xPlusY.get(i);
            if(val <= p){
                xPlusYLimitedByP.add(val);
            }
        }
        System.out.println("xPlusY:"+ xPlusY);
        System.out.println("zSet:"+ zSet);
        System.out.println("xMinusY:"+ xMinusY);
        System.out.println("xPlusYLimitedByP:"+ xPlusYLimitedByP);


//ex 2.5.2 lab2
        System.out.println("ex 2.5.2");
        Student student1= new Student(474,"Popa", "Alin", "A123" );
        System.out.println(student1);

        List<Student> listaStudenti = new ArrayList<>();
        listaStudenti.add(student1);
        listaStudenti.add(new Student(112, "Popa", "Maria", "TI21/1"));
//2.5.2 a
        System.out.println("lista Studenti:");
        for(Student s:listaStudenti){
            System.out.println(s);
        }
        // b & c
        Student alis= new Student(120, "Popa", "Alis", "TI21/1");
        Student maria=new Student(112, "Popa", "Maria", "TI21/1");

        System.out.println("Este Alis in lista?"+ cautaStudent(listaStudenti, alis));
        System.out.println("Este Maria in lista?"+ cautaStudent(listaStudenti, maria));

        //2.5.3
        System.out.println("ex 2.5.3 ");
        Set<Student> setStudenti = new HashSet<>();
        setStudenti.add(student1);
        setStudenti.add(new Student(112, "Popa", "Maria", "TI21/1"));
        System.out.println("afisare studenti:");
        for(Student s: setStudenti){
            System.out.println(s);
        }

        System.out.println("Este Alis in lista?"+ cautaStudent(listaStudenti, alis));
        System.out.println("Este Maria in lista?"+ cautaStudent(listaStudenti, maria));

//ex 5.5.3(lab5)
        System.out.println("\n--- ex 5.5.3 (Studenti Bursieri) ---");
        List<StudentBursieri> listaBursieri = new ArrayList<>();
        listaBursieri.add(new StudentBursieri(1025, "Popa", "Andrei", "ISM141/2", 725.50));
        listaBursieri.add(new StudentBursieri(1024, "Mihalcea", "Ioan", "ISM141/1", 801.10));

        System.out.println("Lista Studenti Bursieri:");
        List<String> liniiDeSalvat = new ArrayList<>();

        for (StudentBursieri sb : listaBursieri) {
            System.out.println(sb);
            liniiDeSalvat.add(sb.toFileFormat() + "," + "CuantumBursa");
        }

        try {
            Files.write(Paths.get("bursieri_out.txt"), liniiDeSalvat);
            System.out.println("Fisierul bursieri_out.txt a fost generat cu succes!");
        } catch (IOException e) {
            System.out.println("Eroare la scrierea fisierului: " + e.getMessage());
        }
    }
    public static boolean cautaStudent(List<Student> lista, Student s){
        return lista.contains(s);


    }
    public static boolean cautaStudentInSet(Set<Student> set, Student s){
        return set.contains(s);
    }
//ex 553

}