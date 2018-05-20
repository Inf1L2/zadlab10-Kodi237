package src.main.java.pl.edu.ur.oopl10;

public class Zad3_Test {
    public void Zad3Test(){

        Zad3 Throw = new Zad3();

        try {
            Throw.zad3();
            System.out.println("Klasa przechwycila i obsluzyla wyjatek (ArithmeticException)");
        }
        catch(ArithmeticException e) {
            System.out.println("Poprzednia klasa nie przechwycila wyjatku (ArithmeticException)");
        }
    }
}
