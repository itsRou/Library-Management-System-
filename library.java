
public class library{
   public kidsbook kb1=new kidsbook("kidsbook1","author1",18,5);
  public  kidsbook kb2=new kidsbook("kidsbook2","author2",15,7);
  public  kidsbook kb3=new kidsbook("kidsbook3","author3",10,9);
  public  Scientificbook sc1=new Scientificbook("scientific book 1","author1",12,18);
   public Scientificbook sc2=new Scientificbook("scientific book 2","author2",13,18);
    @Override
    public String toString() {
        return "library{" + "kb1=" + kb1 + ", kb2=" + kb2 + ", kb3=" + kb3 + ", sc1=" + sc1 + ", sc2=" + sc2 + '}';
    }
   
}
