package Ensyu09;

//オブジェクト指向についての課題課題２
//継承を使ってみましょう。課題１で作成した２つの実装クラスの
//　どちらかを継承してクラスを作成し、実際にメソッドを呼び出して
//　みましょう
//メソッド呼び出しは親子のどちらとも呼び出しをしてみましょう

public class Ensyu09_02 {
  public static void main(String[] args){
    SubPhone phone = new SubPhone();
    String message = phone.call("渡真利");
    System.out.println(message);
  }

}
