package Ensyu;

//StreamAPIとラムダ式の課題課題３
//時間がある方は、以下の課題に挑戦してみましょう
//ChatGPTなどの生成AIを使って、「Stream APIの基礎的な課題を作成してください」と入力しましょう
//作成された課題を実践してみましょう
//課題が終わりましたら、1on1の予約を行いましょう

//以下、ChatGPT作成の内容
//課題 1: 数のフィルタリング
//1から20までの整数をリストに格納し、Stream APIを使って以下の条件に従ってフィルタリングを行ってください。
//
//偶数のみをフィルタリングする
//        フィルタリングされた結果をコンソールに出力する

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ensyu07_03_01 {

    public static void main(String[] args) {
        // 1から20までの整数のリストを生成
        List<Integer> numbers = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());

        // 偶数のみをフィルタリング
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        // 結果を出力
        System.out.println(evenNumbers);

    }

}
