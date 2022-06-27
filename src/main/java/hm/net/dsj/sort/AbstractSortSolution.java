package hm.net.dsj.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Yan Jiahong
 * Created on 2022/6/27
 */
public abstract class AbstractSortSolution implements ISortSolution {
    private final Random random = new Random();

    private int[] getMockArr() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(50);
        }
        return arr;
    }

    public void test() {
        int[] arr = getMockArr();
        int[] ret = sortAscend(arr);
        System.out.printf("Input Array: %s\r\n", Arrays.toString(arr));
        System.out.printf("Output Array: %s\r\n", Arrays.toString(ret));
        boolean correct = true;
        for (int i = 1; i < ret.length; i++) {
            if (ret[i - 1] > ret[i]) {
                System.out.printf("Sort result is wrong！The item of index %s can not great than %s个\r\n", i - 1, i);
                correct = false;
                break;
            }
        }
        if (correct) {
            System.out.println("Sort is correct!");
        }
    }
}
