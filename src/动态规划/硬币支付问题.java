package 动态规划;

import java.util.Scanner;

import static java.lang.Integer.min;

public class 硬币支付问题 {
    static int[] cnts = new int[6];
    static int[] coins = {1, 5, 10, 50, 100, 500};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            cnts[i] = sc.nextInt();
        }
        int A = sc.nextInt();
        int res = f(A, 5);
        System.out.println(res);
    }

    /**
     * 尽量先用大面值，因为不用大面值，将使用更多的小面值
     *
     * @param A
     * @param cur
     * @return
     */
    private static int f(int A, int cur) {
        if (A <= 0) return 0;
        if (cur == 0) return A;

        int coinValue = coins[cur];
        int x = A / coinValue;// 看需要多少个当前面值硬币
        int cnt = cnts[cur];// 当前面值硬币有多少个
        int t = min(x, cnt);
        return t + f(A - t * coinValue, cur - 1);
    }
}
