import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yaricap;
        double alan, cevre, pi = 3.14;

        Scanner yaricapAl = new Scanner(System.in);

        System.out.print("Lutfen dairenin alan ve cevre hesabi için yariçapi giriniz: ");
        yaricap = yaricapAl.nextInt();

        alan = pi * yaricap * yaricap;
        cevre = 2 * pi * yaricap;

        System.out.println("Dairenin Alani: " + alan + "\nDairenin Cevresi: " + cevre);

    }
}