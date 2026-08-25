class Solution {
    public int maxDiff(int num) {
        String s = Integer.toString(num);

        String max = s;
        for (int i = 0; i < max.length(); i++) {
            if (max.charAt(i) != '9') {
                max = max.replace(max.charAt(i), '9');
                break;
            }
        }

        String min = s;
        char c = min.charAt(0);

        if (c != '1') {
            min = min.replace(c, '1');
        } else {
            for (int i = 1; i < min.length(); i++) {
                if (min.charAt(i) != '0' && min.charAt(i) != '1') {
                    min = min.replace(min.charAt(i), '0');
                    break;
                }
            }
        }

        return Integer.parseInt(max) - Integer.parseInt(min);
    }
}