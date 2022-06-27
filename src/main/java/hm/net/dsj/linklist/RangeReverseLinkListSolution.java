package hm.net.dsj.linklist;

/**
 * @author Yan Jiahong
 * Created on 2022/6/24
 */
public class RangeReverseLinkListSolution {
    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * @param head ListNode类
     * @param m    int整型
     * @param n    int整型
     * @return ListNode类
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head.next == null || m == n) {
            return head;
        }
        // write code here
        int idx = 1;
        ListNode node = head;
        ListNode prev = null;
        ListNode leftTail = null;
        ListNode rightHead = null;
        ListNode rvsHead = null;
        ListNode rvsTail = null;
        while (node != null) {
            if (idx == m - 1) {
                leftTail = node;
            }
            if (idx == n + 1) {
                rightHead = node;
                // 已经不需要遍历和反转，直接跳出
                break;
            }
            if (idx == m) {
                rvsTail = node;
            }
            ListNode next = node.next;
            if (idx > m && idx <= n) {
                // 反转区间
                node.next = prev;
                if (idx == n) {
                    // 已经反转完成该区间，记录区间头部，后面进行链接
                    rvsHead = node;
                }
            }
            prev = node;
            node = next;
            // 增加计数器
            idx++;
        }
        // 完成区间反转，拼接左，中，右三个区间
        rvsTail.next = rightHead;
        if (leftTail != null) {
            leftTail.next = rvsHead;
            return head;
        } else
            return rvsHead;
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
        RangeReverseLinkListSolution solution = new RangeReverseLinkListSolution();
        solution.traverse(head);
        ListNode newHead = solution.reverseBetween(head, 1, 2);
        solution.traverse(newHead);
    }
}
