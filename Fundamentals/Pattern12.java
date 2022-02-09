/*
Draw
1
2       3
4       5       6
7       8       9       10
11      12      13      14      15
16      17      18      19      20      21
**/

package Fundamentals;

import java.util.*;


public class Pattern12 {

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int noCount =1;
        int inc = 1;

        for(int i =1 ; i <= a ; i++){
            for(int j=0; j<noCount; j++){
                System.out.print(inc++ + "\t");
            }
            System.out.println();
            noCount++;

        }
    }
    
}
