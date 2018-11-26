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
public class Persegi implements Bangundatar{
    private double sisi;

    public Persegi(double s) {
        sisi = s;
    }

    public double getSisi() {
        return sisi;
    }

    
    @Override
    public double luas() {
       return sisi*sisi;
    }

    @Override
    public double keliling() {
        return 4*sisi; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String hasil() {
        return ("persegi"
               +"\n sisi : " +(double)getSisi()
               +"\n luas : "+(double)luas()
               +"\n keliling : "+(double)keliling()
               ); //To change body of generated methods, choose Tools | Templates.
    }   //To change body of generated methods, choose Tools | Templates.
 }
    
