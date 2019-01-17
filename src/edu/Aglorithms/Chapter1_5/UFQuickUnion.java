package edu.Aglorithms.Chapter1_5;

/**
 */
public class UFQuickUnion extends UF{
    @Override
    public int find(int p) {
        while(p != id[p]) p = id[p];
        return p;
    }

    @Override
    public void union(int p, int q) {
        //  将p和q的根节点统一
        int pRoot = find(p);
        int qRoot = find(q);
        if(pRoot == qRoot){
            return;
        }
        id[pRoot] = qRoot;
        count--;
    }
}
