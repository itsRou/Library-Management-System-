
public class Scientificbook extends Book{
   boolean f;

    public Scientificbook(String bookname, String authorname, double booksserial, double suitableage) {
        super(bookname, authorname, booksserial, suitableage);
    }
     public boolean agecheck(double age){
         f=false;
        if (age>18){
            f=true;
        }
        return f;
    }

    @Override
    public String toString() {
        return "Scientificbook{" +  "bookname=" + this.getBookname() + ", authorname=" + this.getAuthorname() + ", booksserial=" + this.getBooksserial() + ", suitableage=" + this.getSuitableage() +'}';
    }
     
}
