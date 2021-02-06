package com.huawei.demo.num1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> val2Index = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int left = target - nums[i];
            if (val2Index.containsKey(left)) {
                return new int[]{val2Index.get(left), i};
            }
            val2Index.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
