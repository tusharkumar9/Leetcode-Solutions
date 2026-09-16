class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        
        for (int j = 0; j < nums.length; j++) {
         
            if (j > k) {
                st.remove(nums[j - k - 1]);
            }
          
            if (st.contains(nums[j])) {
                return true;
            }
            
            st.add(nums[j]);
        }
        
        return false;
    }
}