public class Zad1 {
    public static void main(String[] args) {
        final int N=4;
        System.out.println(zad1(N));
    }

    static int zad1(int n){
        if (n==1 || n==2){
            return 1;
        } else {
            return 3*(zad1(n-1)*zad1(n-2));
        }
    }
}
