package edu.Chapter1;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 */
public class Practice1_1_34 {

    /**
     * 打印出最大最小的数
     *
     * @param a
     */
    public static void printMaxAndMin(double[] a) {
        double max = 0;
        double min = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("max : " + max + "min : " + min);
    }

    /**
     * 打印中位数
     */
    public static void median(double[] a) {
        int l = a.length;
        Arrays.sort(a);
        if (l % 2 == 0) {
            int m = l / 2;
            System.out.println("中位数是：" + (a[m]+a[m+1])/2);
        } else {
            int m = l/2+1;
            System.out.println("中位数是：" + a[m]);
        }
    }

    /**
     * 打印出第k小的数，k小于100
     * 利用快速排序的思想，从数组S中随机找出一个元素X，把数组分为两部分Sa和Sb。Sa中的元素大于等于X，Sb中元素小于X。这时有两种情况：
     1. Sb中元素的个数小于k，则Sa中的第k-|Sb|个元素即为第k大数；
     2. Sb中元素的个数大于等于k，则返回Sb中的第k小数。时间复杂度近似为O(n)
     * @param a
     * @param k
     */
    public static int printKMin(double[] a, int l, int r, int k){
        if(l<=r){
            int p = par(a,l,r);
            if(p-l+1==k)    return p;
            else if(p-l+1<k){
                return printKMin(a,p+1,r,k-(p-l+1));
            }else{
                return printKMin(a,l,p-1,k);
            }
        }
        return 0;
    }

    private static int par(double[] a,int l, int r){
        double x = a[l];
        while (l<r){
            while (l<r&&a[r]<=x) --r;
            a[l] = a[r];
            while (l<r&&a[l]>=x) ++l;
            a[r] = a[l];
        }
        a[l] = x;
        return l;
    }

    /**
     * 打印出所有数的平方和
     * @param a
     */
    public static void sqart(double[] a){
        double sum = 0;
        for(int i = 0; i<a.length;i++){
            sum +=a[i]*a[i];
        }
        System.out.println(sum);
    }

    /**
     * 打印出N个数平均值
     * @param a
     */
    public static void average(double[] a){
        double sum = 0;
        for(int i = 0; i < a.length;i++){
            sum+=a[i];
        }
        StdOut.print(sum/a.length);
    }

    /**
     * 打印大于平均值数的百分比
     * @param a
     */
    public static void present(double[] a){
        double sum = 0;
        for(int i = 0; i < a.length;i++){
            sum+=a[i];
        }
        double aver = sum/a.length;
        int count = 0;
        for (int i = 0; i < a.length;i++){
            if(a[i]>aver){
                count++;
            }
        }
        StdOut.printf(".2f%",count/a.length*100);
    }
}
