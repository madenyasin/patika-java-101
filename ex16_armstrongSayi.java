/*
Armstrong Sayı Nedir ?
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
*/

import java.util.Scanner;

public class ex16_armstrongSayi {

    public static short basamakSayisi(float n) {
        short i = 0;
        while (n >= 1) {
            n /= 10;
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, girilenSayi;
        System.out.print("Bir sayi giriniz: ");
        girilenSayi = input.nextInt();
        short basamakSayisi = basamakSayisi(girilenSayi);
        sayi = girilenSayi;

        int basamakSonuc, i = 1, toplam = 0;
        while (i <= basamakSayisi){
            int sonBasamak = sayi % 10;
            basamakSonuc = (int)Math.pow(sonBasamak, basamakSayisi);
            sayi -= sonBasamak;
            sayi /= 10;
            toplam += basamakSonuc;
            System.out.print("(" + sonBasamak + "^" + basamakSayisi + ") ");
            if (i!=basamakSayisi)
                System.out.print("+ ");
            else   
                System.out.println("--> " + toplam);
            i++;
        }
        
        if (girilenSayi == toplam){
            System.out.print(girilenSayi + " sayisi bir ARMSTRONG sayidir.");
        }
        else{
            System.out.print(girilenSayi + " sayisi bir ARMSTRONG sayi DEGILDIR!");
        }
        input.close();
    }
}