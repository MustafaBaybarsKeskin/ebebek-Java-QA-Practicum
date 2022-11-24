import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

        İpucu
        Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
        Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
        İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
        Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
        Toplam Tutar = (135-27)* 2 = 216 TL
         */

        int distance, age, travelType;
        double normalPrice, total = 0, discountByAge, discountByTravelType;

        Scanner getData = new Scanner(System.in);

        System.out.print("Mesafeyi km turunden giriniz: ");
        distance = getData.nextInt();

        System.out.print("Lutfen yasinizi giriniz: ");
        age = getData.nextInt();

        System.out.print("1 => Tek Yon\n2 => Cift Yon\nLutfen yolculuk tipini giriniz: ");
        travelType = getData.nextInt();

        normalPrice = distance * 0.1;

        if ((distance < 0 || age < 0) || (travelType != 1 && travelType != 2)) {
            System.out.println("Hatali veri girdiniz!");
            return;
        } else if (age < 12) {
            discountByAge = normalPrice * 0.5;
            total = normalPrice - discountByAge;
        } else if (age > 12 && age < 24) {
            discountByAge = normalPrice * 0.1;
            total = normalPrice - discountByAge;
        } else if (age > 65) {
            discountByAge = normalPrice * 0.3;
            total = normalPrice - discountByAge;
        } else {
            total = normalPrice;
        }

        if (travelType == 2) {
            discountByTravelType = total * 0.20;
            total = (total - discountByTravelType) * 2;
        }

        System.out.println("Toplam tutar: " + total);
    }
}