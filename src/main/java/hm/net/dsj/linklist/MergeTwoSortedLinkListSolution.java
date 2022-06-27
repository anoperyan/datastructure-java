package hm.net.dsj.linklist;

/**
 * @author Yan Jiahong
 * Created on 2022/6/24
 */
public class MergeTwoSortedLinkListSolution {
    //static class ListNode {
    //    int val;
    //    ListNode next = null;
    //
    //    ListNode(int val) {
    //        this.val = val;
    //    }
    //}
    //
    //public ListNode Merge(ListNode list1, ListNode list2) {
    //    ListNode newHead = new ListNode(-1);
    //    ListNode cur = newHead;
    //    while (list1 != null && list2 != null) {
    //        if (list1.val <= list2.val) {
    //            cur.next = list1;
    //            list1 = list1.next;
    //        } else {
    //            cur.next = list2;
    //            list2 = list2.next;
    //        }
    //        cur = cur.next;
    //    }
    //    cur.next = list1 != null ? list1 : list2;
    //    return newHead.next;
    //}
    //
    //public void traverse(ListNode head) {
    //    ListNode node = head;
    //    while (node != null) {
    //        System.out.printf("%s,", node.val);
    //        node = node.next;
    //    }
    //    System.out.println();
    //}
    //
    //public static void main(String[] args) {
    //    int idx = 1;
    //    ListNode head = new ListNode(1);
    //    ListNode node = head;
    //    while (idx < 2) {
    //        node.next = new ListNode(idx + 1);
    //        node = node.next;
    //        idx++;
    //    }
    //    MergeTwoSortedLinkListSolution solution = new MergeTwoSortedLinkListSolution();
    //    solution.traverse(head);
    //    ListNode newHead = solution.Merge(head, 1, 2);
    //    solution.traverse(newHead);
    //}
}
