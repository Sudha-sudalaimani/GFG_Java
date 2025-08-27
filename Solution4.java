/*
First of all String is mutable so we use stringbuilder that is immutable then we use reverse function that stringbulider we change mutable so we 
use toString() method
*/


class Solution4 {
    static String revStr(String s) {
        // code here
        //StringBuilder result=new StringBuilder();
        return new StringBuilder(s).reverse().toString();
    }
}
