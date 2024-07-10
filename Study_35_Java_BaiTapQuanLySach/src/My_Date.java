
public class My_Date {
    private int day, month, year;
    public My_Date (int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void setDay (int d){
        if(d >=1 && d <= 31){
            this.day = d;
        }
    }
    public int getDay (){
        return this.day;
    }
    public void setMonth (int m){
        if(m >=1 && m <= 12){
            this.month = m;
        }
    }
    public int getMonth (){
        return this.month;
    }
    public void setYear (int y){
        this.year = y;
    }
    public int getYear (){
        return this.year;
    }

}
