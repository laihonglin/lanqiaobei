package 递归;

public class Recursion {
    public static void main(String[] args) {
//        int res = f1(4);
//        System.out.println(res);

//        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
//        int res = f2(arr, 0);
//        System.out.println(res);

        String str = "abcdefg";
        String reverse = reverse(str, str.length() - 1);
        System.out.println(reverse);
    }

    public static int f1(int n){
        if(n == 1){
            return 1;
        }
        return n * f1(n - 1);
    }

    public static int f2(int[] arr,int begin){
        if(begin == arr.length - 1){
            return arr[begin];
        }
        return arr[begin] + f2(arr,begin + 1);
    }

    //翻转字符串
    public static String reverse(String str,int end){
        if (end == 0){
            return "" + str.charAt(0);
        }
        return str.charAt(end) + reverse(str,end - 1);
    }
}
