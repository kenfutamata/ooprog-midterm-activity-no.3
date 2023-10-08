public class NonFiction extends Fiction{

    double nonfictionprice;
    String s;
    public NonFiction(String s){
        super();
        this.s = s;
    }

    public NonFiction(){
        s = "";
    }

    public String getBook(){
        return s;
    }

    @Override
    public double setPrice() {
        nonfictionprice = 37.99;
        super.setPrice();
        return nonfictionprice;
    }
}
