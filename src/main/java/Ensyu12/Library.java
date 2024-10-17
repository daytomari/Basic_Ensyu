package Ensyu12;

import java.util.ArrayList;
import java.util.List;

public class Library {

  private List<Book> books;

  public Library() {
    this.books = new ArrayList<>();
  }

  public void addBook(Book book) { //1冊ずつ追加するメソッド
    books.add(book);
  }

  public void addBook(List<Book> book) { //書籍をまとめて追加
    books.addAll(book);
  }

  public List<Book> getBooks() {
    return books;
  }

  public List<Book> searchTilte(String title) {
    List<Book> searchBook = new ArrayList<>();
    for (Book book : books) {
      if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
        searchBook.add(book);
      }
    }
    return searchBook;
  }

  public List<Book> searchAuthor(String author) {
    List<Book> searchBook = new ArrayList<>();
    for (Book book : books) {
      if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
        searchBook.add(book);
      }
    }
    return searchBook;
  }

  public List<Book> searchNumber(int number) {
    List<Book> searchBook = new ArrayList<>();
    for (Book book : books) {
      if (book.getNumber()==number) {
        searchBook.add(book);
      }
    }
    return searchBook;
  }

}
