/*
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
*/
import java.util.Scanner;

public class ex14_dongu03_kombinasyon {

    public static int faktoriyel(int a){
        int sonuc = 1;
        while (a > 1){
            sonuc *= a;
            a--;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int n,r, sonuc;
        System.out.print("Kombinasyonu hesaplanacak sayilari giriniz 'C(n,r)'\nn: ");
        n = input.nextInt();
        System.out.print("r: ");
        r = input.nextInt();
        sonuc = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
        
        System.out.print("C(n,r) --> " + sonuc);
        input.close();
    }
}
