/*
Print Pattern Using Input of Row
******
*****
****
***
**
*
**/

package Fundamentals;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
    
        int a = s.nextInt();  
        int starCount = a;
        for(int i = 0; i< a ;i++){
            for(int j= starCount;j >= 0 ; j--){
                System.out.print("  * ");
            }   
        starCount --;
        System.out.println(" ");
        }   
    }
}
