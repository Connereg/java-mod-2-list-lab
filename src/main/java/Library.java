import java.util.List;
import java.util.ArrayList;

public class Library {
    List<Book> library = new ArrayList<>();


    public void addBookToLibrary(Book bookToAdd) {
        library.add(bookToAdd);
        System.out.println("The book " + bookToAdd.getTitle() + "has been added to the library!");
    }
}
