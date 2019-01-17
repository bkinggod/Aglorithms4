package edu.Chapter1;

/**
 * 编写一个静态方法histogram(),接受一个整数数组a[]和一个整数M为参数并返回一个大小为M的数组，其中第i个元素的值为整数i在参数数组中出现的次数。
 * 如果a[]中的值均在0和M-1之间，返回数组中所有元素之和应该和a.length相等
 * */
public class Practice1_1_15 {
    public static void main(String[] args){
        int[] a = {2,2,6,13,11,2,4,12,13,10,12,9,8,8,7,3};
        int M = 14;
        int[] b = histogram(a,M);
        for(int i = 0;i<b.length;i++){
            System.out.print(b[i]);
            System.out.print("  ");
        }
        System.out.println();
        int sum = 0;
        for(int i = 0; i<b.length;i++){
            sum += b[i];
        }
        System.out.println(sum);
    }
    public static int[] histogram(int[] a,int M){
        int[] newArr = new int[M];
        for(int i = 0; i < M; i++){
            int count = 0;
            for(int j = 0;j<a.length;j++){
                if(i == a[j]){
                    count++;
                }
            }
            newArr[i] = count;
        }
        return newArr;
    }
}
