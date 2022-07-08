package logic.object_parameters;

import java.util.ArrayList;

public class BookShelf {
    public ArrayList<Book> bookShelf = new ArrayList<>();

    public void addBook(Book book) {
        bookShelf.add(book);
        System.out.println(book.getTitle()+" is now in the bookshelf!");
    }
}
