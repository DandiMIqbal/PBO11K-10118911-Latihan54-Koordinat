    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118911.latihan54.koordinat;

/**
 *
 * @author Dandi M Iqbal
 * Nama : Dandi Muhammad Iqbal 
 * Kelas : IF-11K
 * Nim : 10118911
 * Deskripsi Program    : Program ini berisi program untuk menampilkan warna dan
 * letak koordinat
 */
public class PBO11K10118911Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        int y = 4;
        String warna = "Jingga";
        WarnaKoordinat w = new WarnaKoordinat(x,y,warna);
        w.setNamaWarna(warna);
        w.setX(x);
        w.setY(y);
        
        System.out.println("Warna Koordinat : " + w.getNamaWarna());
        System.out.println("Koordinat Sumbu : " + w.getX() + ", y : " + w.getY());
    }
    
}
