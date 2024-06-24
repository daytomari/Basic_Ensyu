package Ensyu;

//繰り返し処理の課題課題2
//MAPを作成しましょう生徒名と番号の組み合わせ（1,”田中")
//MAPの要素は10個以上
//Mapの中の番号が偶数のものをMAPから削除しましょう
//上記の処理の繰り返し処理を実装しましょう
//削除した状態のものを出力して表示しましょう

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Ensyu06_02a {

  public static void main(String[] args) {
    Map<Integer, String> studentList = Map.of( //Map of はMap内の順序を変更することができない

        1, "佐藤", 2, "五十嵐", 3, "南", 4, "田中", 5, "佐々木",
        6, "渡辺", 7, "山本", 8, "大久保", 9, "林", 10, "加藤");

    System.out.println("リスト：" + studentList);

    System.out.println("通常のMap出力");
    for (Map.Entry<Integer,String> entry : studentList.entrySet()) {
      System.out.println("番号：" + entry.getKey() + "名前：" + entry.getValue());
    }
    System.out.println();

    //参考：番号順に並べ替える場合　TreeMapに変換する
    Map<Integer, String> sortedStudentList = new TreeMap<>(studentList);

    System.out.println("整列処理後のMap出力");
    for (Map.Entry<Integer,String> entry : sortedStudentList.entrySet()) {
      System.out.println("番号：" + entry.getKey() + "名前：" + entry.getValue());
    }
    System.out.println();

    //参考：番号順に並べ替える場合　TreeMapに変換する　※降順の場合
    Map<Integer, String> sortedStudentList2 = new TreeMap<>(Comparator.reverseOrder());
    sortedStudentList2.putAll(studentList);
    System.out.println();

    System.out.println("整列処理後のMap出力 ※降順");
    for (Map.Entry<Integer,String> entry : sortedStudentList2.entrySet()) {
      System.out.println("番号：" + entry.getKey() + "名前：" + entry.getValue());
    }



  }
}
