package Ensyu12;

//総集編の課題課題１
//図書管理システムを作成しましょう
//書籍(book)を管理する情報（タイトル、著書、番号）を持つオブジェクト（クラス）を作成し、そこに情報を格納しましょう
//複数のBookのオブジェクトを持つList形式で保持、管理する役割の図書館(Library)のオブジェクトを作成しましょう
//　mainメソッドから、Libraryクラスに対して検索ができるようにする。Libraryクラスは書籍検索の機能を持つ。
//　タイトル検索、著者検索、番号検索メソッドをLibraryに持たせる
//　それをmainメソッドから実行して、実行結果をコンソールに出力する


import java.util.List;

public class Ensyu12 {

  public static void main(String[] args) {
    Library library = new Library();
    library.addBook(new Book("プロになるJava", "杉山貴章", 1));
    library.addBook(new Book("スッキリわかるJava入門", "中山清喬", 2));
    library.addBook(new Book("スッキリわかるPython入門", "国本大悟", 3));
    library.addBook(new Book("GoogleAppsScript完全入門", "髙橋宣成", 4));
    library.addBook(new Book("Adobe Firefly完全ガイド", "吉岡豊", 5));

    // タイトル検索
    String targetTitle = "スッキリ";
    List<Book> searchByTitle = library.searchTilte(targetTitle);
    System.out.println("【検索結果：書籍検索】");
    for (Book book : searchByTitle) {
      System.out.println(book.getTitle() + "（著者：" + book.getAuthor() + "　書籍番号：" + book.getNumber() + "）");
    }

    // 著者検索
    String targetAuthor = "吉岡";
    List<Book> searchByAuthor = library.searchAuthor(targetAuthor);
    System.out.println("\n【検索結果：著者検索】");
    for (Book book : searchByAuthor) {
      System.out.println(book.getTitle() + "（著者：" + book.getAuthor() + "　書籍番号：" + book.getNumber() + "）");
    }

    // 番号検索
    Integer targetNumber = 4;
    List<Book> searchByNumber = library.searchNumber(targetNumber);
    System.out.println("\n【検索結果：番号検索】");
    for (Book book : searchByNumber) {
      System.out.println(book.getTitle() + "（著者：" + book.getAuthor() + "　書籍番号：" + book.getNumber() + "）");
    }

  }

}
