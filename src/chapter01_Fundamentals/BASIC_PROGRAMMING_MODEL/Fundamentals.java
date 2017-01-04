package chapter01_Fundamentals.BASIC_PROGRAMMING_MODEL;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/8/008.
 */
public class Fundamentals {
    /**
     * description:
     *       Compute the greatest common divisor of
             two nonnegative integers p and q as follows:
             If q is 0, the answer is p. If not, divide p by q
             and take the remainder r. The answer is the
             greatest common divisor of q and r.
     * 计算p和q的最大公约数
     * @param p
     * @param q
     * @return 最大公约数
     */
    public static int gcd(int p,int q){
        if(q==0){
            return p;
        }
        int r = p % q;
        return gcd(q,r);
    }

    /**
     * 二分查找
     * @param key   要查找的数组元素
     * @param arr   数组首先要是有序的
     * @return 查找到的数组下标
     */
    public static int rank(int key,int[] arr){
        int lo = 0;
        int hi = arr.length-1;

        while(lo<=hi){
            // 被查找的键要么不存在，要么必然存在于 a[lo..hi] 之中
            int mid = lo+(hi-lo)/2;
            if(key < arr[mid]){
                hi = mid-1;
            }else if(key > arr[mid]){
                lo = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * Recursive implementation of binary search
     * 递归调用的父问题
     * 二分查找的递归实现
     * @param key
     * @param a
     * @return
     */
    public static int recursionRank(int key,int[] a){
        return recursionRank(key,a,0,a.length-1);
    }

    /**
     * Recursive implementation of binary search
     * 递归调用的子问题
     * @param key 查找的关键字
     * @param a   数组
     * @param low
     * @param high
     * @return
     */
    public static int recursionRank(int key,int[] a,int low,int high){
        if(low>high){
            return -1;
        }
        int mid = low + (high-low)/2;
        if(key<a[mid]){
            return recursionRank(key,a,low,mid-1);
        }else if(key>a[mid]){
            return recursionRank(key,a,mid+1,high);
        }else{
            return mid;
        }
    }

    /**
     * description:find the maximum of the array values
     * 找出数组中最大的元素
     * @param a 数组
     * @return 数组中最大的元素
     */
    public static int findMaxElement(int[] a){
        int max = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

    /**
     * description:compute the average of the array values
     * 计算数组元素的平均值
     * @param a
     * @return 数组元素的平均值
     */
    public static double calculateAverage(double[] a){
        int n = a.length;
        double sum = 0.0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        return sum/n;
    }

    /**
     * description:copy to another array
     * 复制数组
     * @param a
     * @return 被复制的数组
     */
    public static double[] copyArray(double[] a){
        int n = a.length;
        double[] b = new double[n];
        for(int i=0; i<n; i++){
            b[i] = a[i];
        }
        return b;
    }

    /**
     * description:reverse the elements within an array
     * 颠倒数组元素的顺序
     * @param a
     * @return 颠倒数组
     */
    public static int[] reverseArray(int [] a){
        int n = a.length;
        for(int i=0; i<n/2; i++){
            int temp = a[i];
            a[i] = a[n-1-i];
            a[n-1-i] = temp;
        }

        return a;
    }

    /**
     * description:matrix-matrix multiplication (square matrices)
     * 方阵相乘 设A为m*p的矩阵，B为p*n的矩阵，那么称m*n的矩阵C为矩阵A与B的乘积 *
     * @param a
     * @param b
     * @return
     */
    public static int[][] multiplySquareMatrixs(int[][] a,int[][] b){
        int n = a.length;
        int [][] c = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                //计算行i和列j的点乘
                for(int k=0; k<n; k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        return  c;
    }

    /**
     * description:matrix-matrix multiplication
     * 矩阵相乘 设A为m*p的矩阵，B为p*n的矩阵，那么称m*n的矩阵C为矩阵A与B的乘积
     * @param a 第一个矩阵
     * @param b 第二个矩阵
     * @return  矩阵相乘的结果
     */
    public static int[][] multiplyMatrixs(int[][] a,int[][] b){
        int row = a.length;
        int column = b[0].length;
        int [][] c = new int[row][column];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                for(int k=0; k<a[i].length; k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        return  c;
    }

    /**
     * absolute value of an int value
     * 计算一个浮点数的绝对值
     * @param x
     * @return 绝对值
     */
    public static int abs(int x){
        if(x<0){
            return -x;
        }else{
            return x;
        }
    }

    /**
     * absolute value of a double value
     * 计算一个浮点数的绝对值
     * @param x
     * @return 绝对值
     */
    public static double abs(double x){
        if(x<0.0){
            return -x;
        }else{
            return x;
        }
    }

    /**
     * primality test
     * 判断一个数是否是素数
     * @param n
     * @return
     */
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2; i*i<=n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * todo
     * square root( Newton’s method)
     * 计算平方根（牛顿迭代法）
     * @param c
     * @return
     */
    public static double sqrt(double c){
        if(c<0){
            return Double.NaN;
        }
        double err = 1e-15;
        double t = c;
        while(Math.abs(t-c/t) > err*t){
            t = (c/t+t)/2.0;
        }
        return t;
    }

    /**
     * hypotenuse of a right triangle
     * 计算直角三角形的斜边
     * @param a
     * @param b
     * @return
     */
    public static double hypotenuse(double a,double b){
        return Math.sqrt(a*a+b*b);
    }

    /**
     * Harmonic number
     * 计算调和级数
     * @param n
     * @return
     */
    public static double H(int n){
        double sum = 0.0;
        for(int i=1; i<n; i++){
            sum += 1/i;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int p = sc.nextInt();
//        int q = sc.nextInt();
//        System.out.println(gcd(p,q));

        int num = sc.nextInt();
        double [] arr = new double[num];
        for (int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
//        System.out.println(findMaxElement(arr));
        System.out.println(calculateAverage(arr));
    }
}
