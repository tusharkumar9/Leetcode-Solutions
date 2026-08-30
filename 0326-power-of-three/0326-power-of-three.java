class Solution {
    public boolean isPowerOfThree(int n) {
        // 1.T.C O(log₃ n) = O(log n), S.C = O(n)

        // if (n<=0) {
        //     return false;
        // }
        // while(n%3==0) {
        //     n = n/3;
        // }
        // return n==1;

        //2. T.C = O(n), S.C = O(n)
        // use the largest power of 3 within the integer range and check whether n divides it completely
        return n > 0 && 1162261467 % n ==0;
    }
}