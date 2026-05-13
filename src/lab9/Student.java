package lab9;

public class Student {
    int id;
    String prenume;
    String nume;
    String grupa;
    double nota;

    public Student(int id, String prenume, String nume, String grupa, double nota) {
        this.id = id;
        this.prenume = prenume;
        this.nume = nume;
        this.grupa = grupa;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return prenume + " " + nume + " (Nota: " + nota + ")";
    }
}