package edu.Chapter1;
import java.util.Arrays;
/**
 * 等值键。为BinarySearch类添加一个静态方法rank()，它接受一个键和一个整数有序数组（可能存在重复的键）
 * 作为参数并返回数组中小于该键的元素数量，以及一个类似的方法count()来返回数组中等于该键的元素的数量。注意：
 * 如果i和j分别是rank(key,a)和count(key,a)的返回值，那么a[i...i+j-1]就是数组中所有和key相等的元素
 */
public class Practice1_1_29 {
    public static void main(String[] args) {
        int[] a = {1,1,2,3,6,5,8,5,6,22,3,6,3,6,99};
        Arrays.sort(a);
        for (int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("与key相等的元素有: " + count(4,a) + " 个");
        System.out.println("小于key的元素的数量有: " + rank(4,a) + " 个");
    }

    public static int count(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        int count = 0;
        while (lo <= hi) {
            int mid = (hi + lo) / 2;
            if (a[mid] > key) {
                hi = mid - 1;
            } else if (a[mid] < key) {
                lo = mid + 1;
            } else {
                int temp = mid;
                if (mid > 0) {
                    while (a[mid] == a[mid - 1]) {
                        count++;
                        mid--;
                        if (mid == 0) {
                            break;
                        }
                    }
                }
                mid = temp;
                if (mid < a.length - 1) {
                    while (a[mid] == a[mid + 1]) {
                        count++;
                        mid++;
                        if (mid == a.length - 1) {
                            break;
                        }
                    }
                }
                return count+1;
            }
        }
        return count;
    }

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        int mid = 0;
        while (lo <= hi) {
            mid = (hi + lo) / 2;
            if (a[mid] > key) {
                hi = mid - 1;
            } else if (a[mid] < key) {
                lo = mid + 1;
            } else {
                if (mid > 0) {
                    while (a[mid] == a[mid - 1]) {
                        mid--;
                        if (mid == 0) {
                            break;
                        }
                    }
                }
                return mid;
            }
        }
        if (a[mid] > key) {
            return mid;
        } else {
            return mid-1;
        }

    }
}
