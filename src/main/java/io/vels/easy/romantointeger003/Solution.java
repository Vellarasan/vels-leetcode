package io.vels.easy.romantointeger003;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vellarasan
 * https://leetcode.com/problems/roman-to-integer/
 */
public class Solution {

    public static void main(String[] args) {
        /*
        Input: s = "III"
        Output: 3
        Explanation: III = 3.
        Example 2:

        Input: s = "LVIII"
        Output: 58
        Explanation: L = 50, V= 5, III = 3.
        Example 3:

        Input: s = "MCMXCIV"
        Output: 1994
        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
        */
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {

        Map<Character, Integer> symbolValueMap = new HashMap<>();
        symbolValueMap.put('I', 1);
        symbolValueMap.put('V', 5);
        symbolValueMap.put('X', 10);
        symbolValueMap.put('L', 50);
        symbolValueMap.put('C', 100);
        symbolValueMap.put('D', 500);
        symbolValueMap.put('M', 1000);

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res = i < s.length() - 1 && symbolValueMap.get(s.charAt(i)) < symbolValueMap.get(s.charAt(i + 1)) ?
                    res - symbolValueMap.get(s.charAt(i)) : res + symbolValueMap.get(s.charAt(i));
        }
        return res;
    }
}
