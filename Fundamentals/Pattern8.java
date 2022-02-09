/**
 *Pattern To Draw
 *
        *
                *
                        *
                                *
                                        *
 */


package Fundamentals;

import java.util.*;
public class Pattern8 {

    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int spaceCount =0;

        for(int i=0; i < a;i++){
            for(int j=0;j <spaceCount;j++){
                System.out.print("\t");
            }
            spaceCount++;
            System.out.println("*\t");
        }
        

    }
    
}
