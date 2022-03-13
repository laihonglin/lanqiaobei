package 题目;

import java.util.HashMap;

/**
 * 判断两字符串字符集是否相同
 */
public class HasSameCharSet {
    public static boolean check(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            map.putIfAbsent(c, 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (map.get(c) == null) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean res = check("abcde", "deabccadcd");
        System.out.println(res);
    }
}
