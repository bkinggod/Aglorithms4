package edu.Chapter1;

        import edu.princeton.cs.algs4.StdIn;

/**
 * 题目：编写一段程序，如果double类型的变量x和y都严格位于0和1之间则打印true,否则打印false
 */
public class Practice1_1_5 {
    public static void main(String[] args){
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        if(x>=0&&x<=1&&y>=0&&y<=1){
            System.out.println(true);
        }else{
            System.out.print(false);
        }
    }
}
