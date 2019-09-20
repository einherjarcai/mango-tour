package com.einherjar.mango.admin;

/**
 * @author :   einherjar
 * @date :   2019-09-20 10:50 上午
 */
public class demo {
    public static String output = "";
    public static void foo(int i) {
        try {
            if (i == 1) {
                throw new Exception();
            }
            output += "1";
        } catch (Exception e) {
            output += "2";
            return;
        } finally {
            output += "3";
        }
        output += "4";
    }

    public static void test1(int i) {
        if (i > 0) {
            System.out.println("1");
        } else if (i > -3) {
            System.out.println("2");
        } else {
            System.out.println(3);
        }
    }

    public static void main(String[] args) {
//        foo(0);
//        foo(1);
//        System.out.println(output);
        test1(0);
    }
}
