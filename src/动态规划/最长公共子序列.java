package 动态规划;

import java.util.Arrays;

/**
 * 给定两个字符串 text1 和 text2，返回这两个字符串的最长 公共子序列 的长度。
 * 如果不存在 公共子序列 ，返回 0 。
 * <p>
 * 一个字符串的 子序列 是指这样一个新的字符串：
 * 它是由原字符串在不改变字符的相对顺序的情况下删除某些字符（也可以不删除任何字符）后组成的新字符串。
 * <p>
 * 示例：
 * 输入：s1 = "abcde", s2 = "ace"
 * 输出：3
 * 解释：最长公共子序列是 "ace" ，它的长度为 3 。
 *
 * 相关例题: LeetCode 712 两个字符串的最小ASCII删除和
 */
public class 最长公共子序列 {
    static int[][] memo;

    public static void main(String[] args) {
//        String s1 = "abcde";
//        String s2 = "ace";
//        System.out.println(longestCommonSubsequence(s1, s2));
        String s1 = "sea";
        String s2 = "eat";
        System.out.println(minDistance(s1,s2));
    }

    // LeetCode 1143
    public static int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        memo = new int[m][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return dp(s1, 0, s2, 0);
    }

    /**
     * LeetCode 583
     * 给定两个单词 word1 和 word2 ，返回使得 word1 和  word2 相同所需的最小步数。
     * 每步 可以删除任意一个字符串中的一个字符。
     *
     * 示例：
     * 输入: word1 = "sea", word2 = "eat"
     * 输出: 2
     * 解释: 第一步将 "sea" 变为 "ea" ，第二步将 "eat "变为 "ea"
     */
    public static int minDistance(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int lcs = longestCommonSubsequence(s1, s2);
        return m - lcs + n - lcs;
    }

    private static int dp(String s1, int i, String s2, int j) {
        if (i == s1.length() || j == s2.length()) {
            return 0;
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        if (s1.charAt(i) == s2.charAt(j)) {
            memo[i][j] = 1 + dp(s1, i + 1, s2, j + 1);
        } else {
            memo[i][j] = Math.max(dp(s1, i + 1, s2, j), dp(s1, i, s2, j + 1));
        }
        return memo[i][j];
    }
}
