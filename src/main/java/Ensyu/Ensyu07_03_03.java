package Ensyu;

//StreamAPIとラムダ式の課題課題３
//時間がある方は、以下の課題に挑戦してみましょう
//ChatGPTなどの生成AIを使って、「Stream APIの基礎的な課題を作成してください」と入力しましょう
//作成された課題を実践してみましょう
//課題が終わりましたら、1on1の予約を行いましょう

//以下、ChatGPT作成の内容
//課題 3: 合計と平均の計算
//        整数のリストからStream APIを使って、合計と平均を計算してください。
//
//        合計値を出力
//        平均値を出力

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;


public class Ensyu07_03_03 {

    public static void main(String[] args) {
        // 1から10までの整数のリスト
        List<Integer> numbers = IntStream.rangeClosed(1, 10).boxed().toList();

        // 合計の計算
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        // 平均の計算
        OptionalDouble average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average();

        // 結果を出力
        System.out.println("合計: " + sum);
        average.ifPresent(avg -> System.out.println("平均: " + avg));
    }

}
