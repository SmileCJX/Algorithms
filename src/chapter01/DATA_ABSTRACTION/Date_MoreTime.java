package chapter01.DATA_ABSTRACTION;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/16/016.
 * 使用复杂方式表示日期，需要更多的耗时，更少的空间存储
 */
public class Date_MoreTime {

    private final int value;

    public Date_MoreTime(int m,int d,int y){
        value = 512*y+32*m+d;
    }

    public int getMonth(){
        return (value/32) % 16;
    }

    public int getDay(){
        return value%32;
    }

    public int getYear(){
        return value/512;
    }

    @Override
    public String toString() {
        return getMonth()+"/"+getDay()+"/"+getYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Date_MoreTime that = (Date_MoreTime) o;

        return value == that.value;

    }

    @Override
    public int hashCode() {
        return value;
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
