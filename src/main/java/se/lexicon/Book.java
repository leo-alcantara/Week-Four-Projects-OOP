package se.lexicon;

public class Book extends AuthorsAndBooks {
    public String bookName;
    public String authorsName;
    public int numberOfPages;
    public String bookPublisher;
    public int yearOfPublication;

    public Book(String bookName, String authorsName, int numberOfPages, String bookPublisher, int yearOfPublication){
        this.bookName = bookName;
        this.authorsName = authorsName;
        this.numberOfPages = numberOfPages;
        this.bookPublisher = bookPublisher;
        this.yearOfPublication = yearOfPublication;
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String  bookName) {
        this.bookName = bookName;
    }

    public String getAuthorsName() {
        return authorsName;
    }

    public void setAuthorsName(String  authorsName) {
        this.authorsName = authorsName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int  bookName) {
        this.numberOfPages = numberOfPages;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String  bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int  yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void printBooks(String book, String[] author){
        System.out.println(book + " written by the author " + author);
    }




}
