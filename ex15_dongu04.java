/*
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
*/
import java.util.Scanner;

public class ex15_dongu04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int taban, ust;
        
        System.out.print("Tabandaki sayi: ");
        taban = input.nextInt();
        System.out.print("Ustteki sayi: ");
        ust = input.nextInt();

        int sonuc = 1;
        for (int i = ust; i >= 1; i--){
            sonuc *= taban;
        }
        System.out.print(taban + " uzeri " + ust + " = " + sonuc);
        input.close();
    }
}
