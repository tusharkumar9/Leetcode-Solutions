class Solution {
    public static int Sum( int n) {
        int last_digit = 0;
        int sum = 0;
        while(n!=0) {
            last_digit = n%10;
            n/=10;
            sum = sum + last_digit;
        }
        return sum;
    }
    public int addDigits(int num) {
        while(num>9) {
            num = Sum(num);
        }
        return num;
    }
}