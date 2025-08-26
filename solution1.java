/*
This program i undersatnd how float data type works
*/

class Solution1 {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        // code here
        ArrayList<Float> result=new ArrayList<>();
        float c=a/b;
        result.add(c);
        float rounded=Math.round(c*1000)/1000.0f;
        result.add(rounded);
        return result;
    }
}
