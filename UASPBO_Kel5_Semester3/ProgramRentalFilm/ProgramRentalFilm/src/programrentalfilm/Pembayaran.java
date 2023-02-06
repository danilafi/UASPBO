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

//Inheritance
public class Pembayaran extends Transaksi{

    //encapsulasi
    public Pembayaran(int lamaSewa,int hargaSewa ) {
        this.hargaSewa = hargaSewa;
        this.lamaSewa = lamaSewa;
    }
    
    @Override
    public int getLamaSewa() {
        return lamaSewa;
    }

    @Override
    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

  @Override
    public int getHargaSewa() {
        return hargaSewa;
    }

  @Override
    public void setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
    }
    
    public String TotalPembayaran(){
        rentalfilm Rfilm = new rentalfilm();
        Rfilm.totalBayar = lamaSewa * hargaSewa;
        String jml_bayar = Integer.toString(Rfilm.totalBayar);
        return jml_bayar;
    }
}