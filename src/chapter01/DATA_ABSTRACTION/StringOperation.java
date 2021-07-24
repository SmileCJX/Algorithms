package chapter01.DATA_ABSTRACTION;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/16/016.
 * 典型的字符串处理代码
 */
public class StringOperation {

    /**
     * 判断字符串是否是一条回文
     * @param s  字符串
     * @return 是否为字符串回文
     */
    public static boolean isPalindrome(String s){
        int N = s.length();
        for (int i=0; i<N/2; i++){
            if(s.charAt(i) != s.charAt(N-1-i)){
                return false;
            }
        }
        return true;
    }

    /**
     * 从一个命令行参数中提取文件名和扩展名
     * 输入要求：带有.的字符串
     * @param s 一个文件
     * @return 文件名和扩展名的结果
     */
    public static String extractFileNameAndExtensionName(String s){
        int dot = s.indexOf(".");
        String base = s.substring(0,dot);
        String extension = s.substring(dot+1,s.length());
        return "文件名为："+base+"，扩展名为："+extension;
    }

    /**
     * 打印出标准输入流中所有含有通过命令行指定的字符串的行
     * @param query  需要被包含的字符串
     */
    public static void printString(String query){
        Scanner sc = new Scanner(System.in);
        //调用hasNext()的重载方法hasNext(String patten)：如果下一个标记与从指定字符串构造的模式匹配，则返回 true。扫描器不执行任何输入。
        while (!sc.hasNext("quit")){
            String s = sc.next();
            if(s.contains(query)){
                System.out.println(s);
            }
        }
    }

    /**
     * 以空白字符为分割符从StdIn中创建一个字符串数组
     * @return 字符串数组
     */
    public static String[] createArray(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        return words;
    }

    /**
     * 检查一个字符串数组中的元素是否已按照字母表顺序排列
     * @param s 字符串数组
     * @return 是否按照字幕表顺序排列
     */
    public static boolean isSorted(String[] s){
        for(int i=1; i<s.length; i++){
            if(s[i-1].compareTo(s[i])>0){
                return false;
            }
        }
        return true;
    }

    public static  void main(String [] args){
//        System.out.println(isPalindrome("aba"));
//        System.out.println(extractFileNameAndExtensionName("aba.pdf"));
//        printString("a");
        String[] s = createArray();
        for (String index:s){
            System.out.println(index);
        }
    }
}
