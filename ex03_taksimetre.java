/*
Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
*/

import java.util.Scanner;

public class ex03_taksimetre
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double mesafe;
        System.out.print("Gidilecek yolun kac KM? ");
        mesafe = input.nextDouble();

        int acilisUcreti = 10;
        double ucretKM = 2.20;
        double ucretFinal = acilisUcreti + (mesafe * ucretKM);
        ucretFinal = (ucretFinal < 20) ? 20 : ucretFinal;
        System.out.println("Odemeniz gereken tutar: " + ucretFinal + " TL");

        input.close();
    }    
}
