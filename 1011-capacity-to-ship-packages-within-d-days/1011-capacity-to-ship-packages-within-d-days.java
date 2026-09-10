class Solution {
    private boolean canShip(int[]weights,int days,int capacity){
        int requireD=1;
        int currLoad=0;
        for(int w:weights){
            if(currLoad+w>capacity){
                requireD++;
                currLoad=0;
            }
            currLoad+=w;
        }
        return requireD<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=Arrays.stream(weights).max().getAsInt();
        int high=Arrays.stream(weights).sum();
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canShip(weights,days,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}