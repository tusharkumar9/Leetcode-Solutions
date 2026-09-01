class Solution {
    public int[] sortedSquares(int[] nums) {

        // for (int i = 0; i < nums.length; i++) {
        //     nums[i] = nums[i] * nums[i];
        // }

        // Arrays.sort(nums);


        int left = 0;
        int right = nums.length-1;

        int [] result = new int[nums.length];
         
        for(int i=nums.length-1; i>=0; i--){
            int leftHalf= nums[left]*nums[left];
            int rightHalf= nums[right]*nums[right];

            if(leftHalf>rightHalf) {
                result[i]= leftHalf;
                left++;
            } 
            else {
                result[i] = rightHalf;
                right--;
            }
        }
        return result;

    }
}