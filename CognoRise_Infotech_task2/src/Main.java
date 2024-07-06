
public class Main {
    public static void main(String[] args) {

                LibraryCatalog catalog = new LibraryCatalog();

                Book book1 = new Book("1984", "George Orwell", "available");
                Book book2 = new Book("Brave New World", "Aldous Huxley", "available");
                Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "available");

                catalog.ajouter(book1);
                catalog.ajouter(book2);
                catalog.ajouter(book3);

                System.out.println("Books available in the library:");
                for (Book book : catalog.afficher()) {
                    System.out.println(book.getTitle() + " by " + book.getAuthor() + " - Status: " + book.getStatus());
                }

                boolean checkOutSuccess = catalog.checkOut("1984", "George Orwell");
                if (checkOutSuccess) {
                    System.out.println("\nChecked out '1984' successfully.");
                } else {
                    System.out.println("\nFailed to check out '1984'.");
                }

                boolean secondCheckOutAttempt = catalog.checkOut("1984", "George Orwell");
                if (secondCheckOutAttempt) {
                    System.out.println("Checked out '1984' successfully again.");
                } else {
                    System.out.println("Failed to check out '1984' again. It's already checked out.");
                }

                System.out.println("\nUpdated book status in the library:");
                for (Book book : catalog.afficher()) {
                    System.out.println(book.getTitle() + " by " + book.getAuthor() + " - Status: " + book.getStatus());
                }


    }
}