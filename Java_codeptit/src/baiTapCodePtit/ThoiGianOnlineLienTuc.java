package baiTapCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class ThoiGianOnlineLienTuc {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("ONLINE.in"));
        ArrayList<Online> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- >0) {
            ds.add(new Online(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(ds);
        for (Online online : ds) {
            System.out.println(online);
        }
    }
}
class Online implements Comparable<Online>{
    private String hoTen;
    private Date timeStart, timeEnd;
    private long timeOnline;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public Online(String hoTen, String timeStart, String timeEnd) throws ParseException{
        this.hoTen = hoTen;
        this.timeStart = sdf.parse(timeStart);
        this.timeEnd = sdf.parse(timeEnd);
        this.timeOnline = ChronoUnit.MINUTES.between(this.timeStart.toInstant(), this.timeEnd.toInstant());
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    public long getTimeOnline() {
        return timeOnline;
    }

    public void setTimeOnline(long timeOnline) {
        this.timeOnline = timeOnline;
    }

    @Override
    public String toString() {
        return hoTen + " " + timeOnline;
    }

    @Override
    public int compareTo(Online o) {
        if(o.timeOnline > this.timeOnline){
            return 1;
        }
        else if(o.timeOnline < this.timeOnline){
            return -1;
        }
        else{
            return 0;
        }
    }
    
}
