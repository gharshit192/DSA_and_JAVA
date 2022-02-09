/**
  Draw Pattern 
                                           *
                                *
                        *
                *
        *
 */


package Fundamentals;

import java.util.*;

public class Pattern10 {

    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int startcount = a;

        for(int i=0;i<a;i++){
            for(int k=0;k<a;k++){
                if(i+k == a-1){
                    System.out.print("\t*");
                }else{
                    System.out.print("\t");
                }
            } 
            System.out.println();
        }
    }



    
}
