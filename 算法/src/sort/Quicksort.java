package sort;

import java.util.Arrays;

/**
 * 快速排序
 * 快速排序（Quicksort）是对冒泡排序的一种改进。
 * 基本思想是：通过一趟排序 将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小，
 * 然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 *
 * @author xiaoxing
 * @create 2021-11-30 22:43
 */
public class Quicksort {
    public static void main(String[] args) {
        int[] array = {96, -2, 4, 51, 6, 75, 34, 87, 41, 1, 75};
        quickSort2(array, 0, array.length - 1);
        System.out.println("arr=" + Arrays.toString(array));


    }

    public static void quicksort(int[] array, int left, int right) {
        int l = left;//左下标
        int r = right;//右下标
        //临时变量，交换时使用
        int temp = 0;
        //中轴值
        int pivot = array[(left + right) / 2];
        while (l < r) {
            //在pivot的左边一直找，找到大于等于pivot值，才退出
            while (array[l] <= pivot) {
                l += 1;
            }
            //在pivot的右边一直找，找到小于等于pivot值，才退出
            while (array[r] >= pivot) {
                r -= 1;
            }
            //如果l>=r说明pivot的左右两的值，已经分出左边小于pivot，右边大于pivot
            if (l >= r) {
                break;
            }
            //交换
            temp = array[l];
            array[l] = array[r];
            array[r] = temp;

            //如果交换完后，发现arr[l] == pivot值相等 r--,前移
            if (array[l] == pivot) {
                r -= 1;
            }

            //如果交换完后，发现arr[r] == pivot值相等 l++,后移
            if (array[r] == pivot) {
                l += 1;
            }
        }
        //如果l==r，必须l++，r--,否则出行栈溢出
        if (l == r) {
            l += 1;
            r -= 1;
        }
        //向左递归
        if (left < r) {
            quicksort(array, left, r);
        }
        //向左递归
        if (right > l) {
            quicksort(array, l, right);
        }
    }

    private static void quickSort2(int[] arr, int low, int high) {

        if (low < high) {
            // 找寻基准数据的正确索引
            int index = getIndex(arr, low, high);

            // 进行迭代对index之前和之后的数组进行相同的操作使整个数组变成有序
            //quickSort(arr, 0, index - 1); 之前的版本，这种姿势有很大的性能问题，谢谢大家的建议
            quickSort2(arr, low, index - 1);
            quickSort2(arr, index + 1, high);
        }
    }

    private static int getIndex(int[] arr, int low, int high) {
        // 基准数据
        int temp = arr[low];
        while (low < high) {
            // 当队尾的元素大于等于基准数据时,向前挪动high指针
            while (low < high && arr[high] >= temp) {
                high--;
            }
            // 如果队尾元素小于tmp了,需要将其赋值给low
            arr[low] = arr[high];
            // 当队首元素小于等于tmp时,向前挪动low指针
            while (low < high && arr[low] <= temp) {
                low++;
            }
            // 当队首元素大于tmp时,需要将其赋值给high
            arr[high] = arr[low];

        }
        // 跳出循环时low和high相等,此时的low或high就是tmp的正确索引位置
        // 由原理部分可以很清楚的知道low位置的值并不是tmp,所以需要将tmp赋值给arr[low]
        arr[low] = temp;
        return low; // 返回tmp的正确位置
    }
}
