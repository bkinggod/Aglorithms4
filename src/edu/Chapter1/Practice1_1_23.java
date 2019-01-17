package edu.Chapter1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Created by bicheng on 2018/6/20.
 */
public class Practice1_1_23 {
    public static void main(String[] args){
        char symbol = '-';
        int[] whitelist = new In(args[0]).readAllInts();
        Arrays.sort(whitelist);
        while(!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            boolean found = binarySearch(key, whitelist);
            if('+' == symbol && !found)
                StdOut.println(key);
            if('-' == symbol && found)
                StdOut.println(key);
        }
    }
    public static boolean binarySearch(int key, int[] a){
        int lo = 0;
        int hi = a.length-1;
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if(key>a[mid])
                lo = mid+1;
            else if(key<a[mid]){
                hi = mid-1;
            }else{
                return true;
            }
        }
        return false;
    }
}
