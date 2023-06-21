import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void minCostTest1() {
        int[] nums = {1, 3, 5, 2};
        int[] cost = {2, 3, 1, 14};
        long expected = 8;
        long actual = new Solution().minCost(nums, cost);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minCostTest2() {
        int[] nums = {2, 2, 2, 2, 2};
        int[] cost = {4, 2, 8, 1, 3};
        long expected = 80;
        long actual = new Solution().minCost(nums, cost);
        Assert.assertEquals(expected, actual);
    }
}
