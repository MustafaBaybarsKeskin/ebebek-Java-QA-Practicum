import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yaricap, merkezAci;
        double pi = 3.14;

        Scanner degerAl = new Scanner(System.in);

        System.out.print("Lutfen yaricapi giriniz: ");
        yaricap = degerAl.nextInt();

        System.out.print("Lutfen merkez acisini giriniz: ");
        merkezAci = degerAl.nextInt();

        double alan = (pi * (yaricap * yaricap) * merkezAci) / 360;

        System.out.println("Dairenin Alani: " + alan);
    }
}