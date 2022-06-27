package hm.net.dsj.binfind;

/**
 * @author Yan Jiahong
 * Created on 2022/6/24
 */
public class BinarySearchSolution2 {


    /**
     * @param nums   有序的被搜索数组
     * @param target 目标值
     * @return 目标值的下标
     */
    public int search(int[] nums, int target) {
        int first = 0, last = nums.length - 1, mid = (first + last) / 2;
        while (first <= last) {
            if (target < nums[mid]) {
                last = mid - 1;
            } else if (target > nums[mid]) {
                first = mid + 1;
            } else {
                return mid;
            }
            mid = (last + first) / 2;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 4, 6, 10, 13, 14};
        //int[] nums = new int[]{12, 23, 6, 13};
        int tar = 13;
        BinarySearchSolution2 solution = new BinarySearchSolution2();
        int idx = solution.search(nums, tar);
        System.out.println(idx);
    }
}
