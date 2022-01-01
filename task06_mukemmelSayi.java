/*
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

Senaryolar
Bir sayı giriniz: 28
28 Mükemmel sayıdır
Bir sayı giriniz: 1
1 Mükemmel sayı değildir.
Bir sayı giriniz: 496
496 Mükemmel sayıdır
*/
import java.util.Scanner;

public class task06_mukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0;
        int sayi;
        System.out.print("Bir sayi giriniz: ");
        sayi = input.nextInt();
        int i = sayi;
        while (--i >= 1){
            if (sayi % i == 0){
                toplam += i;
            }
        }
        if (toplam == sayi && toplam != 0)
            System.out.print(sayi + " mukemmel sayidir.");
        else if (sayi > 0)
            System.out.print(sayi + " mukemmel sayi degildir.");
        else
            System.out.print("Lutfen pozitif bir tam sayi giriniz.");

        input.close();
    }
}
