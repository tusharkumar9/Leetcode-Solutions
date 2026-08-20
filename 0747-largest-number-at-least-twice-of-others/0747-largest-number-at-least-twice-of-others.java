class Solution {
    public int dominantIndex(int[] nums) {
        int big = -1;
        int second = -1;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (big < nums[i]) {
                second = big;
                big = nums[i];
                index = i;
            } 
            else if (second < nums[i]) {
                second = nums[i];
            }
        }

        if (second * 2 <= big) {
            return index;
        } 
        else {
            return -1;
        }
    }
}