/*
Print Pattern Using Input of Row
Draw In Center Spaces Rest Diamond
*       *       *               *       *       *
*       *                               *       *
*                                               *
*       *                               *       *
*       *       *               *       *       *
**/

package Fundamentals;
import java.util.Scanner;

public class Pattern6 {

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();  
        int starCount = a/2+1;
        int spaceCount = 1;
        for(int i =0 ; i < a ; i++){
            for(int j =0;j<starCount;j++){
                System.out.print("*\t");
            }
            for(int k=0;k<spaceCount;k++){
                System.out.print("\t");
            }
            for(int l=0;l<starCount;l++){
                System.out.print("*\t");
            }
           if(i >= a/2){
            starCount ++;
            spaceCount -=2;
           }else{
            starCount -- ;
            spaceCount +=2;
           }    
            System.out.println();
        }
        
    }
    
}
