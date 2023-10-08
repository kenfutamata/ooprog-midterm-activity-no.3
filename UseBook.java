import java.util.*;
public class UseBook {
    public static void main(String[] args) {
        Fiction fb = new Fiction("What is Java Programming");
        NonFiction nfb = new NonFiction("What is c programming");

        System.out.println("Fiction book title: "+fb.getBook());
        System.out.println("Fiction book price: "+fb.setPrice());
        System.out.println("Non-Fiction book: "+nfb.getBook());
        System.out.println("Fiction book price: "+nfb.setPrice());
    }


}
