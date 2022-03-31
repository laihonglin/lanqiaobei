package 动态规划;

/**
 * 给你一个 只包含正整数 的 非空 数组 nums 。
 * 请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 * <p>
 * 示例：
 * 输入：nums = [1,5,11,5]
 * 输出：true
 * 解释：数组可以分割成 [1, 5, 5] 和 [11] 。
 */
public class 分割等和子集 {
    public static void main(String[] args) {
        int[] nums = {1,5,11,5};
        boolean flag = canPartition(nums);
        System.out.println(flag);
    }

    public static boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        sum = sum / 2;
        //dp[i][j] = x 表示，对于前 i 个物品，当前背包的容量为 j 时，
        //若 x 为 true，则说明可以恰好将背包装满，若 x 为 false，则说明不能恰好将背包装满。
        boolean[][] dp = new boolean[n + 1][sum + 1];
        //base case
        for(int i = 0;i <= n;i++){
            dp[i][0] = true;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j - nums[i - 1] < 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
                }
            }
        }
        return dp[n][sum];
    }
}
