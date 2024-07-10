public class HangSanXuat {
    private String tenHangSanXuat;
    private String  tenQuocGia;

    public HangSanXuat (String tenHangSanXuat, String tenQuocGia){
        this.tenHangSanXuat = tenHangSanXuat;
        this.tenQuocGia = tenQuocGia;
    }
    public String getTenHangSanXuat (){
        return this.tenHangSanXuat;
    }
    public void setTenHangSanXuat (String s){
        this.tenHangSanXuat = s;
    }
    public String getTenQuocGia (){
        return this.tenQuocGia;
    }
    public void setTenQuocGia (String s){
        this.tenQuocGia = s;
    }
}
