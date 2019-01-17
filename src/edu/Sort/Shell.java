package edu.Sort;

/**
 * 希尔排序
 */
public class Shell {

    /**
     * 数组长度13
     * 13/3=4
     * h=4
     * 3,5,6,9, 2,6,78,65, 21,12,10,14, 15
     *
     * @param array
     */
    public static void sort(int[] array) {
        // 将a[] 按升序排列
        int N = array.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1; // 1, 4, 13, 40, 121, 364, 1093, .....
        }
        while (h >= 1) {
            // 将数组变为h有序
            for (int i = h; i < N; i++) {
                //将a[i]插入到a[i-h],a[i-2*h],a[i-3*h]... 之中
                for (int j = i; j >= h && array[j] < array[j - h]; j -= h) {
                    int temp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = temp;
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 6, 9, 2, 6, 78, 89, 12, 21, 33, 69, 15};
        sort(a);
        SortUtils.printArr(a);
    }
}
