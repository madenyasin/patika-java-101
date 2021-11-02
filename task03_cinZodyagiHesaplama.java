/*
Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
*/
import java.util.Scanner;

public class task03_cinZodyagiHesaplama
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
             
        int dogumYil, burcNo;

        System.out.print("Dogum yilinizi giriniz: ");
        dogumYil = input.nextInt();

        burcNo = dogumYil % 12;

        switch (burcNo)
        {
            case 0:
                System.out.println("Cin Zodyagi burcunuz: Maymun");
                break;
            case 1:
                System.out.println("Cin Zodyagi burcunuz: Horoz");
                break;
            case 2:
                System.out.println("Cin Zodyagi burcunuz: Kopek");
                break;
            case 3:
                System.out.println("Cin Zodyagi burcunuz: Domuz");
                break;
            case 4:
                System.out.println("Cin Zodyagi burcunuz: Fare");
                break;
            case 5:
                System.out.println("Cin Zodyagi burcunuz: Okuz");
                break;
            case 6:
                System.out.println("Cin Zodyagi burcunuz: Kaplan");
                break;
            case 7:
                System.out.println("Cin Zodyagi burcunuz: Tavsan");
                break;
            case 8:
                System.out.println("Cin Zodyagi burcunuz: Ejderha");
                break;
            case 9:
                System.out.println("Cin Zodyagi burcunuz: Yilan");
                break;
            case 10:
                System.out.println("Cin Zodyagi burcunuz: At");
                break;
            case 11:
                System.out.println("Cin Zodyagi burcunuz: Koyun");
                break;
            default:
                System.out.println("Hatali giris yapildi tekrar deneyin.");
                break;
        }
        input.close();
    }    
}
