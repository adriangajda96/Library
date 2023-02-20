package library.model;

public class Book {

    private String title;
    private String author;
    private int releaseYear;
    private int pages;
    private String publisher;
    private String isbn;

    public Book(String title, String author, int releaseYear, int pages, String publisher, String isbn) {
        this(title, author, releaseYear, pages, publisher);
        this.isbn = isbn;
    }

    public Book(String title, String author, int releaseYear, int pages, String publisher) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.pages = pages;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void printInfo() {
        String info = title + "; " + author + "; " + releaseYear + "; " + pages + "; " + publisher + "; " + isbn;
        System.out.println(info);
    }

}
