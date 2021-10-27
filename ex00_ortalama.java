import java.util.Scanner;

public class ex00_ortalama 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        float mat, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik: ");
        mat = input.nextFloat();

        System.out.print("Fizik: ");
        fizik = input.nextFloat();

        System.out.print("Kimya: ");
        kimya = input.nextFloat();

        System.out.print("Turkce: ");
        turkce = input.nextFloat();

        System.out.print("Tarih: ");
        tarih = input.nextFloat();

        System.out.print("Muzik: ");
        muzik = input.nextFloat();

        float ortalama = (mat+fizik+kimya+turkce+tarih+muzik) / 6;
        
        System.out.println("Ortalama --> " + ortalama);

        String sonuc = ortalama > 60 ? "Sinifta kaldi" : "Sinifi gecti";
        System.out.println(sonuc);
    }
}