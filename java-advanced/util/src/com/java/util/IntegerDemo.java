package com.java.util;

/**
 * Integer类练习
 * @白建坤
 * 2019.3.12
 */
public class IntegerDemo {
    public static void main(String[] args) {
        int num =31;
        //调用Integer类的方法将num进行进制转换
        //二进制
        String str1= Integer.toBinaryString(num);
        System.out.println("二进制"+str1);
        //八进制
        String str2 =Integer.toOctalString(num);
        System.out.println("八进制"+str2);
        //十六进制
        String str3=Integer.toHexString(num);
        System.out.println("十六进制"+str3);
        //七进制
        String str4=Integer.toString(num,7);
        System.out.println("七进制"+str4);
    }
    private String covnvert(int num, int radix){
        //num转为radix进制
        return "";
    }
}
