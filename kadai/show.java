//初回提出課題修正前

package com.company.kadai;
import java.util.Scanner;


//今回の課題の名前。
public class show {

    //お決まり-ここから始まるよ！
    public static void main(String[] args) {

//todo;ループ文…

System.out.println("＊＊はじまるの呪文を唱えるのじゃ（好きな数字を入れてね）＊＊");
        //      型名    変数名
//        回答入力は1つ、という解釈だけれども…。
        Scanner scanner = new Scanner(System.in);



        String [] inputs = new String[1];
        for(int i = 0; i <1;i++) {
            String input = scanner.next();
        }
        for (int i = 0; i < inputs.length; i++){
            System.out.println(inputs[i]);
        }
        //今 ヌル。


//        for(int i = 0; i < array.length; i++){  System.out.println(array[i]); }
//array.length は配列の長さを得る。

//これでいいの？
//ここに受け取った回答を貯める処理がいる？

//        質問A
//質問を表示させる
        String question_a;
        System.out.println("＊＊さぁ質問だ！(数字を入れないとエラーになるよ！)＊＊");
        question_a = "私はカレーが好きだ";
        System.out.println(question_a);

//回答例をを表示させる
//        todo:短くできそう！

        String[] ans = new String[4];
        ans[0] = "1：あてはまらない";
        ans[1] = "2：あまりあてはまらない";
        ans[2] = "3：まあまああてはまる";
        ans[3] = "4：あてはまる";

        System.out.print(ans[0]);
        System.out.print(ans[1]);
        System.out.print(ans[2]);
        System.out.println(ans[3]);

//回答を入力させる-（受け取る Scanner）
//一回ここが不明！※無い回答は受け取らない。範囲外の整数NG・文字NG＝一応の解決！？

        int userAns = new java.util.Scanner(System.in).nextInt();

// 答えの回答結果への個別回答：多分 条件分岐(userAns)にする
//        省略

        if (userAns == 1) {
            System.out.println("まじで！当てはまらないの！？信じられん");
        } else if (userAns == 2) {
            System.out.println("人生損しているでしょう");
        } else if (userAns == 3) {
            System.out.println("残念です。もう少しで信頼できたのに");
        } else if (userAns == 4) {
            System.out.println("相性がよさそうです");
        } else {
            System.out.println("天邪鬼さん");
        }


//        質問B
//質問を表示させる
        String question_b;
        question_b = "私は睡眠が好きだ";

        System.out.println("＊＊次の質問だ！(数字を入れないとエラーになるよ！)＊＊");
        System.out.println(question_b);

//回答例をを表示させる
        String[] ans2 = new String[4];
        ans2[0] = "1：あてはまらない";
        ans2[1] = "2：あまりあてはまらない";
        ans2[2] = "3：まあまああてはまる";
        ans2[3] = "4：あてはまる";

        System.out.print(ans2[0]);
        System.out.print(ans2[1]);
        System.out.print(ans2[2]);
        System.out.println(ans2[3]);

//回答を入力させる-（受け取る Scanner）

        int userAns2 = new java.util.Scanner(System.in).nextInt();

        if (userAns2 == 1) {
            System.out.println("まじで！当てはまらないの！？信じられん");
        } else if (userAns2 == 2) {
            System.out.println("人生損しているでしょう");
        } else if (userAns2 == 3) {
            System.out.println("残念です。もう少しで信頼できたのに");
        } else if (userAns2 == 4) {
            System.out.println("相性がよさそうです");
        } else {
            System.out.println("天邪鬼さん");
        }


//        質問C
//質問を表示させる
        String question_C;
        System.out.println("＊＊次の質問だ！(数字を入れないとエラーになるよ！)＊＊");
        question_C = "家にレコードがある";
        System.out.println(question_C);

//回答例をを表示させる
        String[] ans3 = new String[4];
        ans3[0] = "1：家にないです";
        ans3[1] = "2：祖父祖母の家にはあったかも…";
        ans3[2] = "3：持ってるけどプレーヤーがない";
        ans3[3] = "4：普段から聴いている";

        System.out.print(ans3[0]);
        System.out.print(ans3[1]);
        System.out.print(ans3[2]);
        System.out.println(ans3[3]);

//回答を入力させる-（受け取る Scanner）

        int userAns3 = new java.util.Scanner(System.in).nextInt();

        if (userAns3 == 1) {
            System.out.println("人生損しているでしょう");
        } else if (userAns3 == 2) {
            System.out.println("今すぐ買いに行こう！");
        } else if (userAns3 == 3) {
            System.out.println("残念です。もう少しで信頼できたのに");
        } else if (userAns3 == 4) {
            System.out.println("この機会にスピーカーにこだわってみましょう！");
        } else {
            System.out.println("天邪鬼さん");
        }

//        質問D
//質問を表示させる
        String question_D;
        System.out.println("＊＊次の質問だ！＊＊(数字を入れないとエラーになるよ！)");
        question_D = "良く登山に行く";
        System.out.println(question_D);

//回答例をを表示させる
        String[] ans4 = new String[4];
        ans4[0] = "1：100名山 看破済み";
        ans4[1] = "2：行ってみたいと思ってる";
        ans4[2] = "3：中級レベルで行きます。";
        ans4[3] = "4：ビギナーレベルで行きます。";

        System.out.print(ans4[0]);
        System.out.print(ans4[1]);
        System.out.print(ans4[2]);
        System.out.println(ans4[3]);

//回答を入力させる-（受け取る Scanner）

        int userAns4 = new java.util.Scanner(System.in).nextInt();

        if (userAns4 == 1) {
            System.out.println("マジですか！めっちゃ凄いですね");
        } else if (userAns4 == 2) {
            System.out.println("次のお休みに行きましょう");
        } else if (userAns4 == 3) {
            System.out.println("私はソロが好きです！");
        } else if (userAns4 == 4) {
            System.out.println("良いですね！");
        } else {
            System.out.println("天邪鬼さん");
        }



//        質問E
//質問を表示させる
        String question_E;
        System.out.println("＊＊これで最後の質問だ！＊＊(数字を入れないとエラーになるよ！)");
        question_E = "ジオン派である";
        System.out.println(question_E);

//回答例をを表示させる
        String[] ans5 = new String[4];
        ans5[0] = "1：地球連邦派又は、知らない";
        ans5[1] = "2：ティターンズ派";
        ans5[2] = "3：ネオ・ジオン派。";
        ans5[3] = "4：ジークジオン！！。";

        System.out.print(ans5[0]);
        System.out.print(ans5[1]);
        System.out.print(ans5[2]);
        System.out.println(ans5[3]);

//回答を入力させる-（受け取る Scanner）

        int userAns5 = new java.util.Scanner(System.in).nextInt();

        if (userAns5 == 1) {
            System.out.println("ジオン公国に栄光あれ");
        } else if (userAns5 == 2) {
            System.out.println("ソーラレイスタンバイ");
        } else if (userAns5 == 3) {
            System.out.println("冗談は止せ");
        } else if (userAns5 == 4) {
            System.out.println("ジークジオン！！");
        } else {
            System.out.println("当たらなければどうということは無い！");
        }



//質問を 4回を繰り返して、＊＊＊＊＊＊＊＊＊＊＊
//合計を集計する

        int sum = userAns + userAns2 + userAns3 + userAns4 + userAns5;

// 最後の合計結果の合計数で 相性を診断する。(sum)
// （4問の場合） 4=犬猿の仲 5<10=可もなく不可もなく  11<15=まずはお友達から…  16=前世から知り合い  else=天邪鬼さん
// 以上以下は数値でなくて、項目を作成。

        int limitA = 5;
        int limitB = 10;
        int limitC = 15;
        int limitD = 20;

        if (sum == limitA) {
            System.out.println("相性の結果は、犬猿の仲");
        } else if (sum < limitB) {
            System.out.println("相性の結果は、可もなく不可もなく");
        } else if (sum < limitC) {
            System.out.println("相性の結果は、まずはお友達から");
        } else if (sum < limitD) {
            System.out.println("ジーク・ジオン！");
        } else
            System.out.println("坊やだからさ　最初からやり直し");
    }

//plus α！＊＊＊＊＊＊＊＊＊＊＊＊＊

//todo:定された範囲の数値入力が必要な場面で
//  指定範囲外の数値が入力された時に入力をやり直し。

}