import java.util.Scanner;

/*Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz. */

public class ex13_dongu02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int sayi, sayac = 1;
        double kuvvet4 = 0, kuvvet5 = 0;

        System.out.print("Bir sayi giriniz: ");
        sayi = input.nextInt();
        while (true)
        {
            kuvvet4 = Math.pow(4, sayac);
            kuvvet5 = Math.pow(5, sayac);

            if (sayi < kuvvet4)
                break;
            System.out.println("4 uzeri " + sayac + " = " + kuvvet4);   
            if (sayi < kuvvet5)
                break;     
            System.out.println("5 uzeri " + sayac + " = " + kuvvet5);
            sayac++;
        }
        input.close();
    }    
}
