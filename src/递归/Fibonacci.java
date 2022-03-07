package 递归;

public class Fibonacci {
    public static void main(String[] args) {
        int res = fib(7);
        System.out.println(res);
    }

    public static int fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
