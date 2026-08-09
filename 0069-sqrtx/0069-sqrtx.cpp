class Solution {
public:
    int mySqrt(int x) {

        if (x == 0) return 0;
        if(x==1) return 1;
        int l = 0;
        int h = x;
        int ans =0;
        while(l<=h){

        int mid = l+(h-l)/2;
        if (mid <= x/mid ){
            ans = mid;
           l =  mid+1;
        } else {
            h = mid-1;
        }
    
    }
    return ans;
    }
};