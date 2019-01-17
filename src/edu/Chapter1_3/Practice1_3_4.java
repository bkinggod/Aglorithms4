package edu.Chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.3.4 编写一个Stack 的用例Parentheses,从标准输入中读取一个文本流并使用栈判定其中的括号是否配对完整。
 * 例如，对于[()]{}{[()()]()}程序应该打印true,对于[(])则打印false。
 */
public class Practice1_3_4 {

    public static void main(String[] args) {
        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(100);
        boolean flag = false;
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (item.equals("{") || item.equals("[") || item.equals("(")) {
                s.push(item);
            } else if (!s.isEmpty() && (item.equals("}") || item.equals("]") || item.equals(")"))) {
                if(item.equals("}")){
                    String next = s.pop();
                    if(next.equals("{")){
                        continue;
                    }else{
                        flag = true;
                        break;
                    }
                }else if(item.equals("]")){
                    String next = s.pop();
                    if(next.equals("[")){
                        continue;
                    }else{
                        flag = true;
                        break;
                    }
                }else if(item.equals(")")){
                    String next = s.pop();
                    if(next.equals("(")){
                        continue;
                    }else{
                        flag = true;
                        break;
                    }
                }
            }else {
                flag = true;
                break;
            }
        }
        if(flag){
            StdOut.println(false);
        }else{
            StdOut.println(true);
        }

    }
}
