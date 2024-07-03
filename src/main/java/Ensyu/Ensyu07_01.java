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

<<<<<<< HEAD
    System.out.println(strList.stream()
            .filter(str -> str.length() >= 2)
            .collect(Collectors.joining(","))
=======
//    System.out.println(studentList.stream()
//        .map(String::toString)
//        .sorted()
//        .distinct()
//        .filter(v -> v.startsWith("田"))
//        .findFirst())
//    ;

    System.out.println(studentList.stream()
        .filter(str -> str.length() >= 2)
        .collect(Collectors.joining(","))
>>>>>>> 74aa99d5e31fc31a620a85ba3a3c22b912052529
    );
  }

}
