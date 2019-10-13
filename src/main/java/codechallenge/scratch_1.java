package codechallenge;

class Scratch1 {
    public static void main(String[] args) {
        System.out.println(solution("00-44  48 5555 8361"));
        System.out.println(solution("0  - 22  1985--324"));
        System.out.println(solution("0  - 22  "));
        System.out.println(solution("0  - 22  7"));
        System.out.println(solution("0  - 22  7 00 78----6"));
    }

    public static String solution(String s) {
        final String s1 = extractDigits(s);
        if (s1.length() <= 2) {
            return s1;
        }
        int rem = s1.length() % 3;

        String result = "";

        if (rem == 1) {
            rem = rem + 3;
        }
        result = formatString(s1, 0, s1.length() - rem, 3);
        if (rem != 0) {
            result = result.concat(formatString(s1, s1.length() - rem, s1.length(), 2));
        }
        result = result.substring(0, result.length() - 1);
        return result;
    }

    static String formatString(String s, int start, int end, int groupSize) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(s.charAt(i));
            if ((i + 1) % groupSize == 0) {
                result.append('-');
            }
        }
        return result.toString();
    }

    static String extractDigits(String s) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}