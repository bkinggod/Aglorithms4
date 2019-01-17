package edu.Chapter1_2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;

/**
 * 编写一个IntervallD的用例，从命令行接受与一个整数N,从标准输入中读取N个间隔（每个间隔由一对double的值定义）并打印出所有相交间隔对
 */
public class Practice1_2_2 {

    public static void main(String[] args){
        int n = StdIn.readInt();
        Interval1D[] interval1D = new Interval1D[n];
        for(int i = 0;i < n;i++){
            double a = StdIn.readDouble();
            double b = StdIn.readDouble();
            if(a>b){
                interval1D[i] = new Interval1D(b,a);
            }else {
                interval1D[i] = new Interval1D(a,b);
            }
        }
        for(int i = 0; i < n; i++){
            Interval1D interval = interval1D[i];
            for(int j = 0; j < n; j++){
                if(i!=j && interval.intersects(interval1D[j])){
                    System.out.println(interval);
                    break;
                }
            }
        }

    }
}
