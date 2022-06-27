package hm.net.dsj.sort;

import java.util.Arrays;
import java.util.List;

/**
 * 归并排序：
 * 将排序递归到只有两个数比较，然后再回升
 *
 * @author Yan Jiahong
 * Created on 2022/6/25
 */
public class MergeSortSolution extends AbstractSortSolution {

    @Override
    public int[] sortAscend(int[] arr) {
        // 定义结果组
        int[] ret = new int[arr.length];
        return new int[10];
    }

    private void doSort(int[] arr, int li, int ri, int[] ret) {

    }

    public static void main(String[] args) {
        MergeSortSolution solution = new MergeSortSolution();
        solution.test();
    }
}















































