import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
         while (true) {
            System.out.println("to connect with library write 1 , to shutdown write -1");
            int o = in.nextInt();
            if (o == -1) {
                System.out.println("shuted down");
                break;
            }
        library lb=new library();
           Book menue[]= new Book[5];
            menue[0]=lb.kb1;
      menue[1]=lb.kb2;
      menue[2]=lb.kb3;
      menue[3]=lb.sc1;
      menue[4]=lb.sc2;
      
      Book books[]=new Book[5];
       for(int i=0; i<5; i++){
      books[i]=menue[i];}
            int borrowed=0;
            System.out.println("Library contains five books which are");
            for(int i=0; i<5; i++){
                System.out.println(menue[i].toString());
            }
             System.out.println(" We need some information before you start borrowing books");
            System.out.println(" your name");
            String name=in.next();
            System.out.println(" your ID");
            int id=in.nextInt();
            System.out.println(" your age");   
 double age=in.nextDouble();      
 System.out.println(" keep in mind that you can borrow books only when your age exceeds their suitable age");

        borrow br1=new borrow(name,id,age);
       
         if(br1.getBorrowerage()<=5){
br1.setMaxnumberofbooksborrowed(0);
             System.out.println("no books available for your age");
    }
   else if(br1.getBorrowerage()<=7 && br1.getBorrowerage()>5){
br1.setMaxnumberofbooksborrowed(1);
             System.out.println("available books for your age are");
              for(int i=0; i<1; i++){
                System.out.println(menue[i].toString());
            }
   }
       else if(br1.getBorrowerage()<=9 && br1.getBorrowerage()>7){
br1.setMaxnumberofbooksborrowed(2);
 System.out.println("available books for your age are");
             for(int i=0; i<2; i++){
                System.out.println(menue[i].toString());
            }
   
       }
              else if(br1.getBorrowerage()<=18 && br1.getBorrowerage()>9){
br1.setMaxnumberofbooksborrowed(3);
 System.out.println("available books for your age are");
             for(int i=0; i<3; i++){
                System.out.println(menue[i].toString());
            }
   
              }
              else if(br1.getBorrowerage()>18){
br1.setMaxnumberofbooksborrowed(5);

 System.out.println("available books for your age are");
             for(int i=0; i<5; i++){
                System.out.println(menue[i].toString());
            }
}
            System.out.println("enter number of books you want to borrow");
            int wanted=in.nextInt();
             if(wanted>br1.getMaxnumberofbooksborrowed()){
                System.out.println("you cannot borrow this much books as your age is suitable with just " + br1.getMaxnumberofbooksborrowed() + " books");
                System.out.println("we will let you borrow " + br1.getMaxnumberofbooksborrowed() + " books maximum ");
                wanted=br1.getMaxnumberofbooksborrowed();
                
            }else{
            
            }
         double serials[]=new double[wanted];
        System.out.println("enter Serial of books you want to borrow");
        for(int i =0; i<wanted;i++){
        serials[i]=in.nextDouble();   }
        for(int i =0; i<wanted;i++){
        if (serials[i]!=10 && serials[i]!=12 && serials[i]!=13 && serials[i]!=18 && serials[i]!=15 ){
                System.out.println("no such book exists with serial of " + serials[i]);}
    }   
        for(int i =0; i<wanted;i++){
            for(int j=0; j<5;j++){
              
                if(serials[i]==menue[j].getBooksserial()){
                    if (menue[j].agecheck(age)){
 books[j]=null;borrowed+=1;}
                    else{
                                                System.out.println("you cannot borrow  " + books[j].getBookname() +"  as your age is not suitable ");

                    }
                }
                br1.setBorrowedbooksserials(serials);
            }
        }         
        System.out.println("available books in the library after borrowing");

         for(int j=0; j<5;j++){
            try{
             System.out.println(books[j].toString());
             }catch(NullPointerException e){
                 System.out.println("borrowed book -----> waiting for borrower "+ br1.getBorrowername()+ "  with ID " + br1.getId()+ "  to return");
             }
         } 
         
         while (borrowed>0){ 
             System.out.println("to borrow again press 1");
             System.out.println("if you want to return books press 2");
            System.out.println("if you want to end press 0 ");
            int secondchoice=in.nextInt();
            if(secondchoice==1){
                if(borrowed==5){
                    System.out.println("there is no books left to borrow");
                }
                else{System.out.println("enter number of books you want to borrow");
                int wanted2=in.nextInt();
                
                 double serials2[]=new double[wanted2];
                 System.out.println("enter serial number of books you want to borrow");
                 for(int i =0; i<wanted2;i++){
                  
        serials2[i]=in.nextDouble();  
                 
                 }for(int i =0; i<wanted2;i++){
                     for(int j =0 ; j < br1.getBorrowedbooksserials().length; j++){
                 if(serials2[i]==br1.getBorrowedbooksserials()[j]){
                     System.out.println("you cannot borrow book with serial " + serials2[i] + "  as it is already borrowed " );
                     borrowed-=1;
                 }}}
                         
        for(int j =0; j<wanted2;j++){
        if (serials2[j]!=10 && serials2[j]!=12 && serials2[j]!=13 && serials2[j]!=18 && serials2[j]!=15 ){
                System.out.println("no such book exists with serial of " + serials2[j]);
        }
    }   
        for(int k =0; k<wanted2;k++){
            for(int j=0; j<5;j++){
              
                if(serials2[k]==menue[j].getBooksserial()){
                    if (menue[j].agecheck(age)){
 books[j]=null;
                    borrowed+=1;}
                    else{
                                                System.out.println("you cannot borrow  " + books[j].getBookname() +"  as your age is not suitable ");

                    }
                }
               
            }}
                  
           System.out.println("available books in the library after borrowing");

         for(int j=0; j<5;j++){
            try{
             System.out.println(books[j].toString());
             }catch(NullPointerException e){
                 System.out.println("borrowed book -----> waiting for borrower "+ br1.getBorrowername()+" to return");
             }
         }  
                }}
           else if (secondchoice==2){
                System.out.println("enter number of books you want to return");
            int noofreturned=in.nextInt();
            if(noofreturned>5){
                System.out.println(" wrong operation!!!   too much books to return ");
            }else{
            for(int i=1; i <= noofreturned;i++){
            System.out.println("enter serial number of book  " + i +" you want to return ");
            double returnedserial=in.nextDouble();
                        for(int j=0; j<5;j++){
                            if (returnedserial!=10 && returnedserial!=12 && returnedserial!=13 && returnedserial!=18 && returnedserial!=15 ){
                System.out.println("no such book exists to return!");
                break;
            } 
                           if(menue[j].getBooksserial()==returnedserial){
                               books[j]=menue[j];
                               borrowed-=1;
                                }
                            }
                
            }
    }
            System.out.println("books available after returning");
                                    for(int j=0; j<5;j++){
                                         try{
             System.out.println(books[j].toString());
             }catch(NullPointerException e){
                 System.out.println("borrowed book -----> waiting for borrower to return");
             }
            }}
            else if(secondchoice==0){
        break;
    }}}
    }}