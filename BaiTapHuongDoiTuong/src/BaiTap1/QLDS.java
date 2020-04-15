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
    ArrayList<CaNhan> l= new ArrayList<CaNhan>();
    @Override
    public int them (CaNhan p){
        l.add(p);
        return 0;
    }
    
    @Override
    public int xoa (String ten){
        l.remove(ten);
    }
    
    @Override
    public void inDS(){
        return 0;
    }

    private int add(String HienThiTT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
