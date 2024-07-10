

public class Author {
    private String nameOfAuthor;
    private My_Date bornDate;
    public Author (String nameOfAuthor, My_Date bornDate){
        this.nameOfAuthor = nameOfAuthor;
        this.bornDate = bornDate;
    }
    public void setName (String s){
        this.nameOfAuthor = s;
    }
    public String getName (){
        return this.nameOfAuthor;
    }
    public void setBornDate (My_Date md){
        this.bornDate = md;
    }
    public My_Date getBornDate (){
        return this.bornDate;
    }
}
