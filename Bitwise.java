//Bitwise Operators
/*
Given three positive integers a, b and c. Your task is to perform some bitwise operations on them as given below:
1. d = a ^ a
2. e = c ^ b
3. f = a & b
4. g = c | (a ^ a)
5. e = ~ e
Note: ^ is for xor.
Then print d e f g space seperately. Move the cursor to the next line after printing.

Examples:

Input: a = 1, b = 2, c = 3
Output: 0 -2 0 3
Explanation: We print d e f g after performing the given operations.
Input: a = 4 , b = 5 , c = 6
Output: 0 -4 4 6
Explanation: We print d e f g after performing the given operations.
*/
//Back-end complete function Template for Java
import java.util.Scanner;

public class Bitwise {
    public static void solve() {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        // Perform all the operations and print in a single line
        int d=a^a;
        int e=c^b;
        int f=a&b;
        int g=c| (a^a);
        e=~e;
        System.out.print(d+" ");
        System.out.print(e+" ");
        System.out.print(f+" ");
        System.out.print(g+" ");
        //System.out.print(e+" ");
    }
}
