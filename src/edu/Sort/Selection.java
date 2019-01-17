package edu.Sort;

import edu.princeton.cs.algs4.StdOut;

/**
 * 选择排序
 * 首先：找到数组中最小的那个元素，其次将它和数组的第一个元素交换位置，
 * 再次，在剩下的元素中找到最小的元素，将它和数组的两个元素交换位置。
 */
public class Selection {

    public static int[] sort(int[] a){
        int min = 0;
        int index = -1;
        for(int i = 0;i < a.length; i++){
            for(int j = i; j < a.length;j++){
                if(i==j){
                    min = a[j];
                    index = j;
                }else{
                    if(a[j]<min){
                        min = a[j];
                        index = j;
                    }
                }
            }
            int temp = a[i];
            a[i] = min;
            a[index] = temp;
        }
        return a;
    }

    public static void main(String[] args){
        int[] a = {3,5,6,9,2,6,78,65,21,12,10,14,15};
        sort(a);
        printArr(a);
    }

    public static void printArr(int[] a){
        for (int i = 0; i<a.length;i++){
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }
}
