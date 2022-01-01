/*
Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

Örnek
Basamak Sayısı : 10

 *******************
  *****************
   ***************
    *************
     ***********
      *********
       *******
        *****
         ***
          *
*/
import java.util.Scanner;

public class task07_tersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int basamakSayisi, yildizSayisi;
        System.out.print("Basamak sayisiniz giriniz: ");
        basamakSayisi = input.nextInt();
        yildizSayisi = (basamakSayisi * 2) - 1;

        int i = 1, j = 1,k = 1;
        while (i <= basamakSayisi){
            while (k <= i){
                System.out.print(" ");
                k++;
            }
            while (j <= yildizSayisi){
                System.out.print("*");
                j++;
            }
            System.out.print("\n");

            i++;
            yildizSayisi -= 2;
            j = 1;
            k = 1;
        }
        input.close();
    }
}
