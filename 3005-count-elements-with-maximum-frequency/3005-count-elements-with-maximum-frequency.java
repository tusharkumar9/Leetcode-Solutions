class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        int [] freq = new int[101];
        
        for (int i =0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        int max=0;
        int ans=0;
        
        for (int i=0; i<freq.length;i++){
            if(freq[i]>max) {
                max=freq[i];
                ans=max;
            } else if (freq[i]== max){
                ans=ans+freq[i];
            } 
                
            }
        return ans;
    }
}