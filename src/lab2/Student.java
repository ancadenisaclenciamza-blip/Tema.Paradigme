package lab2;

import java.util.Objects;

public class Student {
    private Integer numarMatricol;
    private String nume;
    private String prenume;
    private String formatieDeStudiu;

    public Student(Integer numarMatricol, String nume,  String prenume, String formatieDeStudiu) {
        this.numarMatricol = numarMatricol;
        this.nume = nume;
        this.prenume=prenume;
        this.formatieDeStudiu=formatieDeStudiu;
    }
    @Override
    public String toString() {
        return "Student{" + "numarMatricol=" + numarMatricol + ", nume=" + nume + ", prenume=" + prenume  + ", formatieDeStudiu=" + formatieDeStudiu + '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(nume, student.nume) && Objects.equals(prenume, student.prenume)&&Objects.equals(formatieDeStudiu, student.formatieDeStudiu);

    }
    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume, formatieDeStudiu);

    }

    public String ToString(){
        return "Student {"+ "numarMatricol= " + numarMatricol + "," + "nume=" + nume + "prenume"+ prenume + "," + "formatieDeStudiu=" + formatieDeStudiu + '}';
    }
}
