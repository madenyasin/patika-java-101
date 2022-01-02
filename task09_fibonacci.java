import java.util.Scanner;

public class task09_fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ilkTerim = 1, ikinciTerim = 1;
        int sonrakiTerim, terimSayisi;

        System.out.print("Fibonacci serisinin terim sayisini giriniz: ");
        terimSayisi = input.nextInt();

        while (terimSayisi >= 1){
            System.out.print(ilkTerim + " ");
            sonrakiTerim = ilkTerim + ikinciTerim;
            ilkTerim = ikinciTerim;
            ikinciTerim = sonrakiTerim;
            terimSayisi--;
        }
        input.close();
    }
}
