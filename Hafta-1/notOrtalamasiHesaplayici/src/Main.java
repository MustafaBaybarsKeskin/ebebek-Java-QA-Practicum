import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner notAl = new Scanner(System.in);

        System.out.println("Lutfen matematik notunuzu giriniz: ");
        matematik = notAl.nextInt();

        System.out.println("Lutfen fizik notunuzu giriniz: ");
        fizik = notAl.nextInt();

        System.out.println("Lutfen kimya notunuzu giriniz: ");
        kimya = notAl.nextInt();

        System.out.println("Lutfen Turkce notunuzu giriniz: ");
        turkce = notAl.nextInt();

        System.out.println("Lutfen tarih notunuzu giriniz: ");
        tarih = notAl.nextInt();

        System.out.println("Lutfen muzik notunuzu giriniz: ");
        muzik = notAl.nextInt();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Ortalamaniz: " + ortalama);

        String sonuc = ortalama > 60 ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(sonuc);
    }
}