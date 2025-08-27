//This is the way to convert string to int we use Integer.parseInt(variable)

import java.util.*;

class casting2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        // TypeCast to int double it and print
        int value=Integer.parseInt(num);
        int result=value*2;
        System.out.println(result);
    }
}
