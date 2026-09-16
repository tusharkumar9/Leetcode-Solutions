// import java.util.HashSet;

// class Solution {
//     public boolean containsDuplicate(int[] nums) {

//         HashSet<Integer> set = new HashSet<>();

//         for (int num : nums) {

//             if (set.contains(num)) {
//                 return true;
//             }

//             set.add(num);
//         }

//         return false;
//     }
// }

// import java.util.HashSet;

// class Solution {
//     public boolean containsDuplicate(int[] nums) {

//         HashSet<Integer> set = new HashSet<>();

//         for (int num : nums) {
//             if (!set.add(num)) {
//                 return true;
//             }
//         }

//         return false;
//     }
// }

class Solution {
    public boolean containsDuplicate(int[] nums) {
      Set<Integer> intSet= new HashSet<>();
        
        for(int i =0; i<nums.length; i++){
            if(intSet.contains(nums[i])) {
                return true;
            } else {
                intSet.add(nums[i]);
            }
        }
        return false;
        
    }
}