//Average
class  Average_arr{
    public static double posAverage(int[] arr) {
        // Code here
        int count=0;
        double total=0;
        for (int i=0;i<arr.length;i=i+1){
            if (arr[i]>=0){
                total+=arr[i];
                count++;
            }
        }
        return (total/count);
    }
}
