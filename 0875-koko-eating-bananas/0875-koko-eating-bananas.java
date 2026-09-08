class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=0;
        int high=findMax(piles);
        while(low<=high){
            int mid=low+(high-low)/2;
            long totalH=findTotalHours(piles,mid);
            if(totalH<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    private int findMax(int[]piles){
        int maxi=Integer.MIN_VALUE;
        int n=piles.length;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,piles[i]);
        }
        return maxi;
    }
    private long findTotalHours(int[]piles,int hourly){
        long totalH=0,n=piles.length;
        for(int i=0;i<n;i++){
            totalH+=Math.ceil((double)piles[i]/hourly);
        }
        return totalH;
    }
}