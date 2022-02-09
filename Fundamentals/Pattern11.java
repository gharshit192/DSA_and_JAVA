/**
 Draw Pattern
*                               *
        *               *
                *
        *               *
*                               *
 */


package Fundamentals;

import java.util.*;

public class Pattern11 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        for(int i=0;i<a;i++){
            for(int k=0;k<a;k++){
                if(i==k || i+k == a-1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            } 
            System.out.println();
        }

    }


    
}
