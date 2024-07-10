package main;

import java.io.File;
import java.util.Scanner;

public class ViDuFile {
    File file;
    
    public ViDuFile(String tenFile) {
        this.file = new File(tenFile);
    }
    public boolean kiemTraThucThi(){
        // Kiem tra file co the thuc thi
        return this.file.canExecute();
    }
    public boolean kiemTraDoc(){
        // Kiem tra file co the doc
        return this.file.canRead();
    }
    public boolean kiemTraGhi(){
        // Kiem tra file co the ghi
        return this.file.canWrite();
    }
    public void inDuongDan (){
        // Lay duong dan cua file
        System.out.println(this.file.getAbsolutePath());
    }
    public void inTenFile(){
        // Lay ten cua file
        System.out.println(this.file.getName());
    }
    public void kiemTraLaThuMucHoacTapTin (){
        if(this.file.isDirectory()){
            System.out.println("Day la thu muc");
        }
        else if (this.file.isFile()) {
            System.out.println("Day la file");
        }
    }
    public void inDanhSanhCacFileCon (){
        if(this.file.isDirectory()){
            System.out.println("Cac tap tin con/thu muc con la: ");
            File[] mangCon = this.file.listFiles();
            for (File file : mangCon) {
                System.out.println(file.getAbsolutePath());
            }
        }
        else if(this.file.isFile()){
            System.out.println("Day la tap tin, khong co du lieu con ben trong.");
        }
    }
    public void inCayThuMuc (){
        this.inChiTietCayThuMuc(this.file, 1);
    }
    public void inChiTietCayThuMuc(File f, int level){
        for(int i = 0; i< level; i++){
            System.out.print("\t");
        }
        System.out.print("|__");
        System.out.println(f.getName());
        if(f.canRead() && f.isDirectory()){
            File[] mangCon = f.listFiles();
            for (File file : mangCon) {
                inChiTietCayThuMuc(file, level+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        System.out.println("Nhap ten file: ");
        String tenFile = sc.nextLine();
        ViDuFile vdf = new ViDuFile(tenFile);
        do{
            System.out.println("MENU------------");
            System.out.println("1. Kiem tra file co the thuc thi: ");
            System.out.println("2. Kiem tra file co the doc: ");
            System.out.println("3. Kiem tra file co the ghi: ");
            System.out.println("4. In duong dan: ");
            System.out.println("5. In ten file: ");
            System.out.println("6. Kiem tra file la thu muc hoac tap tin: ");
            System.out.println("7. In ra danh sach cac file con: ");
            System.out.println("8. In ra cay thu muc: ");
            System.out.println("0. Thoat chuong trinh.");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println(vdf.kiemTraThucThi());
                    break;
                case 2:
                    System.out.println(vdf.kiemTraDoc());
                    break;
                case 3:
                    System.out.println(vdf.kiemTraGhi());
                    break;
                case 4:
                    vdf.inDuongDan();
                    break;
                case 5:
                    vdf.inTenFile();
                    break;
                case 6:
                    vdf.kiemTraLaThuMucHoacTapTin();
                    break;
                case 7:
                    vdf.inDanhSanhCacFileCon();
                    break;
                case 8:
                    vdf.inCayThuMuc();
                    break;
                default:
                    break;
            }
            sc.nextLine();
        }while(luaChon != 0);
    }
}
