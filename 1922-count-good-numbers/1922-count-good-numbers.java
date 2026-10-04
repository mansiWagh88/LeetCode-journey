class Solution {
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        long ans=power(5,even)*power(4,odd);
        return (int)(ans%mod);
    }
    long mod=1000000007;
    private long power(long a,long b){
        long ans=1;
        while(b>0){
            if(b%2==1){
                ans=(ans*a)%mod;
            }
            a=(a*a)%mod;
            b=b/2;
        }
        return ans;
    }
}