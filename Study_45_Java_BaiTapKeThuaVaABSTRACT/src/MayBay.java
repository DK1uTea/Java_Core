public class MayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;
    
    public MayBay (HangSanXuat hangSanXuat ,String loaiNhienLieu){
        super("May Bay", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }
    public String getLoaiNhienLieu (){
        return this.loaiNhienLieu;
    }
    public void setLoaiNhienLieu (String loaiNhienLieu){
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh (){
        System.out.println("Cat canh.....");
    }
    
    public void haCanh (){
        System.out.println("Ha canh.....");
    }

    @Override
    public double layVanToc(){
        return 800;
    }
}
