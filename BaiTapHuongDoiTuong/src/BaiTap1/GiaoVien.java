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
public class GiaoVien extends CaNhan{
    private String monDay, toBoMon;
    
    public GiaoVien(String hoTen, int tuoi, String diaChi, String sdt, String monDay, String toBoMon){
        super(hoTen,tuoi,diaChi,sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }
    
    public String getmonDay(){
        return monDay;
    }
    public void setmonDay(String monDay){
        this.monDay = monDay;
    }
    
    public String gettoBoMon(){
        return toBoMon;
    }
    public void settoBoMon(String toBoMon){
        this.toBoMon = toBoMon;
    }
    
    @Override
    public String HienThiTT(){
        return "Mon Day: "+monDay+"\n"+"To Bo Mon: "+toBoMon+"\n";
    }
}
