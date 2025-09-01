//Count Digits
class Count_Digits {
    public int countDigits(int n) {
        // code here
        String s1=String.valueOf(n);
        int count=0;
        for(int i=0;i<s1.length();i=i+1){
             count=count+1;
        }
        return count;
    }
}
