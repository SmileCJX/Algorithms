package chapter01.DATA_ABSTRACTION.Accumulator;

/**
 * Created by Administrator on 2016/12/16/016.
 * 累加器数据类型的实现
 */
public class Accumulator {

    private double total;

    private int N;

    /**
     * 添加一个新的数据值
     * @param val 新的数据值
     */
    public void addDateValue(double val){
        N++;
        total += val;
    }

    /**
     * @return 所有数据值的平均值
     */
    public double mean(){
        return total/N;
    }

    @Override
    public String toString() {
       return "Mean("+N+" values):"+String.format("%7.5f",mean());
    }
}
