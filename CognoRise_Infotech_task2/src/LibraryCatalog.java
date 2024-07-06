import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog implements ILibraryCatalog{
    List<Book> bookList = new ArrayList<>();
    @Override
    public void ajouter(Book book) {
            bookList.add(book);
    }

    @Override
    public Book chercherbyTA(String titre,String author) {
        for (Book book : bookList) {
            if (book.getTitle().equals(titre) && book.getAuthor().equals(author)) {
                return book;
            }
        }
        return null;
    }



    @Override
    public List<Book> afficher() {
        return bookList;
    }
    public boolean checkOut(String title, String author) {
        Book book = chercherbyTA(title, author);
        if (book != null && book.getStatus().equals(Book.Status.available)) {
            book.setStatus("checked_out");
            return true;
        }
        return false;
    }
}
