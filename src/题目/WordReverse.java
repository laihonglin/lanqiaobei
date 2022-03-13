package 题目;

/**
 * 将字符串按单词翻转，如here you are 翻转成 are you here
 */
public class WordReverse {
    public static String reverse(String src){
        String s1 = reverseString(src);
        String[] words = s1.split("\\s");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(reverseString(word)).append(" ");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    private static String reverseString(String initString){
        StringBuilder sb = new StringBuilder(initString);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("here you are"));
        System.out.println(reverse(""));
    }
}
