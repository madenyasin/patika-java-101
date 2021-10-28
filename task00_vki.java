/*
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
*/

import java.util.Scanner;

public class task00_vki
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double boy, kilo;
        System.out.print("Boyunuzu metre (m) cinsinden giriniz: ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu kilogram (kg) cinsinden giriniz: ");
        kilo = input.nextDouble();

        double vki = kilo / Math.pow(boy, 2);
        System.out.println("Vucut kitle indeksiniz: " + vki);

        input.close();
    }    
}
