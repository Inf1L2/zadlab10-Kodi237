package src.main.java.pl.edu.ur.oopl10;
import java.util.Scanner;

public class Zad2 {
    public static void Zadanie2(){

        int[] tab = new int[10];

        for(int i = 0; i<10; i++){
            tab[i] = 1;
        }

        System.out.println("Wyswietlam tablice: ");
        try{
            for(int i=0; i<100; i++){
                System.out.println("tab["+i+"] = "+tab[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Wystapil blad: ArrayIndexOutOfBoundsException");
        }
    }
}
