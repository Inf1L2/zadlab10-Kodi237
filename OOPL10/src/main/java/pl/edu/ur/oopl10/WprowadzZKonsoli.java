package src.main.java.pl.edu.ur.oopl10;

import java.util.Scanner;

public class WprowadzZKonsoli {

    public static void wprowadzInt(){

        Scanner in = new Scanner(System.in);
        int liczba;

        System.out.println("Podaj liczbe calkowitą: ");
        try{
            liczba = in.nextInt();
            System.out.println("Podano liczbę: "+liczba);
        }catch (Exception c){
            System.out.println("Niepoprawny format!");
        }
    }

    public static void wprowadzShort(){

        Scanner in = new Scanner(System.in);
        short liczba;

        System.out.println("Podaj liczbe calkowitą: ");
        try{
            liczba = in.nextShort();
            System.out.println("Podano liczbę: "+liczba);
        }catch (Exception c){
            System.out.println("Podana liczba jest poza zakresem short int");
        }
    }

    public static void wprowadzLong(){

        Scanner in = new Scanner(System.in);
        long liczba;

        System.out.println("Podaj liczbe calkowitą: ");
        try{
            liczba = in.nextLong();
            System.out.println("Podano liczbę: "+liczba);
        }catch (Exception c){
            System.out.println("Podana liczba jest poza zakresem long");
        }
    }


}
