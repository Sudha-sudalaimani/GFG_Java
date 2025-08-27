//Swap The Numbers
/*
just swapping two variables thats all we create c vatiable that c variable contains a value now a is empty
a variable contains b value now b is empty so b=c (c holds a value)
*/
import java.io.*;
import java.util.*;

class problem2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Write Code to Swap
        int c=a;
        a=b;
        b=c;
        System.out.println(a + " " + b);
    }
}


