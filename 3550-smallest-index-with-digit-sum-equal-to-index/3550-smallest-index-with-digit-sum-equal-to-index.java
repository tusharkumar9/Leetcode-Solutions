class Solution {
    public static int sum(int num){
        int s = 0;
        while(num>0){
            s=s+(num%10);
            num/=10;
        }
        return s;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(sum(nums[i])==i){
                return i;
            }
        }
        return -1;
    }
}