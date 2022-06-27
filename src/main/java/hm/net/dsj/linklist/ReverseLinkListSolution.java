package hm.net.dsj.linklist;

/**
 * @author Yan Jiahong
 * Created on 2022/6/24
 */
public class ReverseLinkListSolution {
    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {
        if (null == head)
            return null;
        ListNode node = head;
        ListNode prev = null;
        // 新链表
        ListNode newHead = null;
        while (node != null) {
            // 得到新头部
            newHead = node;
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return newHead;
    }

    public void traverse(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.printf("%s,", node.val);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        one.next = two;
        two.next = three;
        ReverseLinkListSolution solution = new ReverseLinkListSolution();
        //solution.traverse(one);
        ListNode newHead = solution.ReverseList(one);
        System.out.println(newHead);
    }
}
