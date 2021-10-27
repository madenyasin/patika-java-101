/*
KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
*/

import java.util.Scanner;

public class ex01_kdv 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("KDV'siz fiyati giriniz: ");
        double kdvsizFiyat = input.nextDouble();

        double kdvOran = (kdvsizFiyat < 1000 && kdvsizFiyat > 0) ? 0.18 : 0.08;
        double kdvTutari = kdvsizFiyat * kdvOran;
        double kdvliFiyat = kdvsizFiyat + kdvTutari;

        System.out.println("KDV'siz fiyat: " + kdvsizFiyat + 
        "\nKDV orani: " + kdvOran + 
        "\nKDV tutari " + kdvTutari + 
        "\nKDV'li fiyat " + kdvliFiyat);

        input.close();
    }    
}
