package com.samuelbernard.javafundamental.basic;

public class Main {
    public static void main (String[] args){
        System.out.println("Program Pertama Jalan");
        System.out.println(cetakNamaLagi("Samuel"));
    }

    private void cetakNama(String nama){
        System.out.println(nama);
    }

    private static String cetakNamaLagi(String nama){
        return nama;
    }

}