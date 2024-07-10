public class Film {
    private String filmName;
    private int releaseYear;
    private Production_Company productionCompany;
    private double fare;
    private Date premiereDate;
    public Film (String filmName,  int releaseYear, Production_Company production_Company, double fare, Date premierDate){
        this.filmName = filmName;
        this.releaseYear = releaseYear;
        this.productionCompany = production_Company;
        this.fare = fare;
        this.premiereDate = premierDate;
    }
    public String getFilmName (){
        return this.filmName;
    }
    public void setFilmName (String f){
        this.filmName = f;
    }
    public int getReleaseYear (){
        return this.releaseYear;
    }
    public void setReleaseYear (int set){
        this.releaseYear = set;
    }
    public Production_Company getProductionCompany (){
        return this.productionCompany;
    }
    public void setProductionCompany (Production_Company pc){
        this.productionCompany = pc;
    }
    public double getFare (){
        return this.fare;
    }
    public void setFare (double f){
        this.fare = f;
    }
    public Date getPremiereDate (){
        return this.premiereDate;
    }
    public void setPremiereDate (Date pre){
        this.premiereDate = pre;
    }
    public boolean checkFare(Film ofilm){
        return this.fare < ofilm.fare;
    }
    public double fareAfter (double x){
        return fare*(1-x/100);
    }
    public String printProductCompanyName(){
        return this.productionCompany.getNameOfCountry();
    }
}
