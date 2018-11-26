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
public class Lingkaran implements Bangundatar{
    private double r;

    public double getR() {
        return r;
    }

    public Lingkaran(double jari) {
        r = jari;
    }

    @Override
    public double luas() {
       return 3.14*r*r; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double keliling() {
       return 2*3.14*r;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String hasil() {
       return ("persegi Panjang"
               +"\n jari-jari : " +(double)getR()
               +"\n luas : "+(double)luas()
               +"\n keliling : "+(double)keliling()
               ); //To change body of generated methods, choose Tools | Templates.
    }  
    
    
}
