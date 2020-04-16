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
public class QLDS implements IQLDS{
    ArrayList<CaNhan> l= new ArrayList<>();
    @Override
    public int them (CaNhan p){
        l.add(p);
        return 0;
    }
    
    @Override
    public int xoa (String ten){
        l.remove(ten);
        return 0;
    }
    
    @Override
    public void inDS(){
        System.out.println("Cac ca nhan co trong danh sach la: ");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i).HienThiTT());
        }
    }
}
