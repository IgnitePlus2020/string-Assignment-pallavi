//Program to check if a given string is empty or not
package com.tgt.igniteplus;
import java.util.Scanner;

public class emptyString {
    public static void main(String[] args) {
        System.out.print("Enter any string:\t");
        Scanner in = new Scanner(System.in);
        String inputString= in.nextLine();
        if (inputString.isEmpty())
            System.out.println("String is empty");
        else
            System.out.println("String is not empty.");
    }
}
/*Output
Enter any string:
String is empty
Enter any string:	ignite
String is not empty.
 */
