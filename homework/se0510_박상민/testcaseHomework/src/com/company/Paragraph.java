package com.company;

public class Paragraph {

    public static String catWhiteSpace(String orig) {
        if (orig == null)               // 1    조건
            return null;                // 2

        StringBuilder result = new StringBuilder();
        int length = orig.length();
        int i = 0;

        while (i < length) {            // 3    조건
            char ch = orig.charAt(i);

            if (isWhiteSpace(ch))       // 4    조건
                result.append(' ');     // 5

            while (isWhiteSpace(ch)) {  // 6    조건
                i++;

                if (i >= length)        // 7    조건
                    break;              // 8

                ch = orig.charAt(i);    // 9
            }

            if (!isWhiteSpace(ch))      // 10   조건
                result.append(ch);      // 11

            i++;
        }

        return result.toString();       // 12
    }                                   // 13

    static boolean isWhiteSpace(char ch) {
        if (ch == ' ' || ch == '\t')
            return true;
        else
            return false;
    }
}