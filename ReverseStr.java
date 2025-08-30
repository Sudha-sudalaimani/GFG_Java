//Java Strings | Set 1
// User function template for Java

class ReverseStr {
    static String conRevstr(String S1, String S2) {
        // code here
        String ans=S1+S2;
        StringBuilder result=new StringBuilder(ans);
        result.reverse();
        String reversed=result.toString();
        return reversed;
    }
}
