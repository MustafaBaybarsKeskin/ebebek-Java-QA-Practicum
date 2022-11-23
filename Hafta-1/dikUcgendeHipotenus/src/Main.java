import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kenar1, kenar2;
        double hipotenus;

        Scanner kenarAl = new Scanner(System.in);

        System.out.println("Lutfen birinci kenarin uzunlugunu giriniz: ");
        kenar1 = kenarAl.nextInt();

        System.out.println("Lutfen ikinci kenarin uzunlugunu giriniz: ");
        kenar2 = kenarAl.nextInt();

        hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        System.out.println("Hipotenus: " + hipotenus);
    }
}