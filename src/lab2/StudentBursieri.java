package lab2;
import java.util.Objects;
//553
public class StudentBursieri extends Student {
    private double cuantumBursa;

    public StudentBursieri(Integer numarMatricol, String nume, String prenume, String formatieDeStudiu, double cuantumBursa) {
        super(numarMatricol, nume, prenume, formatieDeStudiu);
        this.cuantumBursa = cuantumBursa;
    }
    @Override
    public String toString() {
        return super.toString() + " [Bursa=" + cuantumBursa + "]";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentBursieri)) return false;
        if (!super.equals(o)) return false;
        StudentBursieri that = (StudentBursieri) o;
        return Double.compare(that.cuantumBursa, cuantumBursa) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cuantumBursa);
    }
}