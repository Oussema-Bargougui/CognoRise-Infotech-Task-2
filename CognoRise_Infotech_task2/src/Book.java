import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String status ;
    public enum Status{
        checked_out,
        available
    }

    public Book(String title, String author, String status) {
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }
    public String getStatus() {
        return status;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, status);
    }
}
