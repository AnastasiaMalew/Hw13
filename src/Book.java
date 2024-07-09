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
    public String toString() {
        return String.format("Book: nameBook - %s, author - %s, date - %s", nameBook, Author, date);
    }
}
