package io.vels.easy.longestcommonprefix;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String[] str = {"cir", "car", "cxxx"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        Arrays.sort(strs);

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < strs[0].toCharArray().length; i++) {
            if (strs[0].toCharArray()[i] != strs[strs.length - 1].toCharArray()[i])
                break;
            res.append(strs[0].toCharArray()[i]);
        }

        return res.toString();
    }
}
