/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/
public class ex19_ucgen {

    public static void main(String[] args) {

        int i = 1, j = 1, k = 1;
        int m = 1;
        while (i <= 5){
            j = 1;
            while (j <= (5 - i)){
                System.out.print(" ");
                j++;
            }
            k = 1;
            while (k <= m){
                System.out.print("*");
                k++;
            }
            System.out.print("\n");
            m += 2;
            k = 1;
            i++;
        }
        i = 1;
        m = 7;
        while (i <= 4){
            
            while (j <= i){
                System.out.print(" ");
                j++;
            }
            k = 1;
            while (k <= m){
                System.out.print("*");
                k++;
            }
            m -= 2;
            j = 1;
            System.out.print("\n");
            i++;
        }    
    }
}