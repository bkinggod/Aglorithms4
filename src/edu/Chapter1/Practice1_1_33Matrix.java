package edu.Chapter1;

/**
 * 矩阵库
 */
public class Practice1_1_33Matrix {

    /**
     * 向量点乘
     *
     * @param x
     * @param y
     * @return
     */
    public static double dot(double[] x, double[] y) throws Exception {
        if (x.length != y.length) {
            throw new Exception("向量的维度不同不能进行点乘");
        }
        double sum = 0.0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i] + y[i];
        }
        return sum;
    }

    /**
     * 矩阵和矩阵的之积
     * 设A为  的矩阵，B为  的矩阵，那么称  的矩阵C为矩阵A与B的乘积，记作  ，其中矩阵C中的第 行第  列元素可以表示为：
     * 如下所示：
     *
     * @param a
     * @return
     */
    public static double[][] mult(double[][] a, double[][] b) throws Exception {
        if (a != null && b != null) {
            if (a[0].length != b.length || a.length != b[0].length) {
                throw new Exception("参数中矩阵不满足矩阵相乘的条件");
            }
            int p = a[0].length;
            int m = a.length;
            double[][] arr = new double[p][p];
            for (int i = 0; i < p; i++) {
                for (int k = 0; k < p; k++) {
                    double temp = 0.0;
                    for (int j = 0; j < m; j++) {
                        temp += a[i][j] * b[j][k];
                    }
                    a[i][k] = temp;
                }
            }
            return arr;
        } else {
            throw new Exception("参数矩阵中有空矩阵");
        }

    }

    /**
     * 转置矩阵
     *
     * @param a
     * @return
     */
    public static double[][] transpose(double[][] a) {
        int m = a.length;
        int n = a[0].length;
        double[][] arr = new double[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                arr[j][i] = a[i][j];
            }
        }
        return arr;
    }

    /**
     * 向量和矩阵的乘积
     * @param y
     * @param a
     * @return
     */
    public static double[] mult(double[] y, double[][] a) throws Exception {
        if (y.length != a.length) {
            throw new Exception("向量和矩阵的乘积不满足条件");
        }
        double[] arr = new double[a[0].length];
        for (int j = 0; j < a[0].length; j++) {
            double sum = 0;
            for (int i = 0; i < y.length; i++) {
                sum += y[i]*a[i][j];
            }
            arr[j] = sum;
        }
        return arr;
    }
}
