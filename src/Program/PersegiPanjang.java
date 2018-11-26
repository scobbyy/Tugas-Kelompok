/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

/**
 *
 * @author ABD
 */
public class PersegiPanjang implements Bangundatar{

    private double panjang,lebar;

    public PersegiPanjang(double p, double l) {
        panjang = p;
        lebar = l;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    @Override
    public double luas() {
        return (panjang*lebar); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double keliling() {
        return (2*panjang*lebar); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String hasil() {
       return ("persegi Panjang"
               +"\n panjang : " +(double)getPanjang()
               +"\n lebar : "+(double)getLebar()
               +"\n luas : "+(double)luas()
               +"\n keliling : "+(double)keliling()
               ); //To change body of generated methods, choose Tools | Templates.
    }  
    
}