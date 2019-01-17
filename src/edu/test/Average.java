package edu.test;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by bicheng on 2018/6/14.
 */
public class Average {

    public static void main(String[] args){
        //取StdIn中所有的数的平均数
        double sum = 0.0;
        int cnt = 0;
        while(!StdIn.isEmpty()){
            sum += StdIn.readDouble();
            cnt++;
        }
        double avg = sum / cnt;
        StdOut.printf("Average is %.5f\n", avg);
    }
}
