//The Else if Statement
/*
Examples:

Input: number = 9
Output: Small
Explanation: Here, the else if condition will work as 9 is smaller than 10.
Input: number = 101
Output: Big
Explanation: 101 is greater than 100, so our if statement works and we print Big.
Input: number = 30
Output: Number
Explanation: 30 is neither greater than 100, nor smaller than 10, so the else statement works here.
*/
class Solution {
    public static void utility(int number) {
        // Write the if, else if, else statements below
        if(number>100){
            System.out.println("Big");
        }
        else if(number<10){
            System.out.println("Small");
        }
        else{
            System.out.println("Number");
        }
    }
}
