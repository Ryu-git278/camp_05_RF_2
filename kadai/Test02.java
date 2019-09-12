//package com.company.kadai;
////advice memo

//import java.util.*;
//
//public class Test02 {
//    //提出課題修正前
//
//    //お決まり-ここから始まるよ！
//    public static void main(String[] args) {
//
//        System.out.println("相性診断を始めます。いくつか質問をしますので、お答えください！");
//
////todo;ループ文…
////for(int i = 0; i < array.length; i++){  System.out.println(array[i]); }
////array.length は配列の長さを得る。
//
////これでいいの？
////ここに受け取った回答を貯める処理がいる？
////        String[] questions = {"質問1", "質問2"};
////        String[] choices = {"1: XXX, 2: YYY", "1: AAA, 2: BBBB"};
////解説より。
//        String[] questions = {"question_a", "question_b", "question_c", "question_d", "question_e"};
//        String[] answers = {"ans1", "ans2", "ans3", "ans4", "ans5"};
//
//        int sum;
//
//        Random r = new Random();
//
//        Integer[] ansered = new Integer[questions.length];
//        for (int i = 0; i < questions.length; i++) {
////            Qを出力して
//            int n = r.nextInt(questions.length);
//            ansered[i] = n;
//            if (Arrays.asList(ansered).contains(n)) {
//                i--;
//                continue;
//            }
//
//            ansered[i] = n;
//            System.out.println(questions[i]);
//            System.out.println(answers[i]);
//
//            Scanner sc = new Scanner(System.in);
//
//            answers[] words = new answers[5];
//            // スキャナー。入力受付
//            Scanner scanner = new Scanner(System.in);
//
//
//
//// 最後の合計結果の合計数で 相性を診断する。(sum)
//// （4問の場合） 4=犬猿の仲 5<10=可もなく不可もなく  11<15=まずはお友達から…  16=前世から知り合い  else=天邪鬼さん
//// 以上以下は数値でなくて、項目を作成。
//
//            int limitA = 5;
//            int limitB = 10;
//            int limitC = 15;
//            int limitD = 21;
//
//            for (int i = 0; i <= 0; i++) {
//                if (sum == limitA) {
//                    System.out.println("相性の結果は、犬猿の仲");
//                } else if (sum < limitB) {
//                    System.out.println("相性の結果は、可もなく不可もなく");
//                } else if (sum < limitC) {
//                    System.out.println("相性の結果は、まずはお友達から");
//                } else if (sum < limitD) {
//                    System.out.println("ジーク・ジオン！");
//                } else
//                    System.out.println("坊やだからさ　最初からやり直し");
//            }
//        }
//    }
//}