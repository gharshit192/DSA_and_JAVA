/*
Draw This
                                                *
                                        *               *
                                *                               *
                        *                                               *
                *                                                               *
        *                                                                               *
*                                                                                               *
        *                                                                               *
                *                                                               *
                        *                                               *
                                *                               *
                                        *               *
                                                *


**/



package Fundamentals;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();  
        int spaceCount = a/2;
        int midSpaceCount = -1;
        for(int i =0 ; i < a ; i++){
            for(int j =0;j<spaceCount;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for(int k =0;k<midSpaceCount;k++){
                System.out.print("\t");
            }
            if(i==0 || i== a-1){
                System.out.println();
            }else{
                System.out.println("*\t");

            }
            if(i >= a/2){
            spaceCount ++;
            midSpaceCount -=2;
            }else{
            spaceCount -- ;
            midSpaceCount +=2;
           }    
        }
        
    }
    
}
