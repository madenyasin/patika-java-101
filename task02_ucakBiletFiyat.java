/*
km basina fiyat = 0.10 TL
Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/

import java.util.Scanner;

public class task02_ucakBiletFiyat
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        float kmFiyat = 0.10f, maxFiyat, indirimliFiyat, indirimTutari, indirimOrani = 0f;
        float mesafe;
        byte yas, yolculukTipi;

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        mesafe = input.nextFloat();
        System.out.print("Yasinizi giriniz: ");
        yas = input.nextByte();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidis Donus ): ");
        yolculukTipi = input.nextByte();

        if (!(mesafe > 0) || !(yas > 0) || !(yolculukTipi == 1 || yolculukTipi == 2))
            System.out.println("Hatali veri girdiniz!");
        else
        {
            maxFiyat = kmFiyat * mesafe * yolculukTipi;
            if (yas < 12)
                indirimOrani = 0.50f;
            else if (yas < 24)
                indirimOrani = 0.10f;
            else if (yas > 65)
                indirimOrani = 0.30f;
            else
                indirimOrani = 0f;
        
            indirimTutari = maxFiyat * indirimOrani;
            indirimliFiyat = maxFiyat - indirimTutari;
            maxFiyat = indirimliFiyat;

            if (yolculukTipi == 2)
                indirimOrani = 0.20f;
            else 
                indirimOrani = 0f;
            
            indirimTutari = maxFiyat * indirimOrani;
            indirimliFiyat = maxFiyat - indirimTutari;
                
            System.out.println("Toplam tutar: " + indirimliFiyat + " TL");

            input.close();
        }
    }    
}
