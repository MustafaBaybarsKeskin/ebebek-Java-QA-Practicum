import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy;
        int kilo;

        Scanner degerAl = new Scanner(System.in);

        System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz: ");
        boy = degerAl.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz: ");
        kilo = degerAl.nextInt();

        double kitleEndeksi = kilo / (boy * boy);

        System.out.println("Vucut Kitle Endeksiniz: " + kitleEndeksi);
    }
}