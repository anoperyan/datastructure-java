package hm.net.dsj.linklist;

import java.util.List;

/**
 * @author Yan Jiahong
 * Created on 2022/6/24
 */
public class RangeReverseKGroupLinkListSolution {
    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * @param head ListNode类
     * @param k    int整型
     * @return ListNode类
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        // write code here

        // 添加筛选
        if (head == null || head.next == null || k < 2) {
            return head;
        }

        ListNode node = head;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        if (k > count) {
            return head;
        }
        int groupCount = count / k;
        System.out.println("count = " + count);
        node = head;
        // 遍历
        ListNode prev = null;
        // 上一组的尾部节点
        ListNode curGroupTail = null;
        ListNode lastGroupTail = null;
        ListNode newHead = null;
        int idx = 1;
        int rlIdx = 1;
        int rrIdx = 1 + k - 1;
        while (node != null) {
            if (idx / k == groupCount && idx % k > 0) {
                curGroupTail.next = node;
                break;
            }
            ListNode next = node.next;
            if (idx >= rlIdx && idx <= rrIdx) {
                if (rlIdx == idx) {
                    curGroupTail = node;
                } else {
                    if (rrIdx == idx) {
                        if (newHead == null)
                            newHead = node;
                        else
                            lastGroupTail.next = node;
                        lastGroupTail = curGroupTail;
                    }
                    // 这个和他之前的节点需要反转
                    node.next = prev;
                }
            }
            prev = node;
            node = next;
            idx++;
            if ((idx - 1) % k == 0) {
                rlIdx = idx;
                rrIdx = idx + k - 1;
            }
        }
        if (count == k) {
            curGroupTail.next = null;
        }
        return newHead;
    }

    public void traverse(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.printf("%s,", node.val);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int idx = 1;
        ListNode head = new ListNode(1);
        ListNode node = head;
        while (idx < 2) {
            node.next = new ListNode(idx + 1);
            node = node.next;
            idx++;
        }
        RangeReverseKGroupLinkListSolution solution = new RangeReverseKGroupLinkListSolution();
        solution.traverse(head);
        ListNode newHead = solution.reverseKGroup(head, 2);
        solution.traverse(newHead);
    }
}
