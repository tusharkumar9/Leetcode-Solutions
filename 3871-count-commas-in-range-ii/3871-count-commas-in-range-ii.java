class Solution {
    public long countCommas(long n) {
        long result =0;
        long lower =1000;
        long commas = 1;
        while (lower<=n){
            long upper = lower*1000-1;
            if(upper>n) upper = n;
            
            long countNum= upper-lower+1;
            
            result += (countNum * commas);
            lower *= 1000;
            commas++;
        }
        return result;
    }
}
        
     