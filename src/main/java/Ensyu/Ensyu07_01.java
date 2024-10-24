package Ensyu;

//StreamAPIとラムダ式の課題課題１
//◆文字列のリストを作成しましょう。要素数は10個にしましょう
//◆その文字列に対して、文字数が2以上のものを抽出して、文字列に変換をしてください。
//　区切り文字はカンマ（，）で行いましょう
//◆その文字列を出力しましょう

import java.util.List;
import java.util.stream.Collectors;

public class Ensyu07_01 {

    public static void main(String[] args) {
        List<String> studentList = List.of(
                "佐藤", "五十嵐", "南", "田中", "佐々木",
                "渡辺", "山本", "大久保", "林", "加藤"
        );

        System.out.print("2文字以上の文字列：　");
        System.out.println(studentList.stream()
                .filter(str -> str.length() >= 2)
                .collect(Collectors.joining(","))
        );
    }


}
