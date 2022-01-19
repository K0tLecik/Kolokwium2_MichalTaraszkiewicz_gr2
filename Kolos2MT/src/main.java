import java.util.ArrayList;
import java.time.LocalDate;

public class main
{
    public static void main(String[] args)
    {
        ArrayList<Klient> klienci = new ArrayList<>();
        klienci.add(new Klient("człowiek1", LocalDate.of(2022,1,10), 15.50));
        klienci.add(new Klient("człowiek2", LocalDate.of(2022,1,10), 700));
        klienci.add(new Klient("człowiek3", LocalDate.of(2020,1,10), 500));
        klienci.add(new Klient("człowiek4", LocalDate.of(2022,1,10), 500));
        klienci.add(new Klient("człowiek5", LocalDate.of(2022,1,10), 28));
        klienci.add(new Klient("człowiek5", LocalDate.of(2022,1,10), 17600));
        klienci.getNazwa();
        klienci.getDataZakupy();
        klienci.getRachunek();
        Obsługaklienta.set();
        Obsługaklienta.getProcentRabatu();
    }

    public static double discountAmount(Klient k, ArrayList klienci)
    {
        for (int i = 0; i < klienci.size(); i++)
        {
            if(k.getRachunek() > 300)
            {
                return k.getRachunek() * Obsługaklienta.getProcentRabatu();
            }
        }
    }
}
