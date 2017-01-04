package chapter01_Fundamentals.DATA_ABSTRACTION.Accumulator;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/16/016.
 */
public class TestAccumulator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Accumulator accumulator = new Accumulator();
        for (int i=0; i<num; i++){
            accumulator.addDateValue(new Random().nextInt(100));
        }

        System.out.println(accumulator);
    }
}
