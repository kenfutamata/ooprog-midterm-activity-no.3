import java.util.*;
public class BookArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Book bookarr[] = new Book[10];

       bookarr[0] = new Fiction("Fiction no.1");
       bookarr[1] = new NonFiction("Non-Fiction no.1 ");
       bookarr[2] = new Fiction("Fiction no.2");
       bookarr[3] = new NonFiction("Non-Fiction no.2");
       bookarr[4] = new Fiction("Fiction no.3");
       bookarr[5] = new NonFiction("Non-Fiction no.3");
       bookarr[6] = new Fiction("Fiction no.4");
       bookarr[7] = new NonFiction("Non-Fiction no.4");
       bookarr[8] = new Fiction("Fiction no.5");
       bookarr[9] = new NonFiction("Non-Fiction no.5");


        for(Book book: bookarr){
            System.out.println("Book title: "+book.getBook());
            System.out.println("Book price: "+book.setPrice());
            System.out.println();
        }

    }
}

