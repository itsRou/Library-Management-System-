
public abstract class Book {
   private String bookname;
    private String authorname;
    private double booksserial;
    private double suitableage=18;
    public abstract boolean agecheck(double age);
    String s;

    public Book(String bookname, String authorname, double booksserial, double suitableage) {
        this.bookname = bookname;
        this.authorname = authorname;
        this.booksserial = booksserial;
        this.suitableage = suitableage;
    }

    public String getBookname() {
        return bookname;
    }

    public String getAuthorname() {
        return authorname;
    }

    public double getBooksserial() {
        return booksserial;
    }

    public double getSuitableage() {
        return suitableage;
    }

    @Override
    public String toString() {
        s="Book{" + "bookname=" + bookname + ", authorname=" + authorname + ", booksserial=" + booksserial + ", suitableage=" + suitableage + '}';
        return s;
    }
    
    
}
