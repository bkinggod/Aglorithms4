package edu.Chapter1_2;

import edu.princeton.cs.algs4.StdOut;

/**
 * 1.2.11
 * 根据Date的API实现一个SmartDate类型，在日期非法时抛出一个异常
 */
public class SmartDate {

    private int month;
    private int day;
    private int year;

    public SmartDate(int m, int d, int y) throws Exception {
        if(!validate(m,d,y)){
            throw new IllegalArgumentException("非法参数:" + m + "/"+ d + "/"+ y);
        }
        this.month = m;
        this.day = d;
        this.year = y;
    }
    public int month(){
        return this.month;
    }
    public int day(){
        return this.day();
    }
    public int year(){
        return this.year;
    }
    public String toString(){
        return month() + "/" + day() + "/" + year();
    }

    /**
     * 在SmartDate添加一个方法dayOfTheWeek()，为日期中的日返回Monday,Tuesday,Wednesday,Thursday
     * Friday, Saturday或Sunday中的适当值，你可以假定时间是21世纪
     * @return
     */
    public String dayOfTheWeek(){
        int dd = this.day;
        int[] dmArr;
        int[] dmLArr = {0, 5, 1, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        int[] dmNArr = {0, 6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if(isLeapYear(year)){
            dmArr = dmLArr;
        }else{
            dmArr = dmNArr;
        }
        int md = dmArr[month];
        String ystr =new Integer(year).toString();
        int yInt =Integer.parseInt(ystr.substring(ystr.length()-2,ystr.length()));
        int yd = ((yInt/4)+yInt)%7;
        switch ((dd+md+yd)%7){
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
        }
        return "";
    }
    private boolean isLeapYear(int y){
        if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
        {
            return true;
        }
        return false;
    }
    public boolean equals(Object x){
        if(this == x)
            return true;
        if(x == null)
            return false;
        if(this.getClass() != x.getClass()) return false;
        SmartDate that = (SmartDate)x;
        if(this.day != that.day) return false;
        if(this.month != that.month) return false;
        if(this.year != that.year) return false;
        return true;
    }

    /**
     * 判断年、月、日参数是否非法
     * @param m
     * @param d
     * @param y
     * @return
     */
    private boolean validate(int m, int d, int y)
    {
        if (y == 0 || y < -1000 || y > 10000)
            return false;
        if (m < 1 || m > 12)
            return false;
        if (d < 1 || d > 31)
            return false;
        int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (d > months[m])
            return false;
        if (!(y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)))
        {
            if (d > 28)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        try {
            SmartDate date = new SmartDate(4,25,2010);
            StdOut.println(date.dayOfTheWeek());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
