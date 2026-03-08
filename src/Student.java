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
}
