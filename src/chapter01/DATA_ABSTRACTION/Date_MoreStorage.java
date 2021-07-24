package chapter01.DATA_ABSTRACTION;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/16/016.
 * 使用简单方式表示日期，需要更多的空间存储，更少的耗时
 */
public class Date_MoreStorage {

    private final int month;
    private final int day;
    private final int year;

    public Date_MoreStorage(int m, int d, int y){
        month = m;
        day = d;
        year = y;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
       return getMonth()+"/"+getDay()+"/"+getYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Date_MoreStorage that = (Date_MoreStorage) o;

        if (month != that.month) return false;
        if (day != that.day) return false;
        return year == that.year;

    }

    @Override
    public int hashCode() {
        int result = month;
        result = 31 * result + day;
        result = 31 * result + year;
        return result;
    }

    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        int y = sc.nextInt();
        Date_MoreStorage dateMoreStorage = new Date_MoreStorage(m,d,y);
        System.out.println(dateMoreStorage);
    }
}
