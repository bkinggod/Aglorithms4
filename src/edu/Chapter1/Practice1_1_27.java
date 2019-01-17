package edu.Chapter1;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;

/**
 * 二项分布。估计用以下代码计算binomial(100,50,0.25)将会产生的递归调用次数，
 * 将已经计算过的值保存在数组中并给出一个更好的实现
 */
public class Practice1_1_27 {
    public static void main(String[] args){
        Counter c = new Counter("calls");
        Counter c1 = new Counter("callsone");
        System.out.println(binomial(10,5,0.25,c));
        System.out.println(binomialone(100,50,0.25,c1));
        StdOut.println(c);
        StdOut.println(c1);
    }
    public static double binomial(int N, int k, double p){
        if(N == 0 && k == 0) return 1.0;
        if(N < 0 || k < 0) return 0.0;
        return (1.0 - p) * binomial(N-1, k, p) + p * binomial(N-1, k-1, p);
    }
    public static double binomial(int N, int k, double p, Counter c){
        c.increment();
        if(N == 0 && k == 0) return 1.0;
        if(N < 0 || k < 0) return 0.0;
        return (1.0 - p) * binomial(N-1, k, p,c) + p * binomial(N-1, k-1, p,c);
    }
    public static double binomialone(int n, int k, double p, Counter c)
    {
        double[][] v = new double[n+1][k+1];
        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= k; j++)
                v[i][j] = -1;
        return binomialone(v, n, k, p, c);
    }

    public static double binomialone(double[][] v, int n, int k, double p, Counter c)
    {
        if (n == 0 && k == 0) return 1.0;
        if (n < 0 || k < 0) return 0.0;

        if (v[n][k] == -1)
        {
            c.increment();
            v[n][k] = (1.0 - p) * binomialone(v, n-1, k, p, c) + p * binomialone(v, n-1, k-1, p, c);
        }
        return v[n][k];
    }
}
