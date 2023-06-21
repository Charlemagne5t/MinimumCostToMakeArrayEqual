class Solution {
    public long minCost(int[] nums, int[] cost) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int val : nums) {
            low = Math.min(low, val);
            high = Math.max(high, val);
        }

        long res = Long.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) >> 1;
            res = Math.min(res, change(nums, cost, mid));
            long left = change(nums, cost, mid - 1);
            long right = change(nums, cost, mid + 1);
            if (left < right) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    public long change(int[] nums, int[] costs, int tar) {
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != tar) {
                int diff = Math.abs(nums[i] - tar);
                ans += (long) diff * costs[i];
            }
        }
        return ans;
    }
}