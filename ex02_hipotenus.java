import java.util.Scanner;

/*
Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
*/

public class ex02_hipotenus
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Dik kenarlarin uzulugunu sirasiyla giriniz: ");
        double dikKenar1 = input.nextDouble();
        double dikKenar2 = input.nextDouble();

        double hipotenus = Math.sqrt(Math.pow(dikKenar1, 2) + Math.pow(dikKenar2, 2));
        System.out.println("Hipotenus uzulugu: " + hipotenus);

        input.close();
    }
}
