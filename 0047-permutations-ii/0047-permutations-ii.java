class Solution {
    private int n;
    private List<List<Integer>> result;

    private void backtrack(List<Integer> temp, Map<Integer, Integer> mp) {
        if (temp.size() == n) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (count == 0) {
                continue;
            }

            // Do something
            temp.add(num);
            mp.put(num, count - 1);

            // Explore
            backtrack(temp, mp);

            // Undo
            temp.remove(temp.size() - 1);
            mp.put(num, count);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        n = nums.length;
        result = new ArrayList<>();

        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        List<Integer> temp = new ArrayList<>();
        backtrack(temp, mp);

        return result;
    }
}