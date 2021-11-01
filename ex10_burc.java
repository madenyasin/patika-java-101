import java.util.Scanner;

public class ex10_burc
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        byte ay, gun;
        System.out.print("Kacinci ayda dogdunuz: ");
        ay = input.nextByte();
        System.out.print("Ayin kacinci gunu dogdunuz: ");
        gun = input.nextByte();

        if (ay == 3 && gun >= 21 || ay == 4 && gun <= 20)
            System.out.println("Koc burcu");
        else if (ay == 4 && gun >= 21 || ay == 5 && gun <= 21)
            System.out.println("Boga burcu");
        else if (ay == 5 && gun >= 22 || ay == 6 && gun <= 22)
            System.out.println("Ikizler burcu");
        else if (ay == 6 && gun >= 23 || ay == 7 && gun <= 22)
            System.out.println("Yengec burcu");
        else if (ay == 7 && gun >= 23 || ay == 8 && gun <= 22)
            System.out.println("Aslan burcu");
        else if (ay == 8 && gun >= 23 || ay == 9 && gun <= 22)
            System.out.println("Basak burcu");
        else if (ay == 9 && gun >= 23 || ay == 10 && gun <= 22)
            System.out.println("Terazi burcu");
        else if (ay == 10 && gun >= 23 || ay == 11 && gun <= 21)
            System.out.println("Akrep burcu");
        else if (ay == 11 && gun >= 22 || ay == 12 && gun <= 21)
            System.out.println("Yay burcu");
        else if (ay == 12 && gun >= 22 || ay == 1 && gun <= 21)
            System.out.println("Oglak burcu");
        else if (ay == 1 && gun >= 22 || ay == 2 && gun <= 19)
            System.out.println("Kova burcu");
        else if (ay == 2 && gun >= 20 || ay == 3 && gun <= 20)
            System.out.println("Balik burcu");

        input.close();        
    }
}
