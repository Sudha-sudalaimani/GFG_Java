//sum of array
class Solution {
    public static int arraySum(int[] arr) {
        // code here
        int count=0;
        for (int i=0;i<arr.length;i=i+1){
            count+=arr[i];
        }
        return count;
    }
}
