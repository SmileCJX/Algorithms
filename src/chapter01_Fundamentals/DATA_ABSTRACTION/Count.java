package chapter01_Fundamentals.DATA_ABSTRACTION;

/**
 * Created by Administrator on 2016/12/16/016.
 */
public class Count {

    private final String name ;

    private int count;

    public Count(String  id){
        name = id;
    }

    public void increment(){
        count++;
    }

    public int tally(){
        return count;
    }

    @Override
    public String toString() {
        return "Count{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    public static void main(String[] args){
        Count heads = new Count("heads");
        Count tails = new Count("tails");

        heads.increment();
        heads.increment();
        tails.increment();

        System.out.println(heads+" "+tails);
        System.out.println(heads.tally()+" "+tails.tally());
    }
}
