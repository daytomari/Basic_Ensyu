package Ensyu;

//StreamAPIとラムダ式の課題課題３
//時間がある方は、以下の課題に挑戦してみましょう
//ChatGPTなどの生成AIを使って、「Stream APIの基礎的な課題を作成してください」と入力しましょう
//作成された課題を実践してみましょう
//課題が終わりましたら、1on1の予約を行いましょう

//以下、ChatGPT作成の内容
//課題 2: 文字列のフィルタリングと変換
//        文字列のリストから、特定の文字で始まる単語のみを抽出し、大文字に変換して出力してください。
//
//        "a" で始まる文字列を抽出
//        すべて大文字に変換
//        結果をコンソールに出力

import java.util.List;
import java.util.stream.Collectors;

public class Ensyu07_03_02 {

    public static void main(String[] args) {
        // サンプル文字列リスト
        List<String> words = List.of("apple", "banana", "apricot", "orange", "avocado");

        // "a"で始まる文字列をフィルタリングして大文字に変換
        List<String> filteredWords = words.stream()
                .filter(word -> word.startsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // 結果を出力
        System.out.println(filteredWords);
    }

}
