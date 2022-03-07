package 位运算;

import java.util.Scanner;

public class 二进制小数 {
    public static void main(String[] args) {
        double num;
        System.out.println("输入一个小数:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextDouble();
        StringBuilder sb = new StringBuilder("0.");
        while(num > 0){
            double r = num * 2;
            if(r >= 1){
                sb.append("1");
                num = r - 1;
            }else {
                sb.append("0");
                num = r;
            }
            if(sb.length() >= 34){
                System.out.println("ERROR");
                return;
            }
        }
        System.out.println(sb.toString());
    }
}
