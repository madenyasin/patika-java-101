/*
Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

Senaryo
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22
*/

import java.util.Scanner;

public class task05_minMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        int min = 0, max = 0;
        int n, sayi;
        System.out.print("Sayi adedini giriniz: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i +". sayiyi giriniz: ");
            sayi = input.nextInt();

            if (i == 1){
                min = sayi;
                max = sayi;
            }
            if (sayi > max)
                max = sayi;
            else if (sayi < min)
                min = sayi;
        }

        System.out.print("minimum --> " + min + "\nmaximum --> " + max);
        input.close();
    }
}