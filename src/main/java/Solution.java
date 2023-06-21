import java.util.Arrays;

public class Solution {
    public long minCost(int[] nums, int[] cost) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int x : nums) {
            if (x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
        }
        if(min == max) return 0;
        long result = Long.MAX_VALUE;
        for (int i = min; i <= max; i++) {
            result = Math.min(result, dfs(nums, cost, 0, min, max, i));
        }

        return result;
    }
    private long dfs(int[] nums, int[] cost, int index, int min, int max, int i){
        if(index == nums.length){
            return 0;
        }

        long result = 0;

        result +=  dfs(nums, cost, index + 1, min, max, i) +  Math.abs(nums[index] - i) * (long) cost[index];


        return result;
    }

}
