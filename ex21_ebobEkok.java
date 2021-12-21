/*
EKOK = (n1*n2) / EBOB

Ödev
Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
 */

import java.util.Scanner;

public class ex21_ebobEkok {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("1. sayi: ");
        int sayi1 = input.nextInt();
        System.out.print("2. sayi: ");
        int sayi2 = input.nextInt();
        int ebob = 0, ekok = 0;

        int kucukSayi;
        if (sayi1 > sayi2)
            kucukSayi = sayi2;
        else
            kucukSayi = sayi1;

        if (sayi1 == 0 || sayi2 == 0){
            System.out.println("Sifirdan (0) farkli pozitif bir sayi giriniz...");
            System.exit(0);
        }
        
        int i = 1;
        while (i <= kucukSayi){
            if (sayi1 % i == 0 && sayi2 % i == 0)
                ebob = i;
            i++;
        }

        ekok = (sayi1 * sayi2) / ebob;

        System.out.println(sayi1 + " - " + sayi2 + " >> Ebob > " + ebob);
        System.out.print(sayi1 + " - " + sayi2 + " >> Ekok > " + ekok);

        input.close();
    }
}