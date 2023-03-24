

public class borrow {
    private String borrowername;
   private int id;
   private double borrowerage;
   private int maxnumberofbooksborrowed;
    double borrowedbooksserials[]=new double[maxnumberofbooksborrowed];

    public borrow(String borrowername, int id, double borrowerage) {
        this.borrowername = borrowername;
        this.id = id;
        this.borrowerage = borrowerage;
    }

    public String getBorrowername() {
        return borrowername;
    }

    public int getId() {
        return id;
    }

    public double getBorrowerage() {
        return borrowerage;
    }

    public int getMaxnumberofbooksborrowed() {
        return maxnumberofbooksborrowed;
    }

    public double[] getBorrowedbooksserials() {
        return borrowedbooksserials;
    }
    
    public void setMaxnumberofbooksborrowed(int maxnumberofbooksborrowed) {
        this.maxnumberofbooksborrowed = maxnumberofbooksborrowed;
    }

    public void setBorrowedbooksserials(double[] borrowedbooksserials) {
        this.borrowedbooksserials = borrowedbooksserials;
    }

    
   
}
