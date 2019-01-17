package edu.Aglorithms.Chapter1_5;

import edu.princeton.cs.algs4.StdIn;

/**
 * 并查集算法 quick-find实现
 */
public abstract class UF {
    protected int[] id; // 分量id（以触点作为索引）
    protected int count; // 分量数量

    public UF() {
    }

    public UF(int N) {

        //初始化分量id数组
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    public int count(){
        return count;
    }

    /**
     * 判断两个触点是否连接
     * @param p
     * @param q
     * @return
     */
    public boolean connected(int p, int q){
        return find(p) == find(q);
    }

    public abstract int find(int p);

    public abstract void union(int p, int q);

}
