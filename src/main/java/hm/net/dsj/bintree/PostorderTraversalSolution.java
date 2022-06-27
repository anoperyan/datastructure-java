package hm.net.dsj.bintree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yan Jiahong
 * Created on 2022/6/24
 */
public class PostorderTraversalSolution {

    public int[] postorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        doPostorderTraversal(root, values);
        return values.stream().mapToInt(Integer::intValue).toArray();
    }

    private void doPostorderTraversal(TreeNode root, List<Integer> values) {
        if (root.left != null) {
            doPostorderTraversal(root.left, values);
        }
        if (root.right != null) {
            doPostorderTraversal(root.right, values);
        }
        values.add(root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode tn1 = new TreeNode(2);
        tn1.left = new TreeNode(3);
        root.right = tn1;

        PostorderTraversalSolution solution = new PostorderTraversalSolution();
        int[] ret = solution.postorderTraversal(root);
        System.out.println(Arrays.toString(ret));
    }
}
