package hm.net.dsj.bintree;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * @author Yan Jiahong
 * Created on 2022/6/24
 */
public class LevelOrderTraversalSolution {

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // write code here
        TreeMap<Integer, List<Integer>> values = new TreeMap<>();
        doLevelOrderTraversal(root, values, 0);
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        int i = 0;
        while (true) {
            ArrayList<Integer> levelValues = (ArrayList<Integer>) values.get(i);
            if (levelValues == null) {
                break;
            }
            ret.add(levelValues);
            i++;
        }
        return ret;
    }

    private void doLevelOrderTraversal(TreeNode root, TreeMap<Integer, List<Integer>> values, int level) {
        if (root == null) {
            return;
        }
        values.putIfAbsent(level, new ArrayList<>());
        values.get(level).add(root.val);
        level++;
        doLevelOrderTraversal(root.left, values, level);
        doLevelOrderTraversal(root.right, values, level);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode tn1 = new TreeNode(2);
        tn1.left = new TreeNode(3);
        root.right = tn1;

        LevelOrderTraversalSolution solution = new LevelOrderTraversalSolution();
        ArrayList<ArrayList<Integer>> ret = solution.levelOrder(root);
        System.out.println(ret);
    }
}
