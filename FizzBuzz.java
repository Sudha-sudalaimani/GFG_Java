import java.util.*;

public class FizzBuzz {
    public static void main(String args[]) {
        // Your Code Here
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       if(num%3==0 && num%5==0){
           System.out.println("FizzBuzz");
       }
       else if(num%3==0){
            System.out.println("Fizz");
       }
       else if(num%5==0){
            System.out.println("Buzz");
       }
       else{
           System.out.println(num);
       }
    }
}
