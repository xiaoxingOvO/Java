package sort;

/**
 * 希尔排序
 *希尔排序也是一种插入排序，它是简单插入排序经过改进之后的一个更高效的版本.
 * 希尔排序是把记录按下标的一定增量分组，对每组使用直接插入排序算法排序；随着增量逐渐减少，每组包含的关键词越来越多，
 * 当增量减至1时，整个文件恰被分成一组，算法便终止
 * @author xiaoxing
 * @create 2021-11-30 20:10
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] array = {96, -2, 4, 51, 6, 75, 34, 87, 41, 1};
        // System.out.println(System.currentTimeMillis());
        shellSort2(array);
        // System.out.println(System.currentTimeMillis());
    }


    //交换式
    public static void shellSort(int[] array) {
        int temp;
        //1.把它分成gap组，在这gap是的大小是每次除以2，也就是5，2，1
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            //遍历每一小组如gap=5时，遍历i分别=5，6，7，8，9的组
            for (int i = gap; i < array.length; i++) {
                //对每一组进行两个值进行交换，如0与5，1与6，2与7，3与8，4与9
                for (int j = i - gap; j >= 0; j -= gap) {//交换完后，一轮结束，返回到第一层for循环gap=2开始下一轮
                    if (array[j] > array[j + gap]) {
                        temp = array[j];
                        array[j] = array[j + gap];
                        array[j + gap] = temp;
                    }
                }
            }
            for (int arr : array) {
                System.out.print(arr + " ");
            }
            System.out.println();
        }
    }

    //优化：移位法
    public static void shellSort2(int[] array) {
        int temp;
        //1.把它分成gap组，在这gap是的大小是每次除以2，也就是5，2，1
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            //遍历每一小组如gap=5时，遍历i分别=5，6，7，8，9的组
            for (int i = gap; i < array.length; i++) {
                int j = i;
                int temp2 = array[j];
                if (array[j] < array[j-gap]) {
                    //找移动位置
                    while(j-gap>=0 && temp2 <array[j-gap]){
                        array[j]= array[j-gap];
                        j-=gap;
                    }
                    //当退出while后，就给temp找到插入的位置
                    array[j] = temp2;
                }
            }
            for (int arr : array) {
                System.out.print(arr + " ");
            }
            System.out.println();
        }
    }
}
