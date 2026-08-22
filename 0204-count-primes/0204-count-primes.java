// // class Solution {
// //     // brute force
// //     public static boolean prime(int a) {
// //         if (a <= 1) return false; 
        
// //         for (int i = 2; i < a; i++) {
// //             if (a % i == 0) {
// //                 return false;
// //             }
// //         }
// //         return true;
// //     }
// //     public int countPrimes(int n) {
// //         int totalPrimes = 0;
// //         for (int i = 2; i < n; i++) {
// //             if (prime(i)) {
// //                 totalPrimes++; 
// //             }
// //         }
        
// //         return totalPrimes;
// //     }
// // }
// class Solution {  
//     public int countPrimes(int n) {
//         if(n<=2) return 0;
//         boolean[] isPrime = new boolean[n];
//         for (int i = 2; i < n; i++) {
//             isPrime[i] = true;
//         }
//         //Sieve of Eratosthenes
//         for (int i = 2; i * i < n; i++) {
//             if (isPrime[i]) {
//                 for (int j = i * i; j < n; j += i) {
//                     isPrime[j] = false;
//                 }
//             }
//         }
//         int count = 0;
//         for (int i = 2; i < n; i++) {
//             if (isPrime[i]) {
//                 count++;
//             }
//         }
//         return count;

//     }
// }

class Solution {
    public int countPrimes(int n) {
       int count=0;
       boolean[] isPrime=new boolean[n];
       if(n<2) return 0;
       for(int i=2;i<n;i++){
        if(!isPrime[i]){
            count++;
            for(long j=(long)i*i;j<n;j+=i){
                isPrime[(int)j]=true;
            }
        }
       }
       return count; 
    }
}