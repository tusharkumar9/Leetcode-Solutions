class Solution {
    
    int findWinnerIdx(int n , int k){
        
        if (n==0) {
            return 0;
        }
        int idx = findWinnerIdx(n-1,k);
        
        idx = (idx+k)%n;
       
       return idx;

    }
    
    public int findTheWinner(int n, int k) {
        int resultidx = findWinnerIdx(n,k);
        
        return  resultidx+1;
    }
}