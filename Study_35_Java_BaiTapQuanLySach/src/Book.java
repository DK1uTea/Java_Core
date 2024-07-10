

public class Book {
    private String nameOfBook;
    private double price;
    private int release;
    private Author writer;
    public Book (String nameOfBook , double price, int release, Author writer ){
        this.nameOfBook = nameOfBook;
        this.price = price;
        this.release = release;
        this.writer = writer;
    }
    public void setName (String sN){
        this.nameOfBook = sN;
    }
    public String getName (){
        return this.nameOfBook;
    }
    public void setPrice (double sP){
        this.price = sP;
    }
    public double getPrice (){
        return this.price;
    }
    public void setRelease (int rL){
        this.release = rL;
    }
    public int getRelease (){
        return this.release;
    }
    public void setAuthor (Author au){
        this.writer = au;
    }
    public Author getAuthor (){
        return this.writer;
    }
    public void printNameOfBook (){
        System.out.println(this.nameOfBook);
    }
    public boolean checkTheSameRelease (Book oBook){
        return this.release == oBook.release;
    }
    public double priceaftersale (double x){
        return this.price*(1-x/100);
    }
}