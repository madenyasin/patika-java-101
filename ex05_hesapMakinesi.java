// switch-case kullanarak basit hesap makinesi yapınız

import java.util.Scanner;

public class ex05_hesapMakinesi
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        float sayi1, sayi2, sonuc = 0;
        int islem;

        System.out.print("1. sayiyi giriniz: ");
        sayi1 = input.nextFloat();
        System.out.print("2. sayiyi giriniz: ");
        sayi2 = input.nextFloat();
        System.out.println("1) Toplama\n2) Cikarma\n3) Carpma\n4) Bolme");
        System.out.println("Yapmak istediginiz islemi seciniz:");
        islem = input.nextInt();

        switch (islem) 
        {
            case 1:
                sonuc = sayi1 + sayi2;
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                break;
            case 4:
                sonuc = sayi1 / sayi2;
                break;
            default:
                System.out.println("Hatali giris yapildi! Tekrar deneyin...");
                break;
        }

        System.out.println("Sonuc: " + sonuc);
        input.close();
    }    
}
