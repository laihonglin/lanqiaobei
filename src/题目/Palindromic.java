package 题目;

import org.apache.commons.lang3.StringUtils;

/**
 * 判断回文串
 */
public class Palindromic {
    public static boolean check(String str){
        if (str == null || str.equals("")){
            return false;
        }
        int i = 0;
        int j = str.length() - 1;
        while (i <= j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindrome(String src){
        if (StringUtils.isEmpty(src)){
            return true;
        }
        return src.equals(new StringBuilder(src).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(check("aacbbcaa"));
        System.out.println(isPalindrome("aacbbcaa"));
    }
}
