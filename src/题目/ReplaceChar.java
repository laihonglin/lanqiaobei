package 题目;

/**
 *  将字符串的空格替换成20%。
 */
public class ReplaceChar {
    public static String replaceSpace(String initString, int length) {
        return initString.replaceAll("\\s", "%20");
    }

    public static String replaceSpace(char[] iniString, int length) {
        int count = length;
        for (int i = 0; i < length; i++) {
            if (iniString[i] == ' ') {
                count += 2;
            }
        }
        int p1 = length - 1;
        int p2 = count - 1;
        while (p1 >= 0) {
            if (iniString[p1] == ' ') {
                iniString[p2--] = '0';
                iniString[p2--] = '2';
                iniString[p2--] = '%';
            } else {
                iniString[p2--] = iniString[p1];
            }
            p1--;
        }
        return new String(iniString, 0, count);
    }

    public static void main(String[] args) {
        String initString = "Mr John Smith0000000000000";
//        String str = replaceSpace(initString, 13);
//        System.out.println(str);
        System.out.println(replaceSpace(initString.toCharArray(), 13));
    }
}
