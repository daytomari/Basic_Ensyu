package Ensyu;

//StreamAPIとラムダ式の課題課題１
//◆文字列のリストを作成しましょう。要素数は10個にしましょう
//◆その文字列に対して、文字数が2以上のものを抽出して、文字列に変換をしてください。
//　区切り文字はカンマ（，）で行いましょう
//◆その文字列を出力しましょう

import java.util.List;

public class Ensyu07_01kai {
  public static void main(String[] args){
    List<String> strList = List.of(
        "Sato","Igarashi","Minami","Tanaka","Sasaki",
        "Watanabe","Yamamoto","Ohkubo","Hayashi","Kato"
    );

    strList.stream()
        .map(String::length)//各リストの文字数
        .forEach(System.out::println);

    strList.stream()
        .sorted()//昇順での並べ替え　Unicode順
        //.sorted(Comparator.reverseOrder())//降順での並べ替え　Compartorのインポート必要
        .forEach(System.out::println);
  }

}
