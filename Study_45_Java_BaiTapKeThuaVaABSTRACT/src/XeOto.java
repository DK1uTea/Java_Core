public class XeOto extends PhuongTienDiChuyen {
    private String loaiNhienLieu;

    public XeOto (HangSanXuat hangSanXuat, String loaiNhienLieu){
        super("Oto", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }
    public String getLoaiNhienLieu (){
        return this.loaiNhienLieu;
    }
    public void setLoaiNhienLieu (String loaiNhienLieu){
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public double layVanToc (){
        return 100;
    }
}
