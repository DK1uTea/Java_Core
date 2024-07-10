public class Production_Company {
    private String nameOfCompany;
    private String country;
    public Production_Company (String nameOfCompany, String country){
        this.nameOfCompany = nameOfCompany;
        this.country = country;
    }
    public String getNameOfCountry (){
        return this.nameOfCompany;

    }
    public void setNameOfCountry (String s){
        this.nameOfCompany = s;
    }
    public String getCountry (){
        return this.country;
    }
    public void setCountry (String c){  
        this.country = c;
    }
}
