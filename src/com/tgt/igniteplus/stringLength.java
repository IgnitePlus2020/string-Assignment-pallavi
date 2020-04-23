//program to find the length of the input string
package com.tgt.igniteplus;
import java.util.Scanner;
public class stringLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        int len=str.length();
        System.out.println("Length of the given string  is "+len);
    }
}
/*OUTPUT:
Enter a string
pallavi r m
Length of the given string  is 12
 */
