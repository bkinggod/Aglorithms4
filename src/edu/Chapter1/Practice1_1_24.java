package edu.Chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 给出使用欧几里得算法计算105和24最大公约数的过程中得到的一系列p和q的值。扩展该算法中的代码得到一个程序Euclid,
 * 从命令行接受两个参数，计算他们的最大公约数并打印出每次调用递归方法是的两个参数，使用你的程序计算1111111和1234567的最大公约数。
 */
public class Practice1_1_24 {
    public static void main(String[] args){
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        System.out.println("the greatest common divisor of "+a+" and "+b+" is: "+gcd(a,b));
    }
    /**
     * 给定两个值返回其最大公约数
     * @param a
     * @param b
     * @return
     */
    public static int Euclid(int a, int b){
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        StdOut.println(a+" "+b);
        while(a % b != 0){ //如果余数不为0，就一直进行辗转相除
            int r = a % b; //r为a和b的余数，即r = a mod(b);
            a = b;
            b = r;
            r = a % b;
            StdOut.println(a+" "+b);
        }
        return b;
    }
    public static int gcd(int a, int b){
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        StdOut.println(a+" "+b);
        if(a%b==0)
            return b;
        else
            return gcd((a%b),b);
    }
}
