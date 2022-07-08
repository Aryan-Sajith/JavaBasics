package logic.object_parameters;

public class BookShelfScenario {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        Book book1 = new Book("The Hobbit","J. R. R. Tolkien",11.91);
        Book book2 = new Book("Scythe","Neal Shusterman",6.02);

        bookShelf.addBook(book1);
        bookShelf.addBook(book2);

        System.out.println();

        for(Book book : bookShelf.bookShelf) {
            System.out.println(book);
        }
    }
}
