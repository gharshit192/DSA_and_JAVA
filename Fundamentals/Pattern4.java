/*
Print Pattern Using Input of Row
       * * * * *
         * * * *
           * * *
             * *
               *       
**/

package Fundamentals;
import java.util.Scanner;


public class Pattern4 {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();  
        int starCount = a;
        int spaceCount = 0;
         for(int i =0 ; i < a ; i++){
            for(int j=0; j<spaceCount; j++){
                System.out.print("\t");
            }
            for(int k=0; k < starCount; k++){
                System.out.print("*\t");
            }
            starCount --;
            spaceCount ++;
            System.out.println();
         }
     }
    
}
