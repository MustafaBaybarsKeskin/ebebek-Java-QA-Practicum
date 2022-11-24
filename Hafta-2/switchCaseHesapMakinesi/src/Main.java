import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // number1 ve number2 adlı kullanıcıdan alınacak sayı değişkenleriridir.
        // operation değişkeni kullanıcının yapmak istedği işlemi temsil etmektedir.
        int number1, number2, operation;

        // kullanıcıdan veri alabilmek için input (girdi )Scanner objesini oluşturduk.
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen birinci sayiyi giriniz: ");
        number1 = input.nextInt();

        System.out.print("Lutfen ikinci sayiyi giriniz: ");
        number2 = input.nextInt();

        System.out.print("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\nBir islem seciniz: ");
        operation = input.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Toplama: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Cikarma: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Carpma: " + (number1 * number2));
                break;
            case 4:
                // nested switch-case yapısı.
                switch (number2) {
                    case 0:
                        System.out.println("Bir sayi sifira (0) bolunemez.");
                        break;
                    default:
                        System.out.println("Bolme: " + (number1 / number2));
                        break;
                }
                break;
            default:
                System.out.println("Gecersiz islem sectiniz, lutfen tekrar deneyiniz.");
                break;
        }

    }
}