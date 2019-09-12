//授業最初

package com.company.jyugyo_naiyo;

public class Main {
//    ↑クラス名"Main" ↓は基本構文と覚えておく!

//    エメット？”psvm”を入力すると 表示される。

    public static void main(String[] args) {
	// write your code here
//        System.out.println("hello");
//        System.out.println("古屋です、ここまで、");
//        System.out.print("lnがないと改行されないよ。。");
//        System.out.print("lnがないと改行されないよ。\n");
//        System.out.print("これはどうかな？");

//        String name = "古屋";
//        System.out.println( name + "だよ");

        String hello;
        hello = "hello! world";
        System.out.println(hello);

        int num = 1;
        System.out.println(num);

            //NG例        int num = 0.1;
            //        System.out.println(num);
            //例.整数 int に 小数点以下を記載したため、エラーになる！

        double double_num;
        double_num = 0.1;
        System.out.println(double_num);

        boolean isStarted = true;
        System.out.println(isStarted);
    }
}
