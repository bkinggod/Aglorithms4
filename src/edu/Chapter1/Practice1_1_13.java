package edu.Chapter1;
/**
 * 题目：编写一段代码，打印出一个M行N列的二维数组的转置
 */
public class Practice1_1_13 {
    public static void main(String[] args){
        //定义的M行N列的二维数组4行3列
        int[][] array = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        System.out.println("transfer before");
        printArray(array);
        System.out.println("transfer after");
        printArray(transferArray(array));
    }

    public static void printArray(int[][] array){
        for(int i = 0; i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
              System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] transferArray(int[][] array){
        int[][] newArr = new int[array[0].length][array.length];
        for(int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length; j++){
                newArr[j][i] = array[i][j];
            }
        }
        return newArr;
    }
}
