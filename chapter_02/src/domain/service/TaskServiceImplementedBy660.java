package domain.service;

import java.util.Scanner;
import java.util.Random;

public class TaskServiceImplementedBy660 implements ITask {
    @Override
    public void learnOperatorPriority() {
        int x = 2;
        int y = 3;
        String answer = "x + y = " + (x + y);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println(answer);
    }

    @Override
    public void learnTypeConversion() {
        // ①int x = 1 + 2.0;
        // ②double d = 4.0F
        // ③int i = "9";
        // ④String s = 3 + " days";
        // ⑤byte b = 7;
        // ⑥double d = true;
        // ⑦short s = (byte)2;

        double d = 4.0F;
        String s = 3 + " days";
        byte b = 7;

        System.out.println("正しい文は②" + d + ", ④" + s + ", ⑤" + b + "です。");
    }

    @Override
    public void fortuneGame() {

        // 1. 画面に「ようこそ占いの館へ」と表示
        // 2. 画面に「あなたの名前を入力してください」と表示
        // 3. キーボードから１行の文字入力を受け付け、String型の変数nameに格納
        // 4. 画面に「あなたの年齢を入力してください」と表示
        // 5. キーボードから１行の文字入力を受け付け、String型の変数ageStringに格納
        // 6. 変数ageStringの内容をint型に変換し、int型の変数ageに代入
        // 7. ０から３までの乱数を生成し、int型の変数fortuneに代入
        // 8. fortuneの数値をインクリメント演算子で１増やし、１から４の乱数する
        // 9. 画面に「占いの結果が出ました！」と表示
        // 10. 画面に「(年齢)歳の(名前)さん、あなたの運気番号は(乱数)です。」と表示 ※カッコの中身は変数
        // 11. 画面に「1:大吉 2:中吉 3:吉 4:凶」と表示
        // ヒント：
        //   文字入力受付  java.util.Scanner
        //   ランダム生成  java.util.Random

        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください");

        Scanner names = new Scanner(System.in);
        String name = names.next();

        System.out.println("あなたの年齢を入力してください");

        Scanner ages = new Scanner(System.in);
        String ageString = ages.next();

        int age = Integer.parseInt(ageString);

        int fortune = (int)(Math.random() * 4);

        fortune++;

        System.out.println("占いの結果が出ました！");
        System.out.println(age + "歳の"+ name + "さん、あなたの運気番号は" + fortune + "です。");
        System.out.println("1:大吉 2:中吉 3:吉 4:凶");

    }
}
