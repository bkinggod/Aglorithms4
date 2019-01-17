package edu.Chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 编写一段程序，从标准输入按行读取数据，其中每行包含一个名字和两个整数。然后用printf()打印一张表格，每行的若干列数包括名字、两个整数
 * 和第一个整数除以第二个整数的结果，精确到小数点后三位。可以用这种程序将棒球球手的击球命中率或者学生的考试分数制成的表格。
 */
public class Practice1_1_21 {
    public static void main(String[] args){
        while(StdIn.hasNextLine()){
            String name=StdIn.readString();
            int m=StdIn.readInt();
            int n=StdIn.readInt();
            StdOut.printf("%8s | %8d | %8d | %8.3f", name,m,n,(m*1.0)/n);
        }
    }
}
