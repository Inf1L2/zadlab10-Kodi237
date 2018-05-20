package src.main.java.pl.edu.ur.oopl10;

public class Zad3 extends java.lang.Exception{
    public void zad3(){
        double dzielna = 10;
        double dzielnik = 0;
        double wynik;

        try {
            wynik = dzielna / dzielnik;
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException (dzielenie przez zero)\n\n");
        }
    }
}
