class Solution {
    
    
    private void solve(int curr,int n ,List<Integer>result){
        
        if(curr > n){
            return;
        }
        result.add(curr);
        
        for(int nextDigit=0; nextDigit<=9; nextDigit++) {
     int nextNum= curr *10 + nextDigit;
     
     if(nextNum>n){
         return;
     }
        
        solve(nextNum,n,result);
        }
        
    }
    
    public List<Integer> lexicalOrder(int n) {
List<Integer>result = new ArrayList<>();

    for(int start=1;start<=9;start++){
        solve(start,n,result);
    }
    return result;

    }
}