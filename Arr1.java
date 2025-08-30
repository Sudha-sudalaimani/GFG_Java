//Java Arrays | Set 1

class Solution {
    public String average(int arr[]) {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i=i+1){
            sum=sum+arr[i];
        }
        double avg=(double)sum/arr.length;
        return String.format("%.2f",avg);//Format function 
    }
}
