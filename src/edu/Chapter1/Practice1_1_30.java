package edu.Chapter1;

/**
 * 数组练习：编写一段程序，创建一个N*N的布尔数组a[][]。其中当i和j互质时（没有相同因子），则a[i][j]为true,否则为false
 */
public class Practice1_1_30 {

    public static void main(String[] args) {
        int N = 5;
        boolean[][] arr = new boolean[N][N];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = gcd(i, j);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

    /**
     * 互质返回true
     * @param a
     * @param b
     * @return
     */
    public static boolean gcd(int a, int b) {
        if (a == 0 || b == 0)
            return false;
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (a % b != 0) {
            int r = b;
            b = a % b;
            a = b;
        }
        if (b == 1) {
            return true;
        } else {
            return false;
        }
    }
}
