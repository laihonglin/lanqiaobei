package 前缀和;

import java.util.HashMap;

/**
 * 给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。
 * 示例：
 * 输入：nums = [1,1,1], k = 2
 * 输出：2
 */
public class 子数组问题 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        int res = subarraySum(nums, k);
        System.out.println(res);
    }

    private static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        int res = 0, sum0_i = 0;
        for (int num : nums) {
            sum0_i += num;
            int sum0_j = sum0_i - k;
            if (preSum.containsKey(sum0_j)) {
                res += preSum.get(sum0_j);
            }
            preSum.put(sum0_i, preSum.getOrDefault(sum0_i, 0) + 1);
        }
        return res;
    }
}
