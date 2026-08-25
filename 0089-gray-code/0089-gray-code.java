class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        ans.add(0);
        for(int i = 1; i<=n; i++) {
            int num  = (int) Math.pow(2, i-1);

            for(int j = ans.size()- 1; j>=0; j--) {
                ans.add(ans.get(j) + num);
            }
        }
        return ans;
        
    }
}