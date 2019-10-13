package codechallenge;

class Scratch9 {
    public static void main(String[] args) {
        System.out.println(reverseString("abc", "", 3));
        System.out.println(reverseString1("abcd", 0, 3));
    }

    private static String reverseString(String str, String output, int len) {
        if (len == 0) {
            return output;
        }
        return reverseString(str, output + str.charAt(--len), len--);
    }


    private static String reverseString1(String str, int i, int j) {
        if (i <= j) {
            return str;
        }
        String reverse = str.charAt(j) + str.substring(i++,j--) + str.substring(i);
        return reverseString1(reverse, i++, j--);
    }
}