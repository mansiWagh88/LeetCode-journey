class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0,high=m-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=maxElement(mat,mid);
            int left;
            int right;
            if(mid-1>=0){
                left=mat[row][mid-1];
            }
            else{
                left=Integer.MIN_VALUE;
            }
            if(mid+1<m){
             right=mat[row][mid+1];
            }
            else{
                right=Integer.MIN_VALUE;
            }
            if(mat[row][mid]>left && mat[row][mid]>right){
                return new int[]{row,mid};
            }
            else if(left>mat[row][mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    private int maxElement(int[][]mat,int col){
        int n=mat.length;
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<n;i++){
            if(mat[i][col]>max){
                max=mat[i][col];
                index=i;
            }
        }
        return index;
    }
}