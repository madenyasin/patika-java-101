/*
Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;
*/

import java.util.Scanner;

public class ex04_daireAlanCevre
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        final double pi = 3.14;
        double yaricap, cevre, alan;

        System.out.print("Dairenin yaricap uzunlugunu giriniz: ");
        yaricap = input.nextDouble();

        cevre = 2 * pi * yaricap;
        alan = pi * Math.pow(yaricap, 2);
        System.out.println("-----------------------------------------");
        System.out.println("Dairenin alani: " + alan +
        "\nDairenin cevresi: " + cevre);
        System.out.println("-----------------------------------------");


        input.close();

    }    
}
