class Solution {
    public void sortColors(int[] nums) {
//         int c_0 = 0;
//         int c_1 = 0;
//         int c_2 = 0;
//         int k = 0;
//      for(int i=0;i<nums.length;i++){
// if(nums[i]==0){
//     c_0++;
// }
// else if(nums[i]==1){
//     c_1++;
// }else{
//     c_2++;
// }
//      }
//         while(c_0-->0){
//             nums[k++] = 0;
//         }
//         while(c_1-->0){
//             nums[k++] = 1;
//         }
//         while(c_2-->0){
//             nums[k++] = 2;
//         }

//     }

// int [] freq = new int[3];

// for (int i = 0; i<nums.length; i++) {
//     freq[nums[i]]++;
    
// }
// int k =0;
// for(int i=0;i<freq.length;i++){
//     while((freq[i])-->0){
//         nums[k++] = i;
//     }
// }


    // Threee pointer approch
    int low  = 0;
    int mid = 0;
    int high= nums.length-1;

    while(mid<=high){
        if(nums[mid]==2) {
            int temp = nums[mid];
            nums[mid] = nums[high];
            nums[high] = temp;
            high--;
        }
        else if (nums[mid]==1){
            mid++;
        }
        else {
            int temp = nums[mid];
            nums[mid] = nums[low];
            nums[low]=temp;
            mid++;
            low++;
        }
    }

}
}