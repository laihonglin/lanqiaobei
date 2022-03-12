package 题目;

public class Zipper {
    public static String zipString(String src){
        int count = 0;
        char last = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < src.length();i++){
            char charAt = src.charAt(i);
            if (sb.length() == 0){
                sb.append(charAt);
                count++;
            }else {
                if (last == charAt){
                    count++;
                }else {
                    sb.append(count).append(charAt);
                    count = 1;
                }
            }
            last = charAt;
        }
        // 考虑最后一个字符的重复次数
        if (count >= 1){
            sb.append(count);
        }
        // 比较新字符串和原字符串
        if (sb.length() >= src.length()){
            return src;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = zipString("aabcccccaaa");
        System.out.println(str);
    }
}
