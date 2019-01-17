package edu.Chapter1;
/**
 * 使用1.1.6.4节中的rank()递归方法重新实现BinarySearch并跟踪该方法的调用。每当该方法被调用时，打印出它的参数
 * lo和hi并按照递归的深度缩进，提示：为递归方法添加一个参数来保存递归的深度。
 */
public class Practice1_1_22 {
    public static void main(String[] args){
        int[] array={1,3,5,7,9};
        int location=rank(3,array,0);
        if(location<0)
            System.out.println("key not found");
        else
            System.out.println("key location="+(location+1));
    }
    public static int rank(int key, int[] a,int depth) {
        return rank(key, a, 0, a.length - 1,depth);
    }
    public static int rank(int key,int[] a, int lo, int hi,int dept){
        for(int i=0;i<dept;++i)
            System.out.print(" ");
        System.out.println("low: "+lo+" high: "+hi);
        dept++;
        if(lo>hi){
            return -1;
        }
        int mid = (hi+lo)/2;
        if(key>a[mid]) return rank(key,a,mid+1,hi,dept);
        else if(key<a[mid]) return rank(key, a, lo,mid-1,dept);
        else return mid;
    }
}
