import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ResztaAZ {
    public static void main(String[] args) throws IOException
    {
        // obiekty do pobierania danych od uzytkownika
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader wejscie = new BufferedReader(str);
        String tekst;

        final int[] M = {500, 200, 100, 50, 20, 10, 5, 2, 1}; // nominaly wyrazone w groszach
        final int[] L = {1,   2,   0,   7,  2,  2,  5, 2, 10}; // max 13.49
        int zl, gr, r, i = 0;

        /**/        int[] zliczaj = new int[M.length];

        System.out.println("Podaj reszte ...");
        System.out.print("zlotych: ");
        tekst = wejscie.readLine(); // pobranie liczby zlotych
        zl = Integer.parseInt(tekst);
        System.out.print("groszy: ");
        tekst = wejscie.readLine(); // pobranie liczby groszy
        gr = Integer.parseInt(tekst);
        System.out.print("Reszta: ");
        r = zl * 100 + gr; // konwersja zdefiniowanej reszty na grosze
        while (r > 0 && i<M.length) // dopoki reszta > 0 ...
        {
            if (r >= M[i] && L[i]>0) // jesli reszta wieksza/rowna danemu nominalowi ...
            {
                System.out.print(M[i] / 100.0 + " "); // wypisz ten nominal
                /**/                zliczaj[i]++;
                r = r - M[i]; // i pomniejsz reszte o wydane monety
                L[i]--;
            }
            else
                i++;
        }
        System.out.println();
        /**/        System.out.println("\nWydane monety:\nnominal\tliczba monet");
        /**/        for(int j=0; j<M.length; j++)
        /**/            System.out.println(M[j]/100.0 + "\t" + zliczaj[j]);

        if(r>0)
            System.out.println("NIE MOZNA WYDAC CALEJ RESZTY! ZOSTALO: "
                    +r/100.0+" zl");
    }
}
