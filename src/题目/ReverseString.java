package 题目;

/**
 * 字符串反转
 */
public class ReverseString {
//    public static String reverseString(String initString){
//        int len = initString.length();
//        char[] charArr = new char[len];
//        for (int i = 0;i < len;i++){
//            charArr[i] = initString.charAt(len - 1 - i);
//        }
//        return new String(charArr);
//    }

    public static String reverseString(String initString){
        StringBuffer sb = new StringBuffer(initString);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String initString = "abcdefgh";
        String str = reverseString(initString);
        System.out.println(str);
    }
}
