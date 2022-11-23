import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutFiyat = 2.14,
               elmaFiyat = 3.67,
               domatesFiyat = 1.11,
               muzFiyat = 0.95,
               patlicanFiyat = 5.00,
                tutar;

        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;

        Scanner kiloAl = new Scanner(System.in);

        System.out.print("Armut Kac Kilo? ");
        armutKilo = kiloAl.nextInt();

        System.out.print("Elma Kac Kilo? ");
        elmaKilo = kiloAl.nextInt();

        System.out.print("Domates Kac Kilo? ");
        domatesKilo = kiloAl.nextInt();

        System.out.print("Muz Kac Kilo? ");
        muzKilo = kiloAl.nextInt();

        System.out.print("Patlican Kac Kilo? ");
        patlicanKilo = kiloAl.nextInt();

        tutar = (armutFiyat * armutKilo) + (elmaFiyat * elmaKilo) + (domatesFiyat * domatesKilo) + (muzFiyat * muzKilo) + (patlicanFiyat * patlicanKilo);

        System.out.print("Toplam Tutar: " + tutar + " TL");
    }
}