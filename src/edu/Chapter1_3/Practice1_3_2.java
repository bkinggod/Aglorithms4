package edu.Chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 给定以下输入，java Stack 的输出是什么
 */
public class Practice1_3_2 {

    public static void main(String[] args){
        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(100);
        while(!StdIn.isEmpty()){
            String item = StdIn.readString();
            if(!item.equals("-")){
                s.push(item);
            }else if(!s.isEmpty()){
                StdOut.print(s.pop() + "");
            }
        }
        StdOut.println("(" + s.size() + "left on stack)");
    }
}
