/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package programrentalfilm;

/**
 *
 * Nama  : Balya Ahmad Waffa,
 * NIM   : 21104410052,
 * Kelas : TI B,
 */

//Abstrack class
public abstract class Transaksi {
    int lamaSewa, hargaSewa;
    
    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    public int getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
    }
}
