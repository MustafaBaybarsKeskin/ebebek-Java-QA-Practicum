import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kenar1, kenar2, kenar3, cevre;
        double u, alan;

        Scanner kenarAl = new Scanner(System.in);

        System.out.print("Lutfen birinci kenarin uzunlugunu giriniz: ");
        kenar1 = kenarAl.nextInt();

        System.out.print("Lutfen ikinci kenarin uzunlugunu giriniz: ");
        kenar2 = kenarAl.nextInt();

        System.out.print("Lutfen ucuncu kenarin uzunlugunu giriniz: ");
        kenar3 = kenarAl.nextInt();

        // Üçgenin çevresi: 2u | u = (kenar1 + kenar2 + kenar3) 2 | alan = u * (u - kenar1) * (u - kenar2) * (u - kenar3)

        cevre = kenar1 + kenar2 + kenar3;
        u = cevre / 2;
        alan = u * (u - kenar1) * (u - kenar2) * (u - kenar3);

        System.out.println("Ucgenin Cevresi: " + cevre + "\nUcgenin Alani: " + alan);
    }
}