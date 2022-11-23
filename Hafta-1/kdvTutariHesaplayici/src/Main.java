import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double para, kdvOrani, kdvliPara;

        Scanner paraAl = new Scanner(System.in);

        System.out.println("Lutfen aldiginiz para degerini giriniz: ");
        para = paraAl.nextDouble();

        kdvOrani = para > 0 && para < 1000 ? 0.18 : 0.08;

        kdvliPara = para + (para * kdvOrani);

        System.out.println("KDV'siz Fiyat: " + para);
        System.out.println("KDV orani: " + kdvOrani);
        System.out.println("KDV'li Fiyat: " + kdvliPara);
        System.out.println("KDV tutari: " + (kdvliPara - para));
    }
}