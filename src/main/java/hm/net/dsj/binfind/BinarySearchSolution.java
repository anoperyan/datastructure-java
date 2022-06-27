package hm.net.dsj.binfind;

/**
 * @author Yan Jiahong
 * Created on 2022/6/24
 */
public class BinarySearchSolution {


    public int search(int[] nums, int target) {
        // write code here
        int li = 0;
        int ri = nums.length;
        int[] ret = new int[1];
        doSearch(nums, target, li, ri, ret);
        return ret[0];
    }

    public void doSearch(int[] nums, int tar, int li, int ri, int[] ret) {
        // 检查
        int idx = (li + ri) / 2;
        if (nums[idx] == tar) {
            ret[0] = idx;
            return;
        }
        if (li != ri && li != idx && ri != idx) {
            doSearch(nums, tar, li, idx, ret);
            doSearch(nums, tar, idx, ri, ret);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 4, 6, 10, 13, 14};
        //int[] nums = new int[]{12, 23, 6, 13};
        int tar = 13;
        BinarySearchSolution solution = new BinarySearchSolution();
        int idx = solution.search(nums, tar);
        System.out.println(idx);
    }
}
