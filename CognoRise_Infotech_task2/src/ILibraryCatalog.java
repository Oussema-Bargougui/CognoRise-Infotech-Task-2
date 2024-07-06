import java.util.List;

public interface ILibraryCatalog {
    public  abstract void ajouter(Book book);
    public abstract Book chercherbyTA (String titre, String author);
    public abstract List<Book> afficher ();
    public abstract boolean checkOut(String title, String author) ;
}
