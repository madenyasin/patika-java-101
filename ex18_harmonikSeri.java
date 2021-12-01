// Java ile girilen sayının harmonik serisini bulan program yazacağız.

import java.util.Scanner;

public class ex18_harmonikSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi giriniz: ");
        int n = input.nextInt();
        double toplam = 0;
        for (int i = 1; i <= n; i++)
            toplam += 1.0 / i;
        System.out.print("Sonuc: " + toplam);
        input.close();
    }
}
