
public class Main {
    public static void main(String[] args) {
        My_Date md1 = new My_Date(9, 10, 2003);
        My_Date md2 = new My_Date(15, 8, 2003);
        My_Date md3 = new My_Date(26, 5, 2003);

        Author au1 = new Author("Do Quang Tuan", md1);
        Author au2 = new Author("Do Xuan Tung", md2);
        Author au3 = new Author("Nguyen Quoc vuong", md3);

        Book b1 = new Book("Data Structure and Algorithm", 1000000, 2023, au1);
        Book b2 = new Book("Lam nguoi yeu em nhe", 50000, 2023, au2);
        Book b3 = new Book("Mai yeu loli", 300000, 2021, au3);

        b1.printNameOfBook();
        b2.printNameOfBook();
        b3.printNameOfBook();

        System.out.println("Compare the year of release of book1 with book 3: " + b1.checkTheSameRelease(b3));
        
        System.out.println("The price of book1 after sale off 10%: " + b1.priceaftersale(10));
    }
}
