package com.company.kadai;
//これが提出文。
//todo:special Thanks 木村先生 ＆ 橋本さん！

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NewKadai2 {
    //提出課題修正前

    //お決まり-ここから始まるよ！
    public static void main(String[] args) {

    System.out.println("相性診断を始めます。いくつか質問をしますので、お答えください！");

//完了：ループ文とは、
//for(int i = 0; i < array.length; i++){  System.out.println(array[i]); }
//array.length は配列の長さを得る。

//これでいいの？
//ここに受け取った回答を貯める処理がいる？
//        String[] questions = {"質問1", "質問2"};
//        String[] choices = {"1: XXX, 2: YYY", "1: AAA, 2: BBBB"};
//解説より。
//        String[] questions = {"question_a", "question_b", "question_c", "question_d", "question_e"};
//        String[] answers = {"ans1", "ans2", "ans3", "ans4", "ans5"};

//        int sum = 0;
//        for () {
//            System.out.println(questions[i]);
//        }


//ArrayListとループ処理サンプル  質問をリスト化 ＆ 更に ランダムに表示にする準備（todo:橋本さんに教わる！）
        List<String> question = new ArrayList<String>(5);
        question.add("私はカレーより肉じゃが派である");
        question.add("私は寝なくても平気である");
        question.add("レコードに振れたことがない");
        question.add("海や山よりタウン派である");
        question.add("地球連邦ばんざーい");
        //シャッフルして、順番を変える【重複しない】
        Collections.shuffle(question);

//質問A[開始]

//回答を入力させる-（受け取る Scanner）
//完了：一回ここが不明！※無い回答は受け取らない。範囲外の整数NG・文字NG＝一応の解決！？
//完了：答えの回答結果への個別回答：多分 条件分岐(userAns)にする

        System.out.println("質問A：" + question.get(0));
    //選択肢を配列とforで作成
        String[] anser1 = {"１：とても当てはまる", "２：当てはまる", "３：あまり当てはまらない", "４：当てはまらない"};
        for (int i = 0; i < anser1.length; i++) {
            System.out.print(anser1[i]);
        }
    //解答番号入力部分
        int userAns = new java.util.Scanner(System.in).nextInt();

        for (int i = 0; i <= 0; i++) {
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
        }


//質問A[終了]

//質問B[開始]
        System.out.println("質問B：" + question.get(1));
    //選択肢を配列とforで作成
        String[] anser2 = {"１：とても当てはまる", "２：当てはまる", "３：あまり当てはまらない", "４：当てはまらない"};
        for (int i = 0; i < anser2.length; i++) {
            System.out.print(anser2[i]);
        }
    //解答番号入力部分
        int userAns2 = new java.util.Scanner(System.in).nextInt();

        for (int i = 0; i <= 0; i++) {
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
        }


//質問B[終了]

//質問C[開始]
        System.out.println("質問C：" + question.get(2));
    //選択肢を配列とforで作成
        String[] anser3 = {"１：とても当てはまる", "２：当てはまる", "３：あまり当てはまらない", "４：当てはまらない"};
        for (int i = 0; i < anser3.length; i++) {
            System.out.print(anser3[i]);
        }
    //解答番号入力部分
        int userAns3 = new java.util.Scanner(System.in).nextInt();

        for (int i = 0; i <= 0; i++) {
            if (userAns3 == 1) {
                System.out.println("まじで！当てはまらないの！？信じられん");
            } else if (userAns3 == 2) {
                System.out.println("人生損しているでしょう");
            } else if (userAns3 == 3) {
                System.out.println("残念です。もう少しで信頼できたのに");
            } else if (userAns3 == 4) {
                System.out.println("相性がよさそうです");
            } else {
                System.out.println("天邪鬼さん");
            }
        }

//質問C[終了]

//質問D[開始]
        System.out.println("質問D：" + question.get(3));
    //選択肢を配列とforで作成
        String[] anser4 = {"１：とても当てはまる", "２：当てはまる", "３：あまり当てはまらない", "４：当てはまらない"};
        for (int i = 0; i < anser4.length; i++) {
            System.out.print(anser4[i]);
        }
    //解答番号入力部分
        int userAns4 = new java.util.Scanner(System.in).nextInt();

        for (int i = 0; i <= 0; i++) {
            if (userAns4 == 1) {
                System.out.println("まじで！当てはまらないの！？信じられん");
            } else if (userAns4 == 2) {
                System.out.println("人生損しているでしょう");
            } else if (userAns4 == 3) {
                System.out.println("残念です。もう少しで信頼できたのに");
            } else if (userAns4 == 4) {
                System.out.println("相性がよさそうです");
            } else {
                System.out.println("天邪鬼さん");
            }
        }

//質問D[終了]

//質問E[開始]
        System.out.println("最後の質問です。");
        System.out.println("質問E：" + question.get(4));
    //選択肢を配列とforで作成
        String[] anser5 = {"１：とても当てはまる", "２：当てはまる", "３：あまり当てはまらない", "４：当てはまらない"};
        for (int i = 0; i < anser5.length; i++) {
            System.out.print(anser5[i]);
        }
    //解答番号入力部分
        int userAns5 = new java.util.Scanner(System.in).nextInt();

        for (int i = 0; i <= 0; i++) {
            if (userAns5 == 1) {
                System.out.println("まじで！当てはまらないの！？信じられん");
            } else if (userAns5 == 2) {
                System.out.println("人生損しているでしょう");
            } else if (userAns5 == 3) {
                System.out.println("残念です。もう少しで信頼できたのに");
            } else if (userAns5 == 4) {
                System.out.println("相性がよさそうです");
            } else {
                System.out.println("天邪鬼さん");
            }
        }

//質問E[終了]

//質問終了


//質問を 5回を繰り返して、＊＊＊＊＊＊＊＊＊＊＊
//合計を集計する

        int sum = userAns + userAns2 + userAns3 + userAns4 + userAns5;

// 最後の合計結果の合計数で 相性を診断する。(sum)
// （4問の場合） 4=犬猿の仲 5<10=可もなく不可もなく  11<15=まずはお友達から…  16=前世から知り合い  else=天邪鬼さん
// 以上以下は数値でなくて、項目を作成。

        int limitA = 5;
        int limitB = 10;
        int limitC = 15;
        int limitD = 21;

        for (int i = 0; i <= 0; i++) {
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
    }
}