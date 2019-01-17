package edu.Chapter1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

/**
 * 直方图。假设标准输入流中含有一系列double值。编写一段程序，从命令行接受一个整数N和两个double值l和r。
 * 将（l,r）分为N段并使用StdDraw画出输入流中的值落在每段的数量的直方图。
 */
public class Practice1_1_32 {

    public static void main(String[] args) {
        double[] whiteList = StdIn.readAllDoubles();
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < whiteList.length; ++i) {
            if (min > whiteList[i])
                min = whiteList[i];
            if (max < whiteList[i])
                max = whiteList[i];
        }
        int N = 6;
        distribution(min, max + 10.0, N, whiteList);
    }
    public static void distribution(double l, double r, int N, double[] arr) {
        int length = arr.length;
        int[] statistics = new int[N];
        double interval = (r - l) / N;
        for (int i = 0; i < length; ++i) {
            double remain = arr[i] - l;
            int idx = (int) (remain / interval);
            ++statistics[idx];
        }
        double max = statistics[0];
        for (int i = 1; i < statistics.length; ++i) {
            if (max < statistics[i])
                max = statistics[i];
        }
        StdDraw.setXscale(l, r);
        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        double x0 = l + interval / 2.0;
        for (int i = 0; i < statistics.length; ++i) {
            double x = x0 + i * interval;
            double y = statistics[i] / (max + 1) / 2.0;
            double hw = 0.99 * interval / 2.0;
            double hh = y;
            StdDraw.filledRectangle(x, y, hw, hh);
        }
    }
}
