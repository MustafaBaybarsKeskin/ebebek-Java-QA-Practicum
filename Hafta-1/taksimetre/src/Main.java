import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kilometre;
        double tutar, acilisUcreti = 10, kilometreBasiUcret = 2.20;

        Scanner mesafeAl = new Scanner(System.in);

        System.out.print("Kac kilometre gittiniz? ");
        kilometre = mesafeAl.nextInt();

        tutar = kilometre * kilometreBasiUcret;
        tutar += acilisUcreti;

        tutar = tutar < 20 ? 20 : tutar;
        System.out.println("Toplam tutar: " + tutar);
    }
}