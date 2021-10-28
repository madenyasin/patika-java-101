/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL

Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
*/

import java.util.Scanner;

public class task01_manavKasaProgrami
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double fArmutKG = 2.14, fElmaKG = 3.67, fDomatesKG = 1.11, fMuzKG = 0.95, fPatlicanKG = 5;
        double armutKG, elmaKG, domatesKG, muzKG, PatlicanKG;

        System.out.print("Armut kac kg? ");
        armutKG = input.nextDouble();
        System.out.print("Elma kac kg? ");
        elmaKG = input.nextDouble();
        System.out.print("Domates kac kg? ");
        domatesKG = input.nextDouble();
        System.out.print("Muz kac kg? ");
        muzKG = input.nextDouble();
        System.out.print("Patlican kac kg? ");
        PatlicanKG= input.nextDouble();

        double toplamTutar = (armutKG*fArmutKG) + (elmaKG*fElmaKG) + (domatesKG*fDomatesKG) + (muzKG*fMuzKG) + (PatlicanKG*fPatlicanKG);
        System.out.println("Toplam tutar: " + toplamTutar + " TL");

        input.close();
    }    
}
