class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {

            StringBuilder nextStr = new StringBuilder();

            for (int i = 0; i < s.length(); i += k) {
                int curr = 0;

                for (int j = i;  j < i + k && j < s.length(); j++) {
                    curr += s.charAt(j) - '0';
                }
                nextStr.append(curr);
            }
            
            s = nextStr.toString();
        }

        return s;
    }
}