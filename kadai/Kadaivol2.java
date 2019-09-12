package com.company.kadai;
/*ここを編集中！Backup
【再提出】ループ処理が使われていない

ループ処理をどこに掛ける？？

mainメソッド、
変数は a=1 、プリントインでaは1ですと表示させる
for文は a=1の時 〇〇　=2のとき×× =その他 の時 ▽▽

で、繰り返し処理とは、 指定の 変数になるまで、X回数 処理を繰り返すこと。

宿題の確認
条件
・相性診断ツールを作る
・質問は5つ、答えを連動させる
・for または while文の配列を使う
以上…

提出済み課題でも 作成ができているが…。

多分 ループ処理させるのは、問題？

問題1 ～ 5を ループさせて、問題6は、無し。的な感じかな？？
よしチャレンジだ！

*/


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Kadaivol2 {
    public static void main(String[] args) {

//      解説にあった質問のrandom表示を実装
        String[] questions = {"question_a", "question_b", "question_c", "question_d", "question_e"};
        String[] answers = {"ans1", "ans2", "ans3", "ans4", "ans5"};

        Scanner sc = new Scanner(System.in);

//        int sun; //todo;これはなんで書くのか忘れる…。

//        Random r = new Random(); //todo;random表示の解説。使いたかったけれども、その前の時点で躓く。

        //整数　回答
        Integer[] ansered = new Integer[questions.length];
        for (int i = 0; i < questions.length; i++) {
//            Qを出力して
            int n = sc.nextInt(questions.length);
            ansered[i] = n;
            if (Arrays.asList(ansered).contains(n)) {
                i--;
                continue;
            }

            ansered[i] = n;

//            回答と質問を表示
            System.out.println(questions[i]);
            System.out.println(answers[i]);

        }

////        質問A
////質問を表示させる
            String question_a;
            System.out.println("＊＊次の質問だ！(数字を入れないとエラーになるよ！)＊＊");
            question_a = "私はカレーが好きだ";
            System.out.println(question_a);

//回答例をを表示させる

            String[] ans1 = new String[4];
            ans1[0] = "1：あてはまらない";
            ans1[1] = "2：あまりあてはまらない";
            ans1[2] = "3：まあまああてはまる";
            ans1[3] = "4：あてはまる";

            System.out.print(ans1[0]);
            System.out.print(ans1[1]);
            System.out.print(ans1[2]);
            System.out.println(ans1[3]);

//回答を入力させる-（受け取る Scanner）
//一回ここが不明！※無い回答は受け取らない。範囲外の整数NG・文字NG＝一応の解決！？

            int userAns = new java.util.Scanner(System.in).nextInt();

            //ここに受け取った回答を貯める処理がいる？

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
}
