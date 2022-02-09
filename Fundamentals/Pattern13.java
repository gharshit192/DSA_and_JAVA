/*
FIBINACI Series

0  1  1  2  3  5  8  13  21
**/

package Fundamentals;

import java.util.*;


public class Pattern13 {

    public static void main(String [] args){

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int i =0;
        int j=1;
        int sum =0;

        while(i <=25){
            System.out.print(i +"\t");
            sum = i+ j;
            i =j;
            j = sum;
        }

    }
    
}
