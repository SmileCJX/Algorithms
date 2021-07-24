package chapter01;

import basic.StdOut;
import basic.StdRandom;

/**
 * @ClassName RandomSeq
 * @Description: 生成随机数
 * @Author JunXiangCai
 * @Date 2021/7/24
 * @Version V1.0
 **/
public class RandomSeq {

    /**
     * 防止被实例化
     */
    private RandomSeq() {

    }

    public static void main(String args[]) {
        // 命令行参数
        int n = args.length;

        if (1 == args.length) {
            for (int i = 0; i < n; i++) {
                // 随机生成0-1之间的数值
                double x = StdRandom.uniform();
                StdOut.println(x);
            }
        } else if (3 == args.length) {
            double lo = Double.parseDouble(args[1]);
            double hi = Double.parseDouble(args[2]);
            for (int i = 0; i < n; i++) {
                double x = StdRandom.uniform(lo, hi);
                StdOut.printf("%.2f\n", x);
            }
        } else {
            throw new IllegalArgumentException("无效的参数个数");
        }
    }
}
