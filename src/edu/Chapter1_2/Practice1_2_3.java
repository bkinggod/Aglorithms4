package edu.Chapter1_2;

import edu.princeton.cs.algs4.*;

/**
 * 编写一个Interval2D的用例，从命令行接受一个整数N、min和max。生成N个随机的2D间隔，其宽和高均匀的分布在
 * 单位正方形中的min和max之间。用StdDraw画出它们并打印出相交的间隔对的数量以及有包含关系的间隔对数量。
 */
public class Practice1_2_3 {

    public static void main(String[] args) {
        int N = StdIn.readInt();
        double min = StdIn.readDouble();
        double max = StdIn.readDouble();
        Interval2D[] interval2DS = new Interval2D[N];
        for (int i = 0; i < N; i++) {
            Interval1D interval1DA = null;
            Interval1D interval1DX = null;
            double a = StdRandom.uniform(min, max);
            double b = StdRandom.uniform(min, max);
            if(a>b){
                interval1DA = new Interval1D(b,a);
            }else {
                interval1DA = new Interval1D(a,b);
            }
            double x = StdRandom.uniform(min, max);
            double y = StdRandom.uniform(min, max);
            if(x>y){
                interval1DX = new Interval1D(y,x);
            }else {
                interval1DX = new Interval1D(x,y);
            }
            interval2DS[i] = new Interval2D(interval1DA, interval1DX);
        }
        StdDraw.setPenColor(StdDraw.BLUE);
        for (int i = 0;i<interval2DS.length;i++){
            interval2DS[i].draw();
        }
        int count = 0;
//        int contain = 0;
        for(int i = 0;i<interval2DS.length;i++){
            Interval2D interval = interval2DS[i];
            for (int j = 0;j < interval2DS.length; j++){
                if (i!=j && interval.intersects(interval2DS[j])){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
