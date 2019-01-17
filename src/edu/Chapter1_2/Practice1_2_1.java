package edu.Chapter1_2;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;
import java.util.Arrays;
/**
 *编写一个Point2D的用例，从命令行接受一个整数N。在单位正方形中生成N个随机的点，然后计算两个点之间的再近距离
 */
public class Practice1_2_1 {
    public static void main(String[] args)
    {
        int n = StdIn.readInt();
        Point2D[] points = new Point2D[n];
        for (int i = 0; i < n; i++)
        {
            points[i] = new Point2D(StdRandom.uniform(), StdRandom.uniform());
        }
        StdDraw.setPenColor(StdDraw.BLUE);
        Arrays.sort(points);
        for (int i = 0; i < n; i++)
        {
            points[i].draw();
            System.out.println(points[i]);
        }
        double minDistance = (points[0].x() - points[1].x()) * (points[0].x() - points[1].x())
                + (points[0].y() - points[1].y()) * (points[0].y() - points[1].y());
        int minIndex = 0;
        int minIndexJ = 1;
        for (int i = 0; i < n - 1; i ++)
        {
            for(int j = i+1;j<n;j++){
                double dis = (points[i].x() - points[j].x()) * (points[i].x() - points[j].x())
                        + (points[i].y() - points[j].y()) * (points[i].y() - points[j].y());
                if (minDistance > dis)
                {
                    minDistance = dis;
                    minIndex = i;
                    minIndexJ = j;
                }
            }
        }
        System.out.println(Math.sqrt(minDistance));
        StdDraw.setPenColor(StdDraw.RED);
            System.out.println(points[minIndex]);
            System.out.println(points[minIndexJ]);
            StdDraw.line(points[minIndexJ].x(), points[minIndexJ].y(), points[minIndex].x(), points[minIndex].y());
    }
}
