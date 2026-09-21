class LibraryBook {
    String title;
    String author;
    double price;

    static int bookCount = 0;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;

        bookCount++;
    }

    void displayBook() {
        System.out.println("Title  = " + title);
        System.out.println("Author = " + author);
        System.out.println("Price  = Rs." + price);
        System.out.println();
    }

    static void displayBookCount() {
        System.out.println("Total Books = " + bookCount);
    }

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Java Programming", "James", 500);
        LibraryBook b2 = new LibraryBook("Python Basics", "Guido", 450);
        LibraryBook b3 = new LibraryBook("C Programming", "Dennis", 400);

        b1.displayBook();
        b2.displayBook();
        b3.displayBook();

        LibraryBook.displayBookCount();
    }
}
