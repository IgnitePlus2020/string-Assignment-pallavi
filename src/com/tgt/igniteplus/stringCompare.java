//program to demonstrate ways to compare two Strings in Java
package com.tgt.igniteplus;

public class stringCompare {
    public static void main(String[] args) {
        String string_1 = "target";
        String string_2 = "Target";


        System.out.println("\n using equals() method:");
        System.out.println(string_1 + " equals " + string_2 + ":\t" + string_1.equals(string_2));

        System.out.println("\n using == operator:");
        System.out.print(string_1 + " equals " + string_2 + ":");
        System.out.println(string_1 == string_2);

        System.out.println("\n using equalsIgnoreCase() method:");
        System.out.println(string_1 + " equals " + string_2 + ":\t" + string_1.equalsIgnoreCase(string_2));

        System.out.println("\n using compareTo() method:");
        System.out.println(string_1 + " equals " + string_2 + ":\t" + string_1.compareTo(string_2));


        System.out.println("\n using compareToIgnoreCase() method:");
        System.out.println(string_1 + " equals " + string_2 + ":\t" + string_1.compareToIgnoreCase(string_2));
    }
}
/*output
 using equals() method:
target equals Target:	false
 using == operator:
target equals Target:false
 using equalsIgnoreCase() method:
target equals Target:	true
 using compareTo() method:
target equals Target:	32
 using compareToIgnoreCase() method:
target equals Target:	0
 */
