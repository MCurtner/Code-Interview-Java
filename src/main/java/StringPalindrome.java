public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("anna"));
        System.out.println(isPalindrome("apple"));

        System.out.println(isPalindrome2("level"));
        System.out.println(isPalindrome2("tank"));
    }

    public static boolean isPalindrome(String str) {
        // reverse the string
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        // compare the strings
        return str.equals(sb.toString());
    }

    public static boolean isPalindrome2(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
