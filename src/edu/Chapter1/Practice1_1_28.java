package edu.Chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 删除重复的元素。修改BinarySearch类中的测试用例来删除去排序之后白名单中的所有重复元素
 */
public class Practice1_1_28 {
    public static void main(String[] args){
        int[] a = {1,1,2,3,6,5,8,5,6,22,3,6,3,6,99};
        Arrays.sort(a);
        for(int i = 0; i < a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        Integer[] b= filtration(a);
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }

    }
    public static Integer[] filtration(int[] a){
        List<Integer> list = new ArrayList<>();
        Integer temp = null;
        for(int i = 0; i < a.length; i++){
           if(i == 0){
               temp = a[i];
               list.add(temp);
           }else {
               if(temp != a[i]){
                   temp = a[i];
                   list.add(temp);
               }else {
                   continue;
               }
           }
        }
        return list.toArray(new Integer[0]);
    }
}
