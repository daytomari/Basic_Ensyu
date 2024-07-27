package Ensyu12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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


  public List<Book> searchTitle(String title) {
    return books.stream()
            .filter(book -> book.getTitle().equalsIgnoreCase(title))
            .collect(Collectors.toList());
  }

  public List<Book> searchAuthor(String author) {
    return books.stream()
            .filter(book -> book.getAuthor().equalsIgnoreCase(author))
            .collect(Collectors.toList());
  }

  public List<Book> searchNumber(int number) {
    return books.stream()
            .filter(book -> book.getNumber() == number)
            .collect(Collectors.toList());
  }


}
