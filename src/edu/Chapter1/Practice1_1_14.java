package edu.Chapter1;
import edu.princeton.cs.algs4.StdIn;
/**
 * 题目：编写一个静态方法lg(),接受一个整数参数N,返回不大于log2N的最大整数。不要使用Math库
 */
public class Practice1_1_14 {
    public static void main(String[] args){
        int N = StdIn.readInt();
        System.out.println(lg(N));

    }
    public static int lg(int N){
        int count=0;
        for (int n = N; n>1;n=n/2){
            count++;
        }
        return count;
    }
}
