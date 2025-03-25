package io.vels.medium.longestPalindromSubString;

public class Solution {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s)); // Output: "bab" or "aba"
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);      // Odd-length palindromes
            int len2 = expandAroundCenter(s, i, i + 1);  // Even-length palindromes
            int currLen = Math.max(len1, len2);

            if (currLen > maxLen) {
                maxLen = currLen;
                start = i - (currLen - 1) / 2;
            }
        }

        return s.substring(start, start + maxLen);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }


}
