/*
Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

Senaryo
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
*/

import java.util.Scanner;

public class task08_asalSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1, j = 1;
        while (i <= 100){
            if (i == 1)
                i++;
            while (j <= i){
                if (j == i){
                    System.out.print(j + " ");
                }
                if ((i % j) == 0 && (j != 1)){
                    j++;
                    break;
                }
                j++;
            }
            j = 1;
            i++;
        }
        input.close();
    }
}
