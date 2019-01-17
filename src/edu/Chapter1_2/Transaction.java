package edu.Chapter1_2;

import edu.princeton.cs.algs4.StdOut;

/**
 *实现Transaction以Date为模板创建，并实现equals() 方法
 */
public class Transaction {

    private String who;
    private SmartDate when;
    private double amount;

    public Transaction(String who, SmartDate when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    public String who(){
        return this.who;
    }
    public SmartDate when(){
        return this.when;
    }

    public double amount(){
        return this.amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "who='" + who + '\'' +
                ", when=" + when +
                ", amount=" + amount +
                '}';
    }
    public boolean equals(Object x){
        if(this == x)
            return true;
        if(x == null)
            return false;
        if(this.getClass() != x.getClass()) return false;
        Transaction that = (Transaction)x;
        if(this.who != that.who) return false;
        if(!this.when.equals(that.when)) return false;
        if(this.amount != that.amount) return false;
        return true;
    }

    public static void main(String[] args){
        try {
            Transaction transaction1 = new Transaction("Tim",new SmartDate(4,25,2013),250.33);
            Transaction transaction2 = new Transaction("Tim",new SmartDate(4,25,2013),250.33);
            StdOut.println(transaction1.equals(transaction2));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
