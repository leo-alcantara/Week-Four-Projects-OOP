package se.lexicon;

public class AuthorsAndBooks  {

    Author author01 = new Author("Leo Odin de Alcantara", 43);
    Author author02 = new Author("Stephen King", 78);

    Book book01 = new Book("Ztockholm", "Leo Odin de Alcantara", 260, "Austin Macauley", 2018);
    Book book02 = new Book("The untold stories of Ztockholm", "Leo Odin de Alcantara", 320, "Independent", 2021);
    Book book03 = new Book("The cell", "Stephen King", 402, "Terror House", 2013);
    Book book04 = new Book("The Stand", "Str" + "Stephen King", 984, "Terror House", 1984);

    String[] authors = {"Leo odin de Alcantara", "Stephen King"};


    public static void main(String[] args) {

        Book.printBooks(book01, authors[0]);


    }




}
