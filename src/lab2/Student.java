package lab2;

import java.util.Objects;

public class Student {
    private Integer numarMatricol;
    private String nume;
    private String prenume;
    private String formatieDeStudiu;
    protected double nota;

    public Student(Integer numarMatricol, String prenume, String nume, String formatieDeStudiu) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
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
    //metode pt sortare studenti lab3
    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }
    public String getFormatieDeStudiu() {
        return formatieDeStudiu;
    }
    public double getNota() {
        return nota;
    }

    public String toFileFormat() {
        return numarMatricol + "," + prenume + "," + nume + "," + formatieDeStudiu;
    }
    public String ToString(){
        return "Student {"+ "numarMatricol= " + numarMatricol + "," + "nume=" + nume + "prenume"+ prenume + "," + "formatieDeStudiu=" + formatieDeStudiu + '}';
    }
}