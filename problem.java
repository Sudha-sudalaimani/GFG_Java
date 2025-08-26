/*
Okay this is a way to get input from the user 
*/

import java.util.*;

class problem {
    public static void main(String args[]) {
        // Implement Scanner Class
        // Take all inputs
        // Print all the values
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float b=sc.nextFloat();
        long c=sc.nextLong();
        byte d=sc.nextByte();
        sc.nextLine();
        String s=sc.nextLine();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
        sc.close();
    }
}
