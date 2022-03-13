package 题目;

/**
 * 判断A串是否是B串的旋转字符串
 */
public class IsRotate {
    public static boolean isRotate(String a,String b){
        if (a.length() != b.length()){
            return false;
        }
        StringBuilder sb = new StringBuilder(b).append(b);
        return sb.toString().contains(a);
    }

    public static void main(String[] args) {
        System.out.println(isRotate("defa", "fabdde"));
        System.out.println(isRotate("abc", "cba"));
    }
}
