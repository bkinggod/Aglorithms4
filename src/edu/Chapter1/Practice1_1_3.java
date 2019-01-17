package edu.Chapter1;

        import edu.princeton.cs.algs4.StdIn;

/**
 * 题目：编写一个程序，从命令行得到三个整数参数。如果他们都相等则打印equal,否则打印not equal
 */
public class Practice1_1_3 {
    public static void main(String[] args){
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();
        if(a==b&&a==c){
            System.out.println("equal");
        }else{
            System.out.println("not equeal");
        }
    }
}
