class Solution {
    public int splitArray(int[] nums, int k) {
        int low=nums[0];
        int high=0;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int partitions=countPartitions(nums,mid);
            if(partitions>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    private int countPartitions(int[]nums,int maxsum){
        int n=nums.length;
        int partitions=1;
        int subarraySum=0;
        for(int i=0;i<n;i++){
            if(subarraySum+nums[i]<=maxsum){
                subarraySum+=nums[i];
            }
            else{
                partitions++;
                subarraySum=nums[i];
            }
        }
        return partitions;
    }
}