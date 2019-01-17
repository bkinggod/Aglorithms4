package edu.Chapter1;

import edu.princeton.cs.algs4.StdOut;

/**
 * 打印输出结果
 */
public class Practice1_1_6 {
    public static void main(String[] args){
        System.out.println(mystery1(2,25));
        System.out.println(mystery1(3,11));
    }

    public static int mystery(int a,int b){
        if(b == 0) return 0;
        if(b % 2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
     }
    public static int mystery1(int a,int b){
        if(b == 0) return 1;
        if(b % 2 == 0) return mystery(a*a, b/2);
        return mystery(a*a, b/2) * a;
    }

    public static void practice1_1_6(){
        int f = 0;
        int g = 1;
        for(int i = 0;i<=15;i++){
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
    public static void practice1_1_7_a(){
        double t = 9.0;
        while (Math.abs(t-9.0/t)>.001)
            t = (9.0/t + t)/2.0;
        StdOut.printf("%.5f\n", t);
    }
    public static void practice1_1_7_b(){
        int sum = 0;
        for(int i = 1; i < 1000;i++)
            for(int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);

    }
    public static void practice1_1_7_c(){
        int sum = 0;
        for(int i = 1; i < 1000; i*=2)
            for(int j = 0; j < 1000; j++)
                sum++;
        StdOut.println(sum);
    }
}
