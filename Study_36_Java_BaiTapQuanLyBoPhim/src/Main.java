public class Main{
    public static void main(String[] args) {
        Date date1 = new Date(9, 10, 2003);
        Date date2 = new Date(15, 8, 2003);
        Date date3 = new Date(25, 6, 2003);

        Production_Company prC1 = new Production_Company("Do Quang Tuan", "VietNam");
        Production_Company prC2 = new Production_Company("Do Xuan Tung", "Cambodia");
        Production_Company prC3 = new Production_Company("Nguyen Quoc Vuong", "Singapore");

        Film f1 = new Film("Mai yeu Loli", 2022, prC1, 150000, date1);
        Film f2 = new Film("Mai yeu Thuy Duong", 2023, prC2, 100000, date2);
        Film f3 = new Film("Mai yeu Tung", 2021, prC3, 120000, date3);

        System.out.println("Film 1 is cheaper than film 3: " + f1.checkFare(f3));
        
        System.out.println("The fare of film 2 after sale off 10%: " + f2.fareAfter(10));

        System.out.println("Name of production company of fime 1: " + f1.printProductCompanyName());
    }
}