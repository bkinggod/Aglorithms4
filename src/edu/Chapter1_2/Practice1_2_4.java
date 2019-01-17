package edu.Chapter1_2;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by bicheng on 2018/6/28.
 */
public class Practice1_2_4 {

    public static void main(String[] args){
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        StdOut.println(string1);
        StdOut.println(string2);
        int N = 5;
        int count = 0;
        int count1 = 0;
        for(int i = 0;i<N;i++){
            for(int j = i+1;j<N;j++){
                for(int k = j+1;k<N;k++){
                    count++;
                }
            }
        }
        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++){
                for(int k = 0;k<N;k++){
                    count1++;
                }
            }
        }
        System.out.println(count);
        System.out.println(count1);
    }
}
