package com.samuelbernard.javafundamental.basic;

public class Mobil {
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
    }

    public void cetakMerk(){
        System.out.println(merk);
    }

    public void cetakHarga(){
        System.out.println(harga);
    }

}