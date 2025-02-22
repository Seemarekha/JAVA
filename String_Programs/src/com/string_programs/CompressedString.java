package com.string_programs;

import java.util.Scanner;

public class CompressedString {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scn.next();
        scn.close();  

        System.out.println("Before compression: " + str);

        int[] arr = new int[255];

        for (int i = 0; i < str.length() - 1; i += 2) { 
            char character = str.charAt(i);
            char countChar = str.charAt(i + 1);

            if (Character.isDigit(countChar)) { 
                arr[character] += countChar - '0';
            } else {
                System.out.println("Invalid input format!");
                return;
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < 255; i++) {
            if (arr[i] != 0) {
                ans.append((char) i).append(arr[i]);
            }
        }

        System.out.println("After compression: " + ans.toString());
    }
}



/********* Output *************/

/*
 
 
Enter a string:
a3b4a5c6b2
Before compression: a3b4a5c6b2
After compression: a8b6c6


 */
