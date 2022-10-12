class Solution {
public:
    int isprime(int n){
        bool prime[n+1];
        memset(prime, true, sizeof(prime));
        int count = 0;
        
        for(int p = 2; p*p <=n; p++){
            
            for(int i = p*p; i<=n; i +=p){
                prime[i] = false;
            }
        }
        
        for(int p =2; p<n; p++){
            if(prime[p]){
                count++;
            }
        }
          
        return count;
        
    }
    
    int countPrimes(int n) {
        return isprime(n);
        
    }
};
