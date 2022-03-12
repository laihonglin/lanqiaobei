package 题目;

/**
 * 判断字符串是否有重复字符
 */
public class DifferentString {
    public static boolean checkDifferent(String initString) {
        if (initString == null) {
            return true;
        }

        int[] flag = new int[128];
        for (int i = 0; i < initString.length(); i++) {
            int c = (int) initString.charAt(i);
            if (flag[c] > 0) {
                return false;
            } else {
                flag[c]++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String initString = "abcdefga";
        boolean flag = checkDifferent(initString);
        System.out.println(checkDifferent(initString));
    }
}
