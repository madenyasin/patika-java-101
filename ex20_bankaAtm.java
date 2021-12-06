import java.util.Scanner;

// switch case ile atm projesi
public class ex20_bankaAtm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0){
            System.out.print("Kullanici adi: ");
            userName = input.nextLine();
            System.out.print("Sifre: ");
            password = input.nextLine();
            
            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("X bankasina hoşgeldiniz ");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();                    

                    switch (select) {
                        case 1:
                            System.out.print("Yatirilacak para miktarini giriniz: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Cekilecek para miktarini giriniz: ");
                            int price2 = input.nextInt();
                            if (price2 <= balance)
                                balance -= price2;
                            else
                                System.out.println("Bakiyeniz yetersiz");
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        default:
                            break;
                    }
                } while (select != 4);
                System.out.print("Tekrar gorusmek uzere...");
                break;
            }
            else{
                right--;
                System.out.println("Kullanici adi veya sifre yanlis. Lutfen tekrar deneyiniz.");
                if (right == 0){
                    System.out.println("Hesabiniz bloke olmustur. Lutfen bankaniz ile iletisime geciniz.");
                }
                else{
                    System.out.println("Kalan deneme hakkiniz: " + right);
                }
            }
        }
        input.close();
    }
}
