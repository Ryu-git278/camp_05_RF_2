package com.company.kadai;

//advice memo

import java.util.*;

public class test01 {
    public static void main(String[] args) {
        //スキャナーimport
        Scanner scanner = new Scanner(System.in);

        //質問をリスト化してランダムに表示にする準備
        List<String> question = new ArrayList<String>(5);
        question.add("memo");
        question.add("memo");
        question.add("memo");
        question.add("memo");
        question.add("memo");
        //シャッフルして、順番を変える(重複しない)
        Collections.shuffle(question);
    }
}
