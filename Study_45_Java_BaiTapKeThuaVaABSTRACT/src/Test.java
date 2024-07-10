public class Test {
    public static void main(String[] args) {
        HangSanXuat hang1 = new HangSanXuat("VietNamAirlines", "VietNam");
        HangSanXuat hang2 = new HangSanXuat("Toyota", "Japan");
        HangSanXuat hang3 = new HangSanXuat("An cap chat xam", "China");

        MayBay mb = new MayBay(hang1, "Dau Diasel");
        XeOto oto = new XeOto(hang2, "Xang");
        XeDap xd = new XeDap(hang3);

        System.out.println("Test May bay");
        System.out.println("Ten hang san xuat may bay: " + mb.layTenHangSanXuat());
        mb.batDau();
        mb.tangToc();
        mb.dungLai();
        mb.catCanh();
        mb.haCanh();
        System.out.println("Van toc may bay la: " + mb.layVanToc());
        System.out.println("-------------------");

        System.out.println("Test O to");
        System.out.println("Ten hang san xuat oto la: " + oto.layTenHangSanXuat());
        oto.batDau();
        oto.tangToc();
        oto.dungLai();
        System.out.println("Van toc o to la: " + oto.layVanToc());
        System.out.println("-------------------");

        System.out.println("Test Xe dap");
        System.out.println("Ten hang san xuat xe dap la: " + xd.layTenHangSanXuat());
        xd.batDau();
        xd.tangToc();
        xd.dungLai();
        System.out.println("Van toc xe dap la: " + xd. layVanToc());
        System.out.println("-------------------");
    }
}
