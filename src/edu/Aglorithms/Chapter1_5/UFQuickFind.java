package edu.Aglorithms.Chapter1_5;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by bicheng on 2018/7/13.
 */
public class UFQuickFind extends UF{

    @Override
    public int find(int p) {
        return id[p];
    }

    @Override
    public void union(int p, int q) {
        // 将p和q归并到相同的分量中
        int pID = find(p);
        int qID = find(q);
        // 如果p和q已经在相同的分量之中则不需要采取任何行动
        if(pID == qID){
            return;
        }
        // 将p的分量命名为q的名称
        for(int i = 0; i < id.length; i++){
            if (id[i] == pID) id[i] = qID;
        }
        count--;
    }

    public UFQuickFind(int N) {
        super(N);
    }

    public static void main(String[] args){
        // 解决由StdIn得到的动态连通性问题
        int N = StdIn.readInt();      // 读取触点数量
        UF uf = new  UFQuickFind(N);  //初始化N 个分量
        while(!StdIn.isEmpty()){
            int p = StdIn.readInt();
            int q = StdIn.readInt();   // 读取整数对
            if(uf.connected(p,q))
                continue;              // 如果已经连通则忽略
            uf.union(p,q);             // 归并分量
            StdOut.println(p + " " + q); // 打印连接
        }
        StdOut.println(uf.count() + "components");

    }
}
