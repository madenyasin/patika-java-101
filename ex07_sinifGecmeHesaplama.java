/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
*/

import java.util.Scanner;

public class ex07_sinifGecmeHesaplama
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        float mat, fizik, turkce, kimya, muzik, toplamNot, ortalama;
        byte dersSayisi = 5;

        System.out.print("Matematik notu: ");
        mat = input.nextFloat();
        System.out.print("Turkce notu: ");
        turkce = input.nextFloat();
        System.out.print("fizik notu: ");
        fizik = input.nextFloat();
        System.out.print("kimya notu: ");
        kimya = input.nextFloat();
        System.out.print("Muzik notu: ");
        muzik = input.nextFloat();

        toplamNot = mat + fizik + turkce + kimya + muzik;
        if (mat < 0 || mat > 100)
        {
            dersSayisi--;
            toplamNot -= mat;
        }
        if (fizik < 0 || fizik > 100)
        {
            dersSayisi--;
            toplamNot -= fizik;
        }
        if (turkce < 0 || turkce > 100)
        {
            dersSayisi--;
            toplamNot -= turkce;
        }
        if (kimya < 0 || kimya > 100)
        {
            dersSayisi--;
            toplamNot -= kimya;
        }
        if (muzik < 0 || muzik > 100)
        {
            dersSayisi--;
            toplamNot -= muzik;
        }

        ortalama = toplamNot / dersSayisi;
        
        if (ortalama >= 55)
            System.out.println("Ortalamaniz: " + ortalama + " Tebrikler sinifi gectiniz :)");
        else
            System.out.println("Ortalamaniz: " + ortalama + " Maalesef sinifi gecemediniz :/");

        input.close();
    }    
}
