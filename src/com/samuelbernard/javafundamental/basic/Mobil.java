package com.samuelbernard.javafundamental.basic;

public class Mobil implements Kemampuan{
    private String merk;
    private int harga;
    private  double kecepatan;
    private  boolean punyaAtap;
    private char nomorAwal;

    public Mobil(String merk, int harga, double kecepatan, boolean punyaAtap, char nomorAwal){
        this.merk = merk;
        this.harga = harga;
        this.kecepatan = kecepatan;
        this.punyaAtap = punyaAtap;
        this.nomorAwal = nomorAwal;
        cetakBintang();
    }

    @Override
    public void berjalan(boolean kenyataan) {
        System.out.println(kenyataan);
    }

    public void cetakMerk(){
        System.out.println(merk);
    }

    public void cetakHarga(){
        System.out.println(harga);
    }

    public void cetakBintang(){
        for (int i = 1; i < 5; i++){
            for (int I = 0; I<i; I ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



}