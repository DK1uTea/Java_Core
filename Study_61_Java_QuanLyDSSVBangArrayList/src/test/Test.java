package test;

import java.util.Scanner;

import main.DanhSachSinhVien;
import main.SinhVien;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon = 0;
        do{
            System.out.println("------MENU------");
            System.out.println("Chon chuc nang");
            System.out.println(
                "1. Thêm sinh viên vào danh sách.\n"
			+ "2. In danh sách sinh viên ra màn hình.\n"
			+ "3. Kiểm tra danh sách có rỗng hay không.\n"
			+ "4. Lấy ra số lượng sinh viên trong danh sách.\n"
			+ "5. Làm rỗng danh sách sinh viên.\n"
			+ "6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
			+ "7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
			+ "8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
			+ "9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
			+ "0. Thoát khỏi chương trình"
            );
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon == 1){ 
                // Them sinh vien vao danh sach
                System.out.println("Nhap ma sinh vien: "); String maSinhVien = sc.nextLine();
                System.out.println("Nhap ho va ten: "); String hoVaTen = sc.nextLine();
                System.out.println("Nhap nam sinh: "); int namSinh = sc.nextInt();
                System.out.println("Nhap diem trung binh: "); float diemTrungBinh = sc.nextFloat();
                SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                dssv.themSinhVien(sv);
            }
            else if(luaChon == 2){
                // In danh sach sinh vien
                dssv.inDanhSachSinhVien();
            }
            else if(luaChon == 3){
                // Kiem tra danh sach sinh vien co rong hay khong?
                System.out.println("Kiem tra danh sach rong: " + dssv.kiemTraDanhSachRong());
            }
            else if(luaChon == 4){
                // Lay so luong sinh vien trong danh sach
                System.out.println("So luong sinh vien trong danh sach: " + dssv.laySoLuongSinhVien());
            }
            else if(luaChon == 5){
                // Lam rong danh sach
                dssv.lamRongDanhSach();
            }
            else if(luaChon == 6){
                // Kiem tra sinh vien ton tai, dua tren ma sinh vien
                System.out.println("Nhap ma sinh vien: "); String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("Kiem tra sinh vien co trong danh sach: " + dssv.kiemTraTonTai(sv));
            }
            else if(luaChon == 7){
                // Xoa mot sinh vien ra khoi danh sach, dua tren ma sinh vien
                System.out.println("Nhap ma sinh vien: "); String maSinhvien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhvien);
                System.out.println("Xoa sinh vien co ma sinh vien: " + maSinhvien + " ra khoi danh sach" + dssv.xoaSinhVien(sv));
            }
            else if(luaChon == 8){
                // Tim tat ca sinh vien theo ten duoc nhap tu ban phim
                System.out.println("Nhap ten sinh vien: ");
                String tenSinhVien = sc.nextLine();
                System.out.println("Danh sach cac sinh vien co ten: " + tenSinhVien + " la: ");
                dssv.timSinhVien(tenSinhVien);
            }
            else if(luaChon == 9){
                // Xuat ra danh sach sinh vien co diem tu cao den thap
                dssv.sapXepSinhVienGiamDanTheoDiem();
                System.out.println("Danh sach sinnh vien sau khi sap xep: ");
                dssv.inDanhSachSinhVien();
            }
        }while(luaChon != 0);
    }
}
