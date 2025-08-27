/*
Why i use and contion first? Because the number is 15 if the condition is only divided by 5 
it return Buzz the number recommended by system so we use and condition first(for my understanding purpose)
*/

// User function Template for Java
class Solution5 {
    public static void fizzBuzz(int number) {
        // Write your code here.
        if(number%3==0 && number%5==0){
            System.out.println("FizzBuzz");
        }
        else if(number%5==0){
            System.out.println("Buzz");
        }
        else if(number%3==0){
            System.out.println("Fizz");
        }
        else{
            System.out.println(number);
        }
    }
}
