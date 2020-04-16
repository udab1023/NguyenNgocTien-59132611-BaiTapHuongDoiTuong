/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author ngoct
 */
public class BT1_Main {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh("Tien", 20, "56 Duong2/4", "001", "59CNTT3", "Ve");
        HocSinh hs2 = new HocSinh("Nhan", 21, "16 Sinh Trung", "002", "59CNTT3", "Hat");
        GiaoVien gv1 = new GiaoVien("Loan", 40, "56 Ngo Tat To", "003", "KTLT", "CNTT");
        GiaoVien gv2 = new GiaoVien("Ha", 41, "36 Nguyen Thi Minh Khai", "004", "Do Hoa", "CNTT");
        
        LopHoc lh = new LopHoc();
        
        lh.themHocSinh(hs1);
        lh.themHocSinh(hs2);
        
        lh.themGiaoVienGD(gv1);
        lh.themGiaoVienGD(gv2);
        
        lh.inDSHS();
        lh.inDSGVGD();
    }
}
