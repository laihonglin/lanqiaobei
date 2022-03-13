package 题目;

/**
 * 移除字符串连续出现的k个0
 */
public class RemoveZeros {
    public static String remove1(String iniString, int k) {
        String regexp = "0{" + k + "}";
        return iniString.replaceAll(regexp, "");
    }

    public static String remove2(String iniString, int k) {
        char[] arr = iniString.toCharArray();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            if (c == '0') {
                count++;
            } else {
                for (int j = 0; j < count % k; j++) {
                    sb.append('0');
                }
                sb.append(c);
                count = 0;
            }
        }
        for (int i = 0; i < count % k; i++) {
            sb.append('0');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "A00000B0000";
        System.out.println(remove1(str, 3));
        System.out.println(remove2(str, 3));
    }
}
