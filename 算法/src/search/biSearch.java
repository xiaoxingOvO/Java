package search;

/**
 * 二分法查找
 * 要求待查找的序列有序。每次取中间位置的值与待查关键字比较，
 * 如果中间位置的值比待查关键字大，则在前半部分循环这个查找的过程，
 * 如果中间位置的值比待查关键字小，则在后半部分循环这个查找的过程。
 * 直到查找到了为止，否则序列中没有待查的关键字。
 *
 *
 * @author xiaoxing
 * @create 2021-11-30 13:46
 */
public class biSearch {

    public static int search(int[] array, int a) {

        int head = 0;
        int end = array.length;
        int mid;

        //判断数组是否有长度
        if (head - end < 0) {

            //如果有，则取中间位置的值与待查找值进行比较
            mid = (head + end) / 2;
            if (array[mid] == a) {
                return mid + 1;
            } else if (array[mid] < a) {   //向后查找
                head = mid + 1;
            } else {   //向前查找
                end = mid - 1;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        int[] arr = {1, -2, 4, 5, 6, 75, 34,};
        int search = search(arr, -5);
        if (search == -1) {
            System.out.println("你所查找的元素不存在！");
        } else {
            System.out.println("你查找的元素在第" + search + "个");
        }
    }

}