public class Book {

    String title;
    String author;
    int releaseYear;
    int pages;
    String publisher;
    String isbn;

    Book(String title, String author, int releaseYear, int pages, String publisher, String isbn) {
        this(title, author, releaseYear, pages, publisher);
        this.isbn = isbn;
    }

    Book(String title, String author, int releaseYear, int pages, String publisher) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.pages = pages;
        this.publisher = publisher;
    }

    void printInfo() {
        String info = title + "; " + author + "; " + releaseYear + "; " + pages + "; " + publisher + "; " + isbn;
        System.out.println(info);
    }

}
