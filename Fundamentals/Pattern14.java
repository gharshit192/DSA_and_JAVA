/*
FIBINACI Series

0  
1  1 
2  3  5  
8  13  21  34
**/

package Fundamentals;

import java.util.*;


public class Pattern14 {

    public static void main(String [] args){

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int i =0;
        int j=1;
        int sum =0;

        int min =1;
        for(int k =0 ;k<a;k++){
            for(int l =0 ;l < min; l++){
                System.out.print(i +"\t");
                sum = i+ j;
                i =j;
                j = sum;
            }
            System.out.println();
            min ++;
        }

    }
    
}
