public class Book {

    String title;
    String author;
    int releaseYear;
    int pages;
    String publisher;
    String isbn;

    Book(String bookTitle, String bookAuthor, int bookRelease, int bookPages, String bookPublisher, String bookIsbn) {
        title = bookTitle;
        author = bookAuthor;
        releaseYear = bookRelease;
        pages = bookPages;
        publisher = bookPublisher;
        isbn = bookIsbn;
    }

    void printInfo() {
        String info = title + "; " + author + "; " + releaseYear + "; " + pages + "; " + publisher + "; " + isbn;
        System.out.println(info);
    }

}
