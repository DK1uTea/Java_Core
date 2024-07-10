package bai1;
import java.util.Scanner;
public class Assignment_Java {
    static String[] RANKs = new String[50];
    static String[] NAMEs = new String[50];
    static Double[] POINTs = new Double[50];
    static String[] EMAILs = new String[50];
    static String[] CODEs = new String[50];
    public static void main(String[] args) {
        int chon;
        do {
            showMenu();
            chon = chonMot();
            switch (chon) {
                case 1:
                    nhapXuat();
                    break;
                case 2:
                    searchDiem();
                    break;
                case 3:
                    searchHocLuc();
                    break;
                case 4:
                    searchCodeandUpdateInfo();
                    break;
                case 5:
                    sapXepDiem();
                    break;
                case 6:
                    xuat5PointMax();
                    break;
                case 7:
                    System.out.println(diemTB());
                    break;
                case 8:
                    xuatDSSVtrenDiemTB();
                    break;
                case 9:
                    System.out.println(tongSVtheoHL());
                    break;
                case 10:
                    System.out.println("Bạn đã thoát chương trình");
                    System.exit(0);
                default:
                    System.out.println("Bạn đã nhập sai");
                    break;
            }
        } while (chon != 0);
    }

    public static void showMenu() {
        System.out.println("+-------------------------------------+");
        System.out.println("1. Nhập và xuất danh sách sinh viên");
        System.out.println("2. Tìm kiếm sinh viên theo khoảng điểm");
        System.out.println("3. Tìm kiếm sinh viên theo học lực");
        System.out.println("4. Tìm kiếm SV theo mã số và cập nhật thông tin SV");
        System.out.println("5. Sắp xếp sinh viên theo điểm");
        System.out.println("6. Xuất 5 sinh viên có điểm cao nhất");
        System.out.println("7. Tính điểm trung bình của lớp");
        System.out.println("8. Xuất DSSV có điểm trên điểm TB của lớp");
        System.out.println("9. Tổng số sinh viên theo học lực");
        System.out.println("10. Exit");
        System.out.println("+-------------------------------------+");
    }

    public static int chonMot() {
        int chon = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Chọn một chức năng: ");
        chon = sc.nextInt();
        return chon;
    }

    public static void nhapXuat() {
        Scanner sc = new Scanner(System.in);
        Employee[] emps = new Employee[5];
        System.out.println("Điền thông tin của 5 SV");
        for (int i = 0; i < emps.length; i++) {
            System.out.println("+-------------------------------------+");
            System.out.print("Nhập tên: ");
            NAMEs[i] = sc.next();
            sc = new Scanner(System.in);
            System.out.print("Nhập Email: ");
            EMAILs[i] = sc.nextLine();
            System.out.print("Nhập điểm: ");
            POINTs[i] = Double.parseDouble(sc.nextLine());
            System.out.println("Nhap ma sv: ");
            CODEs[i] = sc.nextLine();
            System.out.println("+-------------------------------------+");
            if (POINTs[i] < 3) {
                RANKs[i] = "Yếu";} 
            else if (POINTs[i] >= 3 && POINTs[i] < 5) {
                RANKs[i] = "Yếu";
            } else if (POINTs[i] >= 5 && POINTs[i] < 6.5) {
                RANKs[i] = "Trung Bình";
            } else if (POINTs[i] >= 6.5 && POINTs[i] < 7.5) {
                RANKs[i] = "Khá";
            } else if (POINTs[i] >= 7.5 && POINTs[i] <= 9) {
                RANKs[i] = "Gioi";
            } else {
                if (POINTs[i] > 9) {
                    RANKs[i] = "Xuất sắc";
                }
            }
            System.out.println("Xuất kết quả");
            System.out.println("Tên: " + NAMEs[i]);
            System.out.println("Ma sv: " + CODEs[i]);
            System.out.println("Email: " + EMAILs[i]);
            System.out.println("Điểm: " + POINTs[i]);
            System.out.println("Kết quả xếp loại: " + RANKs[i]);
        }
    }

