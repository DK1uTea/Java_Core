public abstract class PhuongTienDiChuyen {
    protected String loaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen (String loaiPhuongTien, HangSanXuat hangSanXuat){
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }
    public String getLoaiPhuongTien (){
        return this.loaiPhuongTien;
    }
    public void getLoaiPhuongTien (String s){
        this.loaiPhuongTien = s;
    }
    public HangSanXuat getHangSanXuat (){
        return this.hangSanXuat;
    }
    public void setHangSanXuat (HangSanXuat h){
        this.hangSanXuat = h;
    }

    public String layTenHangSanXuat (){
        return this.hangSanXuat.getTenHangSanXuat();
    }

    public void batDau (){
        System.out.println("Bat dau.....");
    }

    public void tangToc (){
        System.out.println("Tang toc.....");
    }

    public void dungLai (){
        System.out.println("Dung Lai.....");
    }

    public abstract double layVanToc ();

}
