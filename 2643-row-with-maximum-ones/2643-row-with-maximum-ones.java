class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxones=0;
        int ansRow=0;
        for(int i=0;i<mat.length;i++){
            int count=0;
        for(int j=0;j<mat[i].length;j++){
            if(mat[i][j]==1){
                count++;
            }
        }
        if(count>maxones){
            maxones=count;
            ansRow=i;
        }
        }
        return new int[]{ansRow,maxones};
    }
}