package sort;

/**
 * 冒泡排序
 * 从左到右不断交换相邻逆序的元素，在一轮的循环之后，可以让未排序的最大元素上浮到右侧。
 * 在一轮循环中，如果没有发生交换，那么说明数组已经是有序的，此时可以直接退出。
 *
 * @author xiaoxing
 * @create 2021-11-30 14:11
 */
public class bubbleSort {

    public static void main(String[] args) {
        int[] array = {1, -2, 4, 51, 6, 75, 34,};
        int count = bubbleSort(array);
        String len = String.valueOf(array.length-1);
        System.out.println("应该进行"+len+"轮,"+"实际进行了" + count + "轮");
        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }

    public static int bubbleSort(int[] array) {

        int i, j;

        //判断一轮结束有没有进行交换，没有交换就提前退出
        boolean isSorted = false;

        //记录进行了几轮交换
        int count = 0;

        for (i = 0; i < array.length - 1 && !isSorted; i++) {

            isSorted = true;
            count++;
            for (j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    isSorted = false;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return count;
    }

}
