package edu.Chapter1;
/**
 * 编写一个递归的静态方法计算ln(N!)的值
 */
public class Practice1_1_20 {
    public static void main(String[] args){
        System.out.println(ln(5));
    }
    public static int ln(int N){
        if(N == 1) return 1;
        else {
            return ln(N-1)*N;
        }
    }
}
