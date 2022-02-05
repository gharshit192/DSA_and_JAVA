/*
Print Pattern Using Input of Row
*
**
***
****
*****
******
**/
package Fundamentals;

import java.util.Scanner;

class Pattern1 {

    public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       int a = s.nextInt();  
       int starCount = 1;
        for(int i =0 ; i <= a ; i++){
            for(int j=0; j< starCount; j++){
                System.out.print("  * ");
            }
            starCount ++;
            System.out.println();
        }
    }

}