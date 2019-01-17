package edu.Sort;

/**
 * 插入排序
 * 首先将一个数插入到有序的序列中一个适当的位置
 * 将其他元素在插入之前都需要右移
 */
public class Insertion {

    /**
     * 升序排序
     * @param array
     * @return
     */
    public static int[] sort(int[] array){
        for(int i = 0;i<array.length;i++){
            for (int j = i;j>0&&array[j]<array[j-1];j--){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args){
        int[] a = {3,5,6,9,2,6,78,65,21,12,10,14,15};
        sort(a);
        SortUtils.printArr(a);
    }


}
