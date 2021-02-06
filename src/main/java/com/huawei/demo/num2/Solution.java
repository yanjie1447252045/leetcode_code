package com.huawei.demo.num2;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode temp = result;
        int add = 0;
        while (l1 != null || l2 != null) {
            int a = 0, b = 0;
            if (l1 != null) {
                a = l1.val;
            }
            if (l2 != null) {
                b = l2.val;
            }
            int sum = a + b;
            sum += add;
            add = sum / 10;
            int val = sum % 10;
            temp.next = new ListNode(val);
            temp = temp.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (add > 0) {
            temp.next = new ListNode(add);
        }
        return result.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
