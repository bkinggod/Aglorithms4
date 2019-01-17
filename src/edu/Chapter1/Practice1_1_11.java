package edu.Chapter1;
/**
 * 题目：编写一段代码，打印出一个二维数组的内容，其中，使用*表示真，空格表示假，打印出行号和列号
 * */
public class Practice1_1_11 {
    public static void main(String[] args){
        //定义一个二维的boolean类型的数组
        boolean[][] arr = {{false,false,true,false},{true,true,false,true},{true,false,false,false},{false,false,true,true}};
        System.out.print(" ");
        for(int i = 0; i < arr[0].length;i++){
            System.out.print(i+1);
        }
        System.out.println();
        for(int i = 0;i<arr.length;i++){
            System.out.print(i+1);
            for(int j = 0; j< arr[i].length;j++){
                if(arr[i][j] == true){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
