package edu.Chapter1_2;

import edu.princeton.cs.algs4.StdOut;

/**
 * 编写一个类VisualCounter，支持加一和减一操作。它的构造函数接受两个参数N和max其中N指定了操作的最大次数，
 * max指定了计数器的最大绝对值。作为副作用，用图像显示每次计数器变化后的值。
 */
public class VisualCounter {
    private int count = 0;
    private int N;
    private int max;
    public VisualCounter(int n, int max) {
        N = n;
        this.max = max;
    }
    public void increment(){
        if(N<=0){
            StdOut.println("该对象已经达到最大操作次数");
            return;
        }else{
            if(Math.abs(count)>max){
                StdOut.println("该对象的计数器已经达到最大值");
                return;
            }else{
                count++;
                N--;
            }
        }
    }
    public void decrease(){
        if(N<=0){
            StdOut.println("该对象已经达到最大操作次数");
            return;
        }else{
            if(Math.abs(count)>max){
                StdOut.println("该对象的计数器已经达到最小值");
                return;
            }else{
                count--;
                N--;
            }
        }
    }
    public int tally() {
        return count;
    }
    public String toString() {
        return count + " VisualCounter";
    }

    public static void main(String[] args){
        VisualCounter counter = new VisualCounter(20,50);
        while(counter.tally()<20){
            StdOut.println(counter);
            counter.increment();
        }
        StdOut.println(counter);
    }
}
