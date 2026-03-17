package lab2;

import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ex 2.5.1(lab2)
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



        Student student1= new Student(474,"Popa", "Alin", "A123" );
        System.out.println(student1);

    }
}