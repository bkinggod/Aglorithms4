package edu.search;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Created by bicheng on 2018/6/13.
 * 二分查找算法
 * javac -encoding utf-8 BinarySearch.java
 */
public class BinarySearch {

    /**
     * 二分查找方法，存在返回索引
     * 不存在返回-1
     * @param key
     * @param a
     * @return
     */
    public static int rank(int key, int[] a){
        int lo = 0;
        int hi = a.length-1;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(key<a[mid]){
                hi = mid -1;
            }else if (key>a[mid]){
                lo = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] whitelist = StdIn.readAllInts();
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if(rank(key,whitelist)<0){
                StdOut.print(key);
            }
        }
    }
}
