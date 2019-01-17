package edu.Chapter1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by bicheng on 2018/6/20.
 */
public class Practice1_1_19 {
    public static void main(String[] args){
        long[] b = F2(100);
        for(int i = 0; i<b.length;i++){
            StdOut.println(i + " " + b[i]);
        }
    }
    public static long F(int N){
        if(N == 0){
            return 0;
        }
        if(N == 1) return 1;
        return F(N-1) + F(N-2);
    }

    public static long[] F2(int N){
        long[] F = new long[N];
        F[0]=0;
        F[1]=1;
        for(int i = 2; i<N;i++){
            F[i] = F[i-1]+F[i-2];
        }
       return F;
    }

}
