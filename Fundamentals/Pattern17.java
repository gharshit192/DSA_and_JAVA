/**
                                 1
                        1               1
                1               2               1
        1               3               3               1
1               4               6               4               1
 */

package Fundamentals;

import java.util.*;


public class Pattern17 {
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        int spaceCount = a-1;

        for(int i =0 ; i<a ; i++){
            for(int j=0; j<spaceCount ; j++){
                System.out.print("\t");
            }
            int val =1;
            for(int k=0; k<=i ; k++){
                System.out.print(val + "\t\t");
                val =(val * (i-k)) /(k +1);
            }
            spaceCount--;
            System.out.println("\t");
        }
        
    }
}
