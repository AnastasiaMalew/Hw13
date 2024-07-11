import java.util.Objects;

public class Book {
    private String nameBook;
    private int date;
    private Author author;

    public Book(String nameBook, int date, Author author) {
        this.nameBook = nameBook;
        this.date = date;
        this.author = author;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public int getDate() {
        return this.date;
    }
    public Author getAuthor() {
        return this.author;
    }

    public void setDate(int date) {
        this.date = date;
    }
    public int hashCode() {
        return Objects.hash(nameBook, date, author);
    }
    public boolean equals(Object a) {
        if (this == a){
            return true;
        }
        if (a == null || this.getClass() != a.getClass()){
            return false;
        }
        Book nameBook = (Book) a;
        return Objects.equals(nameBook, nameBook.nameBook) && Objects.equals(date,nameBook.date) && Objects.equals(author, nameBook.author);
    }
    public String toString() {
        return String.format("Book: nameBook - %s, author - %s, date - %s", nameBook, author, date);
    }
}
