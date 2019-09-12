//授業終盤 ライブラリー（他の方は4がないので、4）
package com.company.jyugyo_naiyo;

//Scanner   をCLASS内に記述すると、importの下りが自動出現
import java.util.Random;

public class Main5 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            String input = scanner.next();
//            System.out.println(input);
//            if (input.equals("exit")){
//                break;
        Random random = new Random();
        int n = random.nextInt();
        System.out.println(n);
            }
        }

//while (true) {で無限ループに
//breakは繰り返し処理を終了させる