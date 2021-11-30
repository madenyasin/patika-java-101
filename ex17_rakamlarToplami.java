/*
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14


*/
import java.util.Scanner;
public class ex17_rakamlarToplami {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();
        int temp = sayi;
        int sonBasamak = 1;
        int toplam = 0;
        while (true){
            sonBasamak = temp % 10;
            toplam += sonBasamak;
            temp -= sonBasamak;
            temp /= 10;
            if (temp == 0){
                System.out.print(sonBasamak + " = " + toplam);
                break;
            }
            else
                System.out.print(sonBasamak + " + ");
            input.close();
        }
    }
}