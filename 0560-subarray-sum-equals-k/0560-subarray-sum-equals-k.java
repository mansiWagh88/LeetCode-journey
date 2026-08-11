import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>prefixSumMap=new HashMap<>();
        int prefixSum=0, count=0;
        prefixSumMap.put(0,1);
        for(int i=0;i<n;i++){
            prefixSum +=nums[i];
            int remove=prefixSum-k;
           count += prefixSumMap.getOrDefault(remove,0);
            prefixSumMap.put(prefixSum,prefixSumMap.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}