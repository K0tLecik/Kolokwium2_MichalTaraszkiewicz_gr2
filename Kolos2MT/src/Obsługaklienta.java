import java.time.LocalDate;
import java.util.ArrayList;
public class Obsługaklienta
{
    static double procentRabatu;
    private ArrayList<Klient> Klienci = new ArrayList<>();

    public Obsługaklienta(double procentRabatu, ArrayList Klienci)
    {
        this.procentRabatu = procentRabatu;
        this.Klienci = Klienci;
    }

    public static void set()
    {
        procentRabatu = 0.05;
    }

    public double getProcentRabatu()
    {
        return procentRabatu;
    }
}
