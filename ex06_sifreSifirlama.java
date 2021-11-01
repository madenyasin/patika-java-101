import java.util.Scanner;

public class ex06_sifreSifirlama
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String userName, password;
        String newPassword;
        System.out.print("Kullanici adi: ");
        userName = input.nextLine();
        System.out.print("Sifre: ");
        password = input.nextLine();

        if (userName.equals("Patika") && password.equals("java101"))
        {
            System.out.println("Giris yapildi.");
        }
        else
        {
            System.out.println("Kullanici adi veya sifre hatali\nSifrenizi sifirlamak istiyorsanız 'E' tusuna basiniz.");
            String cevap = input.nextLine();
            if (cevap.equals("E") || cevap.equals("e"))
            {
                System.out.print("Yeni sifreyi giriniz: ");
                newPassword = input.nextLine();

                if (newPassword.equals("java101"))
                    System.out.println("Sifre olusturulamadi, lutfen yeni sifre giriniz.");
                else
                {    
                    System.out.println("Sifre olusturuldu.");
                    password = newPassword;
                }
            }
        }

        input.close();
    }    
}