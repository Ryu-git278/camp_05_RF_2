//授業中盤

package com.company.jyugyo_naiyo;

public class Main2 {

    public static void main(String[] args) {
        String[] hello = new String[4];

        hello[0]="hello";
        hello[1]="こんにちは";
        hello[2]="你好";
        hello[3]="Bonjour";

        System.out.println(hello.length);
//       length＝変数はいくつかるか確認できる。
        System.out.println(hello[0]);
        System.out.println(hello[1]);
        System.out.println(hello[2]);
        System.out.println(hello[3]);

//        上記で、変数 宣言、配列、初期化が指示できた！

        String[] hello2 ={"hello","こんにちは","你好","Bonjour"};
        System.out.println(hello2.length);

//        上記は文字列。では、以下で整数値を記載してみよう！

        int[] numbers = {1,2,3,4,5};
        System.out.println(numbers.length);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

//  表示++について　1+1 と同じです。以下.例　0が 1になる

        int i = 0;
        i++;
        System.out.println(i);

    }
}
