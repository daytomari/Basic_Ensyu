package Ensyu;

//繰り返し処理の課題課題１
//生徒名のような文字列のリストを作成しましょう
//リストの数は10以上
//リストに入っている文字数が3文字以上のものを表示しましょう
//このリストをループさせて繰り返し処理を実施し、その中で上記の条件を満たすものだけを表示しましょう

import java.util.ArrayList;

public class Ensyu06_01c {

  public static void main(String[] args) {
    ArrayList<String> studentList = new ArrayList(); //ArrayList　追加・削除・変更可能

    studentList.add("佐藤");
    studentList.add("五十嵐");
    studentList.add("南");
    studentList.add("田中");
    studentList.add("佐々木");
    studentList.add("渡邉");
    studentList.add("山本");
    studentList.add("大久保");
    studentList.add("林");
    studentList.add("加藤");

    for (String name : studentList) {
      if (name.length() >= 3) {
        System.out.println(name);
      }
    }
  }
}
