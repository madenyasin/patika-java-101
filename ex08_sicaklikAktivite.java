/*

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

*/

import java.util.Scanner;

public class ex08_sicaklikAktivite
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        short heat;
        
        System.out.print("Sicakligi giriniz: ");
        heat = input.nextShort();

        if (heat < 5)
            System.out.println("Kayak yapabilirsin.");
        else if (heat <= 15)
            System.out.println("Sinemaya gidebilirsin.");
        else if (heat <= 25)
            System.out.println("Piknige gidebilirsin.");
        else
            System.out.println("Yuzmeye gidebilirsin.");

        input.close();
    }    
}
