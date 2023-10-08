abstract class Book {


    String book;
    private double price;

    public Book(String book){
        this.book = book;
    }

    public Book() {
        book = "";
    }

    public String getBook(){
        return book;
    }

    public double getPrice(){
        return price;
    }

    public abstract double setPrice();



}
