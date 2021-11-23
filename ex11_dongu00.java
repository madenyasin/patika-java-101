import java.util.Scanner;

/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
*/
public class ex11_dongu00
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int sayi, sayac = 0;
        float toplam = 0f;
        
        System.out.print("Pozitif bir sayi giriniz: ");
        sayi = input.nextInt();
        for (int i = 1; i <= sayi; i++)
        {
            if (i % 3 == 0 || i % 4 == 0)
            {    
                toplam += i;
                sayac++;
            }
        }
        System.out.println("Ortalama: " + (toplam/sayac));
        input.close();
    }
}