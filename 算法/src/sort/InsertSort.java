package sort;

/**
 * 插入排序
 * 每次都将当前元素插入到左侧已经排序的数组中，使得插入之后左侧数组依然有序。
 *
 * @author xiaoxing
 * @create 2021-11-30 16:45
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] array = {1, -2, 4, 51, 6, 75, 34,};
        insertSort(array);
    }

    public static void insertSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            //插入的数
            int insertVal = array[i];
            //被插入的位置(准备和前一个数比较)
            int index = i - 1;
            //如果插入的数比被插入的数小
            while (index >= 0 && insertVal < array[index]) {
                //将把 arr[index] 向后移动
                array[index + 1] = array[index];
                //让 index 向前移动
                index--;
            }
            //把插入的数放入合适位置
            array[index + 1] = insertVal;
            for (int arr : array) {
                System.out.print(arr + " ");
            }
            System.out.println();
        }

    }

}
