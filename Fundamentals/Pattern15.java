/**
 5
10
5 x  1 = 5
5 x  2 = 10
5 x  3 = 15
5 x  4 = 20
5 x  5 = 25
5 x  6 = 30
5 x  7 = 35
5 x  8 = 40
5 x  9 = 45
5 x  10 = 50
 */
package Fundamentals;

import java.util.*;

public class Pattern15 {


    public static void main(String [] args){
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int n = s.nextInt();

        for(int i =1; i<=n ;i++){
            System.out.println(a + " x  "+i +" = " +a*i);
        }

    }
    
}
