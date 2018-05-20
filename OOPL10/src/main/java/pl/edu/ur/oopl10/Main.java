package src.main.java.pl.edu.ur.oopl10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int wybor;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(" [ 1 ] Zadanie 1");
            System.out.println(" [ 2 ] Zadanie 2");
            System.out.println(" [ 3 ] Zadanie 3");
            System.out.println(" [ 4 ] Zadanie 4");
            System.out.println(" [ 0 ] Wyjscie");
            System.out.print("Wybierz > ");
            wybor = scanner.nextInt();

            switch (wybor) {
                case 1:
                    WprowadzZKonsoli.wprowadzInt();
                    break;
                case 2:
                    Zad2.Zadanie2();
                    break;
                case 3:
                    Zad3_Test test = new Zad3_Test();
                    test.Zad3Test();
                    break;
                case 4:
                    Zad4.zad4();
                    break;
                case 0:
                    break;
            }
        } while (wybor != 0);
    }

}
