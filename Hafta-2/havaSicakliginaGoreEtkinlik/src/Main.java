import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        */

        int heat; // sıcaklık değişkeni

        Scanner getHeat = new Scanner(System.in); // kullanıcıdan veri almak için kullacağımız Scanner sınıfının objesini oluşturma
        System.out.print("Lutfen sicaklik degerini giriniz: ");
        heat = getHeat.nextInt(); // sıcaklığı kullanıcıdan alma

        // koşullar
        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if(heat > 5 && heat < 15) {
            System.out.println("Sinemaya gidebilirsin.");
        } else if(heat > 15 && heat < 25) {
            System.out.println("Piknik yapabilirsin.");
        } else {
            System.out.println("Yüzmeye gidebilirsin.");
        }

    }
}