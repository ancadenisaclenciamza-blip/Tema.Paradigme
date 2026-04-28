package lab7;

public final class Studentt {
    private final String nume;
    private final String prenume;
    private final int id;
    private final String grupa;
    private final double medie;

    public Studentt(int id, String nume, String prenume, String grupa, double medie) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.medie = medie;
    }

    public String getNume() { return nume; }
    public String getPrenume() { return prenume; }
    public int getId() { return id; }
    public String getGrupa() { return grupa; }
    public double getMedie() { return medie; }

    @Override
    public String toString() {
        return "Student: " + id + ", " + nume + ", " + prenume + ", " + grupa + ", " + medie;
    }
}