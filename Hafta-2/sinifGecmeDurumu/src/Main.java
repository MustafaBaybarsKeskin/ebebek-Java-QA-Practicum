import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, turkish, chemi, music, lessonCount = 5;
        double avarege = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen matematik notunuzu giriniz: ");
        math = input.nextInt();
        if (math >= 0 && math <= 100) avarege+=math; else lessonCount--;

        System.out.print("Lutfen fiizk notunuzu giriniz: ");
        physics = input.nextInt();
        if (physics >= 0 && physics <= 100) avarege+=physics; else lessonCount--;

        System.out.print("Lutfen Turkce notunuzu giriniz: ");
        turkish = input.nextInt();
        if (turkish >= 0 && turkish <= 100) avarege+=turkish; else lessonCount--;

        System.out.print("Lutfen kimya notunuzu giriniz: ");
        chemi = input.nextInt();
        if (chemi >= 0 && chemi <= 100) avarege+=chemi; else lessonCount--;

        System.out.print("Lutfen muzik notunuzu giriniz: ");
        music = input.nextInt();
        if (music >= 0 && music <= 100) avarege+=music; else lessonCount--;

        avarege = avarege / lessonCount;

        if(avarege <= 55) {
            System.out.println("Sinifta kaldiniz, seneye tekrar gorusmek uzere!");
        } else {
            System.out.println("tebrikler, sinifi gectiniz!");
        }

        System.out.println("Ortalamaniz: " + avarege);
    }
}