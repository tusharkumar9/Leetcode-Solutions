// public class Solution {
//     private List<List<Integer>> result = new ArrayList<>();

//     public List<List<Integer>> subsets(int[] nums) {
//         List<Integer> temp = new ArrayList<>();
//         solve(nums, 0, temp);
//         return result;
//     }

//     private void solve(int[] nums, int idx, List<Integer> temp) {
//         if (idx >= nums.length) {
//             result.add(new ArrayList<>(temp));
//             return;
//         }

//         temp.add(nums[idx]);
//         solve(nums, idx + 1, temp);
//         temp.remove(temp.size() - 1);
//         solve(nums, idx + 1, temp);
//     }
// }

class Solution {
    public static void f(int []nums ,List<List<Integer>>ans,List<Integer>current,int idx){
        if(idx>=nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[idx]);

        f(nums,ans,current,idx+1);
        current.remove(current.size()-1);
        f(nums,ans,current,idx+1);

    }
  
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>>ans = new ArrayList<>();
      List<Integer>current= new ArrayList<>();
      int idx= 0;

      f(nums,ans,current,idx);
      return ans;

    }
}