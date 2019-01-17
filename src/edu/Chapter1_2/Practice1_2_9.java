package edu.Chapter1_2;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * 修改BinarySearch(请见1.1.10.1节中的二分查找代码)，使用Counter统计在有查找中被检查的键的总数
 * 并在查找全部结束后打印该值。提示：在main()中创建一个Counter对象并将它作为参数传递给rank().
 */
public class Practice1_2_9 {

    public static void main(String[] args){
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);
        Counter counter = new Counter("Practice1_2_9");
        while(!StdIn.isEmpty()){
            // 读取键值，如果不存在于白名单中则将其打印
            int key = StdIn.readInt();

            if(rank(key,whitelist,counter)<0){
                StdOut.println(key);
            }
        }
        StdOut.println(counter);

    }

    public static int rank(int key, int[] a, Counter counter){
        int lo = 0;
        int hi = a.length-1;
        while (lo <= hi){
            counter.increment();
            int mid = lo + (hi-lo)/2;
            if(key < a[mid]){
                hi = mid -1;
                lo = mid + 1;
            }else{
                StdOut.println(key + ": " + counter.tally());
                return mid;
            }
        }
        StdOut.println(key + ": " + counter.tally());
        return -1;
    }
}
