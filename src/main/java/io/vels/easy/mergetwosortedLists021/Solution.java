package io.vels.easy.mergetwosortedLists021;


//  Definition for singly-linked list.

public class Solution {

    public static void main(String[] args) {
        System.out.println("Merge 2 sorted lists");

        ListNode list1 = new ListNode(1, null);
        ListNode list2 = new ListNode(2, null);

        mergeTwoLists(list1, list2);
    }
    public static class ListNode {
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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null & list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode resultList3 = new ListNode();

        ListNode temp = list1;

        while (temp.next != null) {
            if (temp.val <= list2.val) {

            }
        }

        return resultList3;

    }
}