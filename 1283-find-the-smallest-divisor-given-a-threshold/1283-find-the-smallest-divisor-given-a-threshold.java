class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        if(n>threshold) return -1;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,nums[i]);
        }
        int low=1,high=maxi,ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(sumByD(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    private int sumByD(int[]nums,int divisor){
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=(nums[i]+divisor-1)/ divisor;
        }
        return sum;
    }
}