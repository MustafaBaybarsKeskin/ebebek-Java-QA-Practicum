import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword, resetPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen kullanici adinizi giriniz: ");
        userName = input.nextLine();

        System.out.print("Lutfen parolanizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("username") && password.equals("java12345")) {
            System.out.println("Basarili bir sekilde giris yaptiniz.");
        } else if(password.equals("java12345") == false) {
            System.out.println("Parolanizi sifirlamak ister misiniz?\n1-Evet\n2-Hayir");
            resetPassword = input.nextLine();

            if(resetPassword.equals("1")) {
                System.out.print("Lutfen yeni parolanizi giriniz: ");
                newPassword = input.nextLine();
                if (newPassword.equals(password) || newPassword.equals("java12345")) {
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                } else {
                    System.out.println("Sifre olusturuldu.");
                }
            } else if(resetPassword.equals("2")) {
                System.out.println("Yanlis kullanici adi veya parola.");
            } else {
                System.out.println("Gecersiz secenek!");
            }

        } else {
            System.out.println("Yanlis kullanici adi veya parola.");
        }
        
    }
}