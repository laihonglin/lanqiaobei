package 前缀和;

import java.util.Arrays;

/**
 * 假设你有一个长度为 n 的数组，初始情况下所有的数字均为 0，你将会被给出 k 个更新的操作。
 * 其中，每个操作会被表示为一个三元组：[startIndex, endIndex, inc]，
 * 你需要将子数组 A[startIndex ... endIndex]（包括 startIndex 和 endIndex）增加 inc。
 * 请你返回 k 次操作后的数组。
 * <p>
 * 示例:
 * 输入: length = 5, updates = [[1,3,2],[2,4,3],[0,2,-2]]
 * 输出: [-2,0,3,5,3]
 */
public class 差分数组 {
    public static void main(String[] args) {
        int length = 5;
        int[][] updates = {{1, 3, 2}, {2, 4, 3}, {0, 2, -2}};
        int[] res = getModifiedArray(length, updates);
        System.out.println(Arrays.toString(res));
    }

    private static int[] getModifiedArray(int length, int[][] updates) {
        int[] nums = new int[length];
        Difference df = new Difference(nums);
        for (int[] update : updates) {
            df.increment(update[0], update[1], update[2]);
        }
        return df.result();
    }
}
