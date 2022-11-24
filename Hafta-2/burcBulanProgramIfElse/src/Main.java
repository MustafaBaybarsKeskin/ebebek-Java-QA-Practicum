import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Koç Burcu : 21 Mart - 19 Nisan
        Boğa Burcu : 20 Nisan - 20 Mayıs
        İkizler Burcu : 21 Mayıs - 20 Haziran
        Yengeç Burcu : 21 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 19 Ocak
        Kova Burcu : 20 Ocak - 18 Şubat
        Balık Burcu : 19 Şubat - 20 Mart
         */

        int day, month;
        String sign = "";

        Scanner getData = new Scanner(System.in);

        System.out.print("Lutfen ay giriniz: ");
        month = getData.nextInt();

        System.out.print("Lutfen gun giriniz: ");
        day = getData.nextInt();

        if (month ==  1) {
            if (day < 20)
                sign = "Oglak";
            else
                sign = "Kova";
        }
        else if (month == 2) {
            if (day < 19)
                sign = "Kova";
            else
                sign = "Balik";
        }
        else if(month == 3) {
            if (day < 21)
                sign = "Balik";
            else
                sign = "Koc";
        }
        else if (month == 4) {
            if (day < 20)
                sign = "Koc";
            else
                sign = "Boga";
        }
        else if (month == 5) {
            if (day < 21)
                sign = "Boga";
            else
                sign = "Ikizler";
        }
        else if( month == 6) {
            if (day < 21)
                sign = "Ikizler";
            else
                sign = "Yengec";
        }
        else if (month == 7) {
            if (day < 23)
                sign = "Yengec";
            else
                sign = "Aslan";
        }
        else if( month == 8) {
            if (day < 23)
                sign = "Aslan";
            else
                sign = "Basak";
        }
        else if (month == 9) {
            if (day < 23)
                sign = "Basak";
            else
                sign = "Terazi";
        }
        else if (month == 10) {
            if (day < 23)
                sign = "Terazi";
            else
                sign = "Akrep";
        }
        else if (month == 11) {
            if (day < 22)
                sign = "Akrep";
            else
                sign = "Yay";
        }
        else if (month == 12) {
            if (day < 22)
                sign = "Yay";
            else
                sign = "Oglak";
        } else {
            System.out.println("Gecersiz gun girdiniz");
        }

        System.out.println(sign + " burcu");
    }
}