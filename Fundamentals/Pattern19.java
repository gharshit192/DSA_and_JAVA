/**
*******
 *****
  ***
   *
  ***
 *****
*******
 */

package Fundamentals;
import java.util.*;


public class Pattern19 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        int spaceCount = 0;
        int starCount = a;

        for(int i =1 ; i<=a ; i++){
            for(int j=1; j<=spaceCount ; j++){
                System.out.print(" ");
            }
            for(int k =1; k<=starCount;k++){
                System.out.print("*");
            }
            System.out.println();
            if(i >= a/2+1){
                spaceCount --;
                starCount += 2;
            }else{
                spaceCount ++;
                starCount -=2;
            }
        }
    }

}
