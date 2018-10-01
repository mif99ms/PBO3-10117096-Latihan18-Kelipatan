/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117096.latihan18.kelipatan;

/**
 *
 * @author 
 * NAMA         : Miftah Muhammad Sidqi
 * NIM          : 10117096
 * KELAS        : PBO3
 * DESKRIPSI    : Program ini berisi program untuk menghitung kelipatan
 * 
 */
public class PBO310117096Latihan18Kelipatan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float i = (float) 3.5;

        do {
            if (i % 3 != 0) {
                System.out.println(i);
            }
            i += 3.5;
        } while (i <= 35);
    }
    
}
