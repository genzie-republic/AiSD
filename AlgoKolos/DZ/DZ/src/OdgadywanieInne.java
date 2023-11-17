import java.util.Random;

public class OdgadywanieInne {
    public static int x=0, y=1000;
    public static Random random=new Random();

    public static int wynik= random.nextInt(x,y);
    public static void main(String[] args) {
        liczba(x,y);
    }

    public static int liczba(int x, int y){
        int polowa=(x+y)/2;
        System.out.println("Czy to jest liczba "+polowa+"?");

        if (polowa==wynik){
            System.out.println("TAK");
            return wynik;
        } else if (polowa>wynik) {
            System.out.println("ZA DUZA");
            y=polowa;
            return liczba(x,y);
        } else {
            System.out.println("ZA MALA");
            x=polowa;
            return liczba(x,y);
        }
    }
}
