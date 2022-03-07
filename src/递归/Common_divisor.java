package 递归;

public class Common_divisor {
    public static void main(String[] args) {
        int m = 16,n = 24;
        int res = gcc(m, n);
        System.out.println(res);
    }

    public static int gcc(int m,int n){
        if(m % n == 0){
            return n;
        }
        return gcc(n,m % n);
    }
}
