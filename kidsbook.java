
public class kidsbook extends Book{
   boolean f;

    public kidsbook(String bookname, String authorname, double booksserial, double suitableage) {
        super(bookname, authorname, booksserial, suitableage);
    }
     public boolean agecheck(double age){
         f=false;
        if (age>=this.getSuitableage()){
            f=true;
        }
        return f;
    }

    @Override
    public String toString() {
        return "kidsbook{" +  "bookname=" + this.getBookname() + ", authorname=" + this.getAuthorname() + ", booksserial=" + this.getBooksserial() + ", suitableage=" + this.getSuitableage() +'}';
    }

  
    }
     


