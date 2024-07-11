package Ensyu09;

//オブジェクト指向についての課題課題２
//継承を使ってみましょう。課題１で作成した２つの実装クラスの
//　どちらかを継承してクラスを作成し、実際にメソッドを呼び出して
//　みましょう
//メソッド呼び出しは親子のどちらとも呼び出しをしてみましょう

public class Ensyu09_02 {
  public static void main(String[] args){
    Phone phone = new Phone();
    SubPhone subphone = new SubPhone();

    String messageMain = phone.call("渡真利");
    String messageSub = subphone.call("山田");
    System.out.println(messageMain);
    System.out.println(messageSub);
  }

}
