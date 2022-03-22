package 动态规划;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 一队人（N个人）期望跨河，有一条船，一次只能载2个人，过河之后需要有一个人划回来，
 * 所有人才能够跨河，每个人划船速度都不同，两个人一组整体速度是由划船速度较慢的决定的。
 * 问题：确定一种策略用最少的时间所有人都能过河。
 * 输入:
 * 1
 * 4
 * 1 2 5 10
 * 输出
 * 17
 */
public class 快速渡河问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] speed = new int[n];
            for (int j = 0; j < n; j++) {
                speed[j] = sc.nextInt();
            }
            Arrays.sort(speed);
            f(n, speed);
        }
    }

    private static void f(int n, int[] speed) {
        int left = n;// 有多少人
        int ans = 0;// 记时间
        while (left > 0) {
            if (left == 1) {
                ans += speed[0];
                break;
            } else if (left == 2) {
                ans += speed[1];
                break;
            } else if (left == 3) {
                ans += speed[2] + speed[0] + speed[1];
            } else {
                int s1 = speed[1] + speed[0] + speed[left - 1] + speed[1];
                int s2 = speed[left - 1] + speed[left - 2] + 2 * speed[0];
                ans += Math.min(s1, s2);
                left -= 2;
            }
        }
        System.out.println(ans);
    }
}
