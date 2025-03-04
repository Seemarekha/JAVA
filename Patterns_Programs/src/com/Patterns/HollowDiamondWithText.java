package com.Patterns;

import java.util.Scanner;

public class HollowDiamondWithText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number for diamond size : ");
        int n = sc.nextInt();
        sc.close();

        if (n % 2 == 0 || n < 13) {
            System.out.println("Please enter an odd number >= 13.");
            return;
        }

        int mid = n / 2;
        String text = "HELLO WORLD";
        int textStartRow = mid; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (i + j == mid || j - i == mid || i - j == mid || i + j == mid * 3) {
                    System.out.print("*");
                } 
                
                else if (i == textStartRow && j >= mid - (text.length() / 2) && j < mid + (text.length() + 1) / 2) {
                    System.out.print(text.charAt(j - (mid - (text.length() / 2))));
                } 
               
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



/**************** Output **********************/

/*


Enter an odd number for diamond size : 15


            *       
           * *      
          *   *     
         *     *    
        *       *   
       *         *  
      *           * 
     * HELLO WORLD *
      *           * 
       *         *  
        *       *   
         *     *    
          *   *     
           * *      
            *       


*/
