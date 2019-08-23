
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> list = new ArrayList<Book>();

    public Library() {

    }

    public void addBook(Book newBook) {
        list.add(newBook);
    }

    public void printBooks() {
        for (Book books : list) {
            System.out.println(books);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book books : list) {
            if (StringUtils.included(books.title(), title)) {
                found.add(books);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book books : list) {
            if (StringUtils.included(books.publisher(), publisher)) {
                found.add(books);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book books : list) {
            if (books.year() == year) {
                found.add(books);
            }
        }
        return found;
    }
}
