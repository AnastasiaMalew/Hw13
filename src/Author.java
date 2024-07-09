import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String famousAuthor;

    public Author(String name, String famous) {
        this.nameAuthor = name;
        this.famousAuthor = famous;
    }
    public String getNameAuthor () {
        return this.nameAuthor;
    }
    public String getFamousAuthor () {
        return this.famousAuthor;
    }

    public int hashCode() {
        return nameAuthor.length() + famousAuthor.length();
    }

    public boolean equals(Object a) {
        if (this == a){
            return true;
        }
        if (a == null || this.getClass() != a.getClass()){
            return false;
        }
        Author author = (Author) a;
        return Objects.equals(nameAuthor, author) && Objects.equals(famousAuthor, author);
    }

    @Override
    public String toString() {
        return nameAuthor + " " + famousAuthor;

    }

}
