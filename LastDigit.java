//Last Digit of a number
/*
n%10---> it gives last digit of the number 123%10-->3,987-->7,-456-->-6
if the number is negative it return the value is negative so we use Math.abs()--> it converts negative number to positive
*/


class LastDigit {
    public static void utility(int n) {

        // just complete below statement
        int ans =Math.abs(n%10);

            // below statement print the result
            System.out.println(ans);
    }
}
