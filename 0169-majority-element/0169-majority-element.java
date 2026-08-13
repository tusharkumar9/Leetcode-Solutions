// Solution by the HASHMAP METHOD

// class Solution {
//     public int majorityElement(int[] nums) {
//         Map<Integer, Integer> map = new HashMap<>();

//         for (int i = 0; i < nums.length; i++) {
//             if (map.containsKey(nums[i])) {
//                 map.put(nums[i], map.get(nums[i]) + 1);
//             }
//             else {
//                 map.put(nums[i], 1);
//             }
//         }

//         int majority = (nums.length / 2);
//         int result = 0;

//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             if (entry.getValue() > majority) {
//                 result = entry.getKey();
//             }
//         }

//         return result;
//     }
// }


//Solution by the Boyer Voting ALgo

class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}