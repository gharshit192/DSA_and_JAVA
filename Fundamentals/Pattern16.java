/**
 * Pascal Triangle
1
1       1
1       2       1
1       3       3       1
1       4       6       4       1
 */

package Fundamentals;

import java.util.*;

public class Pattern16 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        for(int i =0;i<a;i++){
            int val = 1;
            for(int j=0;j<=i;j++){
                System.out.print(val +"\t");
                val = (val * (i-j) /(j+1)) ;
            }
            System.out.println("\t");
        }
    }
    
}
