import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Girilen 3 sayıyı "küçükten büyüğe" sıralayan program.
        int number1, number2, number3;

        Scanner getData = new Scanner(System.in);

        System.out.print("Lutfen birinci sayiyi giriniz: ");
        number1 = getData.nextInt();

        System.out.print("Lutfen ikinci sayiyi giriniz: ");
        number2 = getData.nextInt();

        System.out.print("Lutfen ucuncu sayiyi giriniz: ");
        number3 = getData.nextInt();

        int max = number3;

        if (number1 > max && number2 > max) {
            if (number1 > number2) {
                max = number1;
            } else {
                max = number2;
            }
        }

        if (number1 > max || number2 > max) {
            if (number1 > number2) {
                max = number1;
            } else {
                max = number2;
            }
        }

        int min = number3;

        if (number1 < min && number2 < min) {
            if (number1 < number2) {
                min = number1;
            } else {
                min = number2;
            }
        }

        if (number1 < min || number2 < min) {
            if (number1 < number2) {
                min = number1;
            } else {
                min = number2;
            }
        }

        int mid = number1 + number2 + number3 - max - min;

        System.out.print(min + " < " + mid + " < " + max);
    }
}