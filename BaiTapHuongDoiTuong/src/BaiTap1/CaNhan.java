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
public abstract class CaNhan {

    private String hoTen;
    private String diaChi;
    private String sdt;
    private int tuoi;
    
    public CaNhan(String hoTen, int tuoi, String diaChi, String sdt){
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    
    public String gethoTen(){
        return hoTen;
    }
    public void sethoTen(String hoTen){
        this.hoTen = hoTen;
    }
    
    public int gettuoi(){
        return tuoi;
    }
    public void settuoi(int tuoi){
        this.tuoi = tuoi;
    }
    
    public String getdiaChi(){
        return diaChi;
    }
    public void setdiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    
    public String getsdt(){
        return sdt;
    }
    public void setsdt(String sdt){
        this.sdt = sdt;
    }
    
    public String HienThiTT(){
        return "Ten: "+hoTen+"\n"+"Tuoi: "+tuoi+"\n"+"Dia Chi: "+diaChi+"\n"+"SDT: "+sdt+"\n";
    }
}
