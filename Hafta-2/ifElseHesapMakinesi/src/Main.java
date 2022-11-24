import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2, operation;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen birinci sayiyi giriniz: ");
        number1 = input.nextInt();

        System.out.print("Lutfen ikinci sayiyi giriniz: ");
        number2 = input.nextInt();

        System.out.print("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\nBir islem seciniz: ");
        operation = input.nextInt();

        if (operation == 1) {
            System.out.println("Toplama: " + (number1 + number2));
        } else if(operation == 2) {
            System.out.println("Cikarma: " + (number1 - number2));
        } else if (operation == 3) {
            System.out.println("Carpma: " + (number1 * number2));
        } else if (operation == 4) {
            if (number2 != 0) {
                System.out.println("Bolme: " + (number1 / number2));
            } else {
                System.out.println("Bir sayi sifira (0) bolunemez.");
            }
        } else {
            System.out.println("Yanlis secim yaptiniz, lutfen tekrar deneyin.");
        }
    }
}