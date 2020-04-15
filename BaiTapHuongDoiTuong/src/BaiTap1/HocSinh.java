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
public class HocSinh extends CaNhan{
    private String lop, nangKhieu;
    
    public HocSinh(String hoTen, int tuoi, String diaChi, String sdt, String lop, String nangKhieu){
        super(hoTen,tuoi,diaChi,sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }
    
    public String getlop(){
        return lop;
    }
    public void setlop(String lop){
        this.lop = lop;
    }
    
    public String getnangKhieu(){
        return nangKhieu;
    }
    public void setnangKhieu(String nangKhieu){
        this.nangKhieu = nangKhieu;
    }
    
    @Override
    public String HienThiTT(){
        return "Lop: "+lop+"\n"+"Nang Khieu: "+nangKhieu+"\n";
    }
}
