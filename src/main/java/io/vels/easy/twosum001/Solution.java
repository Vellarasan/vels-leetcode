package io.vels.easy.twosum001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Vellarasan
 * // https://leetcode.com/problems/two-sum/
 */
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer jValue = numsMap.get(target - nums[i]);
            if (jValue != null && jValue != i) {
                return new int[]{i, jValue};
            }
            numsMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; // [3,2,4] // [3,3]
        int target = 9; // 6 // 6
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
