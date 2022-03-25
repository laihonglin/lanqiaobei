package 题目;
/**
 * 蓝桥杯：试题 基础练习 龟兔赛跑预测
 */

import java.util.Scanner;

public class 龟兔赛跑 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();//兔子速度
        int v2 = sc.nextInt();//乌龟速度
        int t = sc.nextInt();//兔子领先路程
        int s = sc.nextInt();//兔子休息时间
        int l = sc.nextInt();//总路程
        int x1, x2, time;
        x1 = 0;
        x2 = 0;
        time = 0;
        while (x1 < l && x2 < l) {
            if (x1 - x2 >= t) {
                for (int i = 0; i < s; i++) {
                    x2 += v2;
                    time++;
                    if (x2 == l)
                        break;
                }
            } else {
                x1 += v1;
                x2 += v2;
                time++;
            }
        }
        if (x1 == l && x2 < l)
            System.out.println("R");
        else if (x1 < l && x2 == l)
            System.out.println("T");
        else
            System.out.println("D");

        System.out.println(time);
    }
}
