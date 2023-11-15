package io.vels.easy.palindromeNumber002;

/**
 * @author Vellarasan
 * https://leetcode.com/problems/palindrome-number
 */
public class PalindromeNumberSolution {

    public static void main(String[] args) {
        int input = 121; // -121 // 100 // 1001
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(int x) {
        // % by 10
        // Subtract the result
        // / by 10

        if (x < 0) {
            return false;
        }

        int nextSetOfDigits = x;
        int res = 0;
        while (nextSetOfDigits > 0) {
            int lastDigit = nextSetOfDigits % 10;
            nextSetOfDigits = (nextSetOfDigits - lastDigit) / 10;
            res = (res * 10) + lastDigit;
        }
        return res == x;
    }
}