    public static void searchDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm cần tìm: ");
        double timDiem = sc.nextDouble();
        for (int i = 0; i < 3; i++) {
            if (timDiem == POINTs[i]) {
                System.out.println("+-------------------------------------+");
                System.out.println("Thông tin sinh viên cần tìm");
                System.out.println("Tên: " + NAMEs[i]);
                System.out.println("Ma sv: " + CODEs[i]);
                System.out.println("Email: " + EMAILs[i]);
                System.out.println("Học lực: " + RANKs[i]);
            }
        }
    }

    public static void searchHocLuc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập học lực cần tìm: ");
        String hocLuc = sc.next();
        System.out.println("Thông tin sinh viên cần tìm");
        for (int i = 0; i < 5; i++) {
            if (hocLuc.equals(RANKs[i])) {
                System.out.println("+-------------------------------------+");
                System.out.println("Tên: " + NAMEs[i]);
                System.out.println("Ma sv: " + CODEs[i]);
                System.out.println("Điểm: " + POINTs[i]);
                System.out.println("Email: " + EMAILs[i]);
            }
        }
    }

    public static void searchCodeandUpdateInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ma sv can tim: ");
        String code = sc.next();
        System.out.println("Thông tin sinh viên cần tìm");
        for (int i = 0; i < 5; i++) {
            if (code.equals(CODEs[i])) {
                System.out.println("+-------------------------------------+");
                System.out.println("Tên: " + NAMEs[i]);
                System.out.println("Ma sv: " + CODEs[i]);
                System.out.println("Điểm: " + POINTs[i]);
                System.out.println("Email: " + EMAILs[i]);
            }
        }
        System.out.println("---------------");
        System.out.println("MENU");
        System.out.println("1. Cap nhap ten sv \n" 
        + "2. Cap nhap email sv \n" 
        + "3. Cap nhap diem sv \n" 
        + "4. Cap nhap rank sv \n" 
        + "5. Cap nhap ma sv \n");
        int luaChon = sc.nextInt();
        System.out.println("Nhap stt sinh vien muon cap nhap thong tin: ");
        int index = sc.nextInt();
        switch (luaChon) {
            case 1:
                System.out.println("Nhap ten moi: ");
                String newName = sc.nextLine();
                NAMEs[index-1] = newName;
                break;
            case 2:
                System.out.println("Nhap email moi: ");
                String newEmail = sc.nextLine();
                EMAILs[index-1] = newEmail;
                break;
            case 3:
                System.out.println("Nhap diem moi: ");
                double newPoint = sc.nextDouble();
                POINTs[index-1] = newPoint;
            case 4:
                System.out.println("Nhap rank moi: ");
                String newRank = sc.nextLine();
                RANKs[index-1] = newRank;
            case 5:
                System.out.println("Nhap ma sv moi: ");
                String newCode = sc.nextLine();
                CODEs[index-1] = newCode;
                break;
            default:
                break;
        }
    }
    // Sap xep theo diem giam dan
    public static void sapXepDiem() {
        for(int i = 0; i<4; i++){
            for(int j = i+1; j<5; j++){
                if(POINTs[i]<POINTs[j]){
                    swap(POINTs, i, j);
                    swap(EMAILs, i, j);
                    swap(NAMEs, i, j);
                    swap(RANKs, i, j);
                    swap(CODEs, i, j);
                }
            }
        }
        System.out.println("Danh sach sinh vien theo diem giam dan");
        for(int i =0 ; i<3; i++){
            System.out.println("+-------------------------------------+");
            System.out.println("Tên: " + NAMEs[i]);
            System.out.println("Ma sv: " + CODEs[i]);
            System.out.println("Điểm: " + POINTs[i]);
            System.out.println("Email: " + EMAILs[i]);
        }
    }

    public static void xuat5PointMax() {
        for(int i = 0; i<2; i++){
            for(int j = i+1; j<3; j++){
                if(POINTs[i]<POINTs[j]){
                    swap(POINTs, i, j);
                    swap(EMAILs, i, j);
                    swap(NAMEs, i, j);
                    swap(RANKs, i, j);
                    swap(CODEs, i, j);
                }
            }
        }
        for(int i = 0; i<5 ; i++){
            System.out.println("+-------------------------------------+");
            System.out.println("Tên: " + NAMEs[i]);
            System.out.println("Ma sv: " + CODEs[i]);
            System.out.println("Điểm: " + POINTs[i]);
            System.out.println("Email: " + EMAILs[i]);
        }
    }

    public static double diemTB() {
        double average = 0;
        for(int i = 0; i<5; i++){
            average += POINTs[i];
        }
        return average;
    }

    public static void xuatDSSVtrenDiemTB() {
        System.out.println("Danh sach sinh vien co diem tren diem TB cua lop");
        for(int i = 0; i<5; i++){
            if(POINTs[i] > diemTB()){
                System.out.println("+-------------------------------------+");
                System.out.println("Tên: " + NAMEs[i]);
                System.out.println("Ma sv: " + CODEs[i]);
                System.out.println("Điểm: " + POINTs[i]);
                System.out.println("Email: " + EMAILs[i]);
            }
        }
    }

    public static int tongSVtheoHL() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hoc luc can tim: ");
        String hocLuc = sc.nextLine();
        int soLuong = 0;
        for(int i = 0; i<5; i++){
            if(hocLuc.equals(RANKs[i])){
                soLuong++;
            }
        }
        return soLuong;
    }
    // Overlodaing method
    public static void swap(String[] array, int index1, int index2) {
        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void swap(Double[] array, int index1, int index2) {
        double temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
class Employee{

}