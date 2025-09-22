package Ensyu;

//繰り返し処理の課題課題2
//MAPを作成しましょう生徒名と番号の組み合わせ（1,”田中")
//MAPの要素は10個以上
//Mapの中の番号が偶数のものをMAPから削除しましょう
//上記の処理の繰り返し処理を実装しましょう
//削除した状態のものを出力して表示しましょう

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Ensyu06_02b {

  public static void main(String[] args) {
    Map<Integer, String> studentList = new HashMap<>(Map.of( //HashMapを使うことで要素変更が可能になる
        1, "佐藤", 2, "五十嵐", 3, "南", 4, "田中", 5, "佐々木",
        6, "渡辺", 7, "山本", 8, "大久保", 9, "林", 10, "加藤"));

    System.out.println("元のリスト：　" + studentList);

    Iterator<Entry<Integer, String>> oddNum = studentList.entrySet().iterator();
    while (oddNum.hasNext()) {
      Map.Entry<Integer, String> entry = oddNum.next();
      if (entry.getKey() % 2 == 0) {
        oddNum.remove();
      }
    }

    System.out.println("削除後のリスト：　" + studentList);
  }
}
