package 动态规划;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 给定一个区间的集合 intervals ，其中 intervals[i] = [start, end] 。
 * 返回 需要移除区间的最小数量，使剩余区间互不重叠 。
 * 示例：
 * 输入: intervals = [[1,2],[2,3],[3,4],[1,3]]
 * 输出: 1
 * 解释: 移除 [1,3] 后，剩下的区间没有重叠。
 * 相关例题: LeetCode 452 用最少数量的箭引爆气球
 */
public class 区间调度问题 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int res = eraseOverlapIntervals(intervals);
        System.out.println(res);
    }

    private static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int count = 1;
        int x_end = intervals[0][1];
        for (int[] interval : intervals) {
            int start = interval[0];
            if (start >= x_end) {
                count++;
                x_end = interval[1];
            }
        }
        return intervals.length - count;
    }
}
