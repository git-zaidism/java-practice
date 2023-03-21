public class ReverseString {
    public static void main(String[] args) {
        String name = "Amina";
        String reverseName = reversStr(name);
        System.out.println("Reverse Name --> " + reverseName);
        String reverseName2 = reversStrV2(name);
        System.out.println("Reverse Name using SB --> " + reverseName2);
    }

    private static String reversStr(String name) {
        String reverseName = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverseName = reverseName + name.charAt(i);
        }
        return reverseName;
    }

    private static String reversStrV2(String name) {
        StringBuffer sb = new StringBuffer(name);
        return sb.reverse().toString();
    }
}
