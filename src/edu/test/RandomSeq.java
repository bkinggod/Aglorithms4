package edu.test;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by bicheng on 2018/6/14.
 */
public class RandomSeq {

    public static void main(String[] args){
        //打印N个（lo hi）之间的随机数
        int N = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        for(int i = 0; i<N; i++){
            double x = StdRandom.uniform(lo, hi);
            StdOut.printf("%.2f\n", x);
        }
    }
}
