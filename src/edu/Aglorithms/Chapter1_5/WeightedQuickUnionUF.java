package edu.Aglorithms.Chapter1_5;

/**
 * 加权quick-union算法
 */
public class WeightedQuickUnionUF extends UF{

    private int[] sz; // （由触点索引的）各个根节点所对应的分量的大小

    WeightedQuickUnionUF(int N){
        super(N);
        sz = new int[N];
        for (int i = 0; i < N; i++){
            sz[i] = 1;
        }
    }

    @Override
    public int find(int p) {
        // 跟随连接找到根节点
        while (p != id[p]){
            p = id[p];
        }
        return p;
    }

    @Override
    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if(i == j){
            return;
        }
        if(sz[i] < sz[j]){
            id[i] = j;
            sz[j] += sz[i];
        }else{
            id[j] = i;
            sz[i] += sz[j];
        }
        count--;
    }
}
