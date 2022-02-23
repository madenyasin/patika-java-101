/*
Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
 */
public class ex22_palindromSayi {

    public static boolean palindromSayiMi(int n) {
        if (basamakSayisi(n) == 1)
            return true;
        else if (!(tekMi(basamakSayisi(n)))) {
            int donguSayisi = basamakSayisi(n) / 2;
            for (int i = 1; i <= donguSayisi; i++) {
                int lastNum = lastNum(n);
                int firstNum = firstNum(n);
                if (lastNum != firstNum)
                    return false;
                n = lastNumRemove(n);
                n = firstNumRemove(n);
            }
            return true;
        }
        else{
            int donguSayisi = basamakSayisi(n) / 2;
            n = middleNumToZero(n);
            for (int i = 1; i <= donguSayisi; i++) {
                int lastNum = lastNum(n);
                int firstNum = firstNum(n);
                if (lastNum != firstNum)
                    return false;
                n = lastNumRemove(n);
                n = firstNumRemove(n);
            }
            return true;
        }
    }

    public static boolean tekMi(int n) {
        if (n % 2 == 1)
            return true;
        return false;
    }

    public static int basamakSayisi(int n) {
        int basamakSayisi = 0;
        if (n == 0)
            return 0;
        while (true) {
            n = n / 10;
            basamakSayisi++;
            if (n >= 1 && n <= 9) {
                basamakSayisi++;
                break;
            }
            if (n == 0)
                break;
        }
        return basamakSayisi;
    }

    public static int lastNum(int n){
        int lastNum = n % 10;
        return lastNum;
    }

    public static int firstNum (int n){
        n /= Math.pow(10, basamakSayisi(n) - 1);
        return n;
    }

    public static int lastNumRemove(int n){
        n -= lastNum(n);
        n /= 10;
        return n;
    }

    public static int firstNumRemove (int n){
        n -= firstNum(n) * Math.pow(10, basamakSayisi(n) - 1);
        return n;
    }
    
    public static int middleNumToZero(int n){
        int i = 0;
        int silmeAdeti = basamakSayisi(n) / 2;
        int newNumber = 0;
        int basamakSayisi = basamakSayisi(n);
        while (i < silmeAdeti){
            newNumber += lastNum(n) * Math.pow(10, i);
            n = lastNumRemove(n);
            newNumber += firstNum(n) * Math.pow(10, basamakSayisi - (i+1));
            n = firstNumRemove(n);
            i++;
        }
        return newNumber;
    }

    public static void main(String[] args) {
        System.out.println(palindromSayiMi(4004));
    }
}