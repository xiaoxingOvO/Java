package sort;

/**
 * 选择排序
 * 从数组中选择最小元素，将它与数组的第一个元素交换位置。
 * 再从数组剩下的元素中选择出最小的元素，将它与数组的第二个元素交换位置。
 * 不断进行这样的操作，直到将整个数组排序。
 *
 * @author xiaoxing
 * @create 2021-11-30 13:09
 */
public class Selection {

    public static void main(String[] args) {
        int[] array = {1, -2, 4, 51, 6, 75, 34,};
        select(array);
    }

    public static void select(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    int temp = array[j];
                    array[j] = array[min];
                    array[min] = temp;
                }
            }
            for (int arr : array) {
                System.out.print(arr + " ");
            }
            System.out.println();
        }
    }

}
