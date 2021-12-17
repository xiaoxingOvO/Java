package sort;

import java.util.Arrays;

/**
 * 归并排序
 * 归并排序的思想是将数组分成两部分，分别进行排序，然后归并起来。
 *
 * @author xiaoxing
 * @create 2021-12-01 18:02
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array = {96, -2, 4, 51, 6, 75, 34, 87, 41, 1, 75};
        int[] temp = new int[array.length];//归并排序需要一个额外空间
        mergeSort(array, 0, array.length-1, temp);
        System.out.println("归并排序后=" + Arrays.toString(array));

    }

    //分加合方法
    public static void mergeSort(int[] array, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;//中间索引
            //向左递归进行分解
            mergeSort(array, left, mid, temp);
            //向右递归进行分解
            mergeSort(array, mid + 1, right, temp);
            //合并
            merge(array, left, mid, right, temp);
        }
    }

    /**
     * 合并的方法
     *
     * @param array 排序的原始数组
     * @param left  左边有序序列的初始索引
     * @param mid   中间索引
     * @param right 右边索引
     * @param temp  做中转的数组
     */
    public static void merge(int[] array, int left, int mid, int right, int[] temp) {
        int i = left;//初始化i，左边有序序列的初始索引
        int j = mid + 1;//初始化j,右边有序序列的初始索引
        int t = 0;//指向temp数组的当前序列

        //把两个有序的数组按照规则填充到temp数组，直到其中一个数组处理完
        while (i <= mid && j <= right) {
            //比较两个序列当前元素的大小，小的填充到temp数组，并下标+1，同时temp下标也要+1
            if (array[i] <= array[j]) {
                temp[t] = array[i];
                t += 1;
                i += 1;
            } else {
                temp[t] = array[j];
                t += 1;
                j += 1;
            }
        }

        //当一方处理完后，把剩余数组的剩余元素填充到temp数组
        while (i <= mid) {//左边剩余
            temp[t] = array[i];
            t += 1;
            i += 1;
        }
        while (j <= right) {//右边剩余
            temp[t] = array[j];
            t += 1;
            j += 1;
        }

        //将temp数组的元素拷贝到arr
        //注意：并不是每次都拷贝所有
        t = 0;
        int templeft = left;
        while (templeft <= right) {
            array[templeft] = temp[t];
            t += 1;
            templeft += 1;
        }

    }
}
