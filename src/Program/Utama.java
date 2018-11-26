/* To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

/**
 *
 * @author ABDhilah
 */
public class Utama {
    public static void main(String[] args) {
        Bangundatar b[] = new Bangundatar[4];
        
       PersegiPanjang pp = new PersegiPanjang(40,2);
       Persegi p = new Persegi(5);
       Lingkaran l = new Lingkaran(5);
      
        System.out.println("\n"+pp.hasil());
        System.out.println("\n"+p.hasil());
        System.out.println("\n"+l.hasil());
    }
}