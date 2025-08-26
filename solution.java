//Given two integers, n and m. The task is to check the relation between n and m. Return "lesser" if n < m,  "equal" if n == m, and "greater" if n > m.

//Examples :
/*
Input: n = 4, m = 8
Output: lesser
Explanation: 4 < 8 so print 'lesser'.
*/
class Solution {
    public static String compareNM(int n, int m) {
        // code here
        if(n<m){
          return "lesser";
        }
        else if(n==m){
            return "equal";
        }
        else{
            return "greater";
        }
    }
}
