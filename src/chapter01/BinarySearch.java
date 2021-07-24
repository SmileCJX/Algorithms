package chapter01;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
/*
    数组必须是有序的
 */
@RunWith(Parameterized.class)
public class BinarySearch {

    private int[] expected;// 期待的结果值

    private int[] key;// 参数1

    private int[] arr;// 参数2

    /**
     * 不允许被实例化
     */
    private BinarySearch() {

    }

    /**
     *
     * @return 返回一个集合
     */
    @Parameterized.Parameters
    public static Collection prepareData() {
        // 测试数据
        int[][][] objects = {
                { {2}, {90} , {15,50,90} },
                { {3}, {40} , {2,17,30,40,50,90} },
                { {-1},{60} , {2,17,30,40,50,90} }
        };
        return Arrays.asList(objects);// 将数组转换成集合返回
    }

    /**
     *
     * @param expected 期望值
     * @param key 关键字，需要比较的值
     * @param arr 有序数组
     */
    public BinarySearch(int[] expected, int[] key, int[] arr) {
        // 构造方法
        // JUnit会使用准备的测试数据传给构造函数
        this.expected = expected.clone();
        this.key = key.clone();
        this.arr = arr.clone();
    }

    /**
     *
     * @param key 需要检索的关键字
     * @param arr 有序数组
     * @return
     */
    public static int rank(int[] key,int[] arr){
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            // 被查找的键要么不存在，要么必然存在于 a[lo..hi] 之中
            int mid = lo + (hi - lo) / 2;
            if (key[0] < arr[mid]){
                hi = mid - 1;
            }else if (key[0] > arr[mid]) {
                lo = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    @Test
    public void testBinarySearch()
    {
        Assert.assertEquals(((int) this.expected[0]),
                rank(this.key,this.arr));
    }
}
