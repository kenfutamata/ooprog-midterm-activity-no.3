public class Fiction extends Book{

    double fictionprice;
    String s;
    public Fiction(String s) {
        super();
        this.s = s;
    }

    public Fiction(){
        s = " ";
    }
    public String getBook(){
        return s;
    }
    @Override
    public double setPrice() {
        fictionprice = 24.99;
        return fictionprice;
    }
}
