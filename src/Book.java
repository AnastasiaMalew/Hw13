import java.util.Objects;

public class Book {
    private String nameBook;
    private int date;
    private Author Author;

    public Book(String nameBook, int date, Author author) {
        this.nameBook = nameBook;
        this.date = date;
        this.Author = author;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public int getDate() {
        return this.date;
    }
    public Author getAuthor() {
        return this.Author;
    }

    public void setDate(int date) {
        this.date = date;
    }
    public int hashCode() {
        return Objects.hash(nameBook, date, Author);
    }
    public boolean equals(Object a) {
        if (this == a){
            return true;
        }
        if (a == null || this.getClass() != a.getClass()){
            return false;
        }
        Book nameBook = (Book) a;
        return Objects.equals(nameBook, this.nameBook) && Objects.equals(date,this.date);
    }
    public String toString() {
        return String.format("Book: nameBook - %s, author - %s, date - %s", nameBook, Author, date);
    }
}
