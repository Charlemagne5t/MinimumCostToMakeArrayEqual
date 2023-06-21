public class Solution {
    public long minCost(int[] nums, int[] cost) {
        long minResult = Long.MAX_VALUE;
        long tempResult = 0;
        for (int k = 0; k < nums.length; k++) {
            int i = nums[k];
            for (int j = 0; j < nums.length; j++) {
                tempResult += Math.abs(nums[j] - i) * (long) (cost[j]);
                if (tempResult > minResult) break;
            }
            minResult = Math.min(minResult, tempResult);
            tempResult = 0;
        }

        return minResult;
    }

}
