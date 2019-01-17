package edu.Chapter1_2;

/**
 * 如果字符串s中的字符循环移动任意位置之后能够得到另一个字符串t,那么s就被称为t的回环变位
 */
public class Practice1_2_6 {

    public static void main(String[] args){
        String s = "ACTGACG";
        String t = "TGACGAC";
        circulaRotation(s,t);
    }
    /**
     * s拼接s查看t在不在这个字符串中
     * @param s
     * @param t
     */
    public static void circulaRotation(String s, String t){
        if (s.length() == t.length() && s.concat(s).indexOf(t) != -1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}