class Solution {
    public String[] findWords(String[] words) {
        
String a ="qwertyuiop";
String b = "asdfghjkl";
String c = "zxcvbnm";

int [] f = new int[26];

       for(int i=0;i<a.length();i++){
        f[a.charAt(i)-'a'] = 1;
       }

       for(int i=0;i<b.length();i++){
        f[b.charAt(i)-'a'] = 2;
       }

       for(int i=0;i<c.length();i++){
        f[c.charAt(i)-'a'] = 3;
       }
String []ans = new String[words.length];
int k =0;
        for(String word : words){
        String w = word.toLowerCase();
            int num = f[w.charAt(0)-'a'];
                boolean taken = true;
            for(int i=1;i<word.length();i++){
                if(num!=f[w.charAt(i)-'a']){
                    taken = false;
                }
            }
            if(taken){
                ans[k++]=word;
            }
        }return Arrays.copyOf(ans,k);

    }
}