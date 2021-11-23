import java.util.Scanner;
/*
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/
public class ex12_dongu01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int sayi = 0, toplam = 0;

        System.out.print("Sayi giriniz: ");
        sayi = input.nextInt();
        boolean sayiTekMi = (sayi % 2 == 0) ? false : true;
        if (!sayiTekMi)
            toplam += sayi;
        while(!sayiTekMi)
        {
            System.out.print("Sayi giriniz: ");
            sayi = input.nextInt();
            if (sayi % 4 == 0)
            {
                toplam += sayi;
                continue;
            }
            sayiTekMi = (sayi % 2 == 0) ? false : true;
            if (!sayiTekMi)
                toplam += sayi;
        }
        System.out.println("Toplam: " + toplam);
        input.close();
    }    
}
