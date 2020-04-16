/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;
import java.util.ArrayList;

/**
 *
 * @author ngoct
 */
public class LopHoc {
    ArrayList<HocSinh> lhs = new ArrayList<>();
    ArrayList<GiaoVien> lgv = new ArrayList<>();
    public int themHocSinh(HocSinh hs){
        lhs.add(hs);
        return 0;
    }
    public int themGiaoVienGD(GiaoVien gv){
        lgv.add(gv);
        return  0;
    }
    public int inDSHS(){
        System.out.println("Cac hoc sinh co trong danh sach la: ");
        for (int i = 0; i < lhs.size(); i++) {
            System.out.println(lhs.get(i).HienThiTT());
        }
        return 0;
    }
    public int inDSGVGD(){
        System.out.println("Cac giao vien co trong danh sach la: ");
        for (int i = 0; i < lgv.size(); i++) {
            System.out.println(lgv.get(i).HienThiTT());
        }
        return 0;
    }
}
