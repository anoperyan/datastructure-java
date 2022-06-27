package hm.net.dsj.bintree;

import java.util.Arrays;

/**
 * @author Yan Jiahong
 * Created on 2022/6/24
 */
public class PreorderTraversalSolution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param root TreeNode类
     * @return int整型一维数组
     */
    private final int[] values = new int[100];
    int[] cursor = new int[]{0};

    public int[] preorderTraversal(TreeNode root) {
        doPreorderTraversal(root, values, cursor);
        int[] retArr = new int[cursor[0]];
        System.arraycopy(values, 0, retArr, 0, cursor[0]);
        return retArr;
    }

    public void doPreorderTraversal(TreeNode root, int[] values, int[] cursor) {
        values[cursor[0]] = root.val;
        cursor[0] = cursor[0] + 1;
        if (root.left != null) {
            doPreorderTraversal(root.left, values, cursor);
        }
        if (root.right != null) {
            doPreorderTraversal(root.right, values, cursor);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode tn1 = new TreeNode(2);
        tn1.left = new TreeNode(3);
        root.right = tn1;

        PreorderTraversalSolution solution = new PreorderTraversalSolution();
        int[] ret = solution.preorderTraversal(root);
        System.out.println(Arrays.toString(ret));
    }
}
