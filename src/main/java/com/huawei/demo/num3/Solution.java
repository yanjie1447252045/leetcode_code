package com.huawei.demo.num3;

import java.util.HashSet;
import java.util.Set;

class Solution {
    // 对待数组位置最简单的办法就是把一个当前值带进去，然后推到等式
    public int lengthOfLongestSubstring(String s) {
        int st = -1;
        int n = s.length();
        Set<Character> occ = new HashSet<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                occ.remove(s.charAt(i - 1));
            }
            while (st + 1 < n && !occ.contains(s.charAt(st + 1))) {
                occ.add(s.charAt(st + 1));
                st++;
            }
            ans = Math.max(ans, st - i + 1);
        }
        return ans;
    }
}
