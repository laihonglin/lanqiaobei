package 题目;

import java.util.Arrays;

/**
 * 变形词问题
 */
public class StringSame {
    public static boolean checkSame(String stringA,String stringB){
        int len1 = stringA.length();
        int len2 = stringB.length();
        if (len1 != len2){
            return false;
        }

        char[] arr1 = stringA.toCharArray();
        char[] arr2 = stringB.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cba";
        boolean res = checkSame(str1, str2);
        System.out.println(res);
    }
}
