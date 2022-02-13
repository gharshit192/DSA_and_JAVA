/**
 * 
          Draw Pattern
*                                               *
*                                               *
*                                               *
*                       *                       *
*               *               *               *
*       *                               *       *
*                                               *
 */
package Fundamentals;
import java.util.*;

public class Pattern21 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        for(int i =0 ; i<a ; i++){
            for(int j=0; j<a ; j++){
                if(j==0 || j== a-1  || (i==a/2 && j==a/2) || (i+j ==a-1 && i>=a/2) || (i==j && i>=a/2)){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println("\t");
        }
    }
    
}
