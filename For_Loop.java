//For Loop 2
class For_Loop {
    public void printEvenIndices(String s) {
        // code here
        for(int i=0;i<s.length();i=i+1){
            if(i%2==0){
                System.out.print(s.charAt(i));
            }
        }
    }
}
