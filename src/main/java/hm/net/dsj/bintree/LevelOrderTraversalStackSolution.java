package hm.net.dsj.bintree;

import java.util.*;

/**
 * @author Yan Jiahong
 * Created on 2022/6/24
 */
public class LevelOrderTraversalStackSolution {

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> rowValues = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode tn = queue.poll();
                rowValues.add(tn.val);
                if (tn.left != null) {
                    queue.offer(tn.left);
                }
                if (tn.right != null){
                    queue.offer(tn.right);
                }
            }
            ret.add(rowValues);
        }
        return ret;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode tn1 = new TreeNode(2);
        tn1.left = new TreeNode(3);
        root.right = tn1;

        LevelOrderTraversalStackSolution solution = new LevelOrderTraversalStackSolution();
        ArrayList<ArrayList<Integer>> ret = solution.levelOrder(root);
        System.out.println(ret);
    }
}
