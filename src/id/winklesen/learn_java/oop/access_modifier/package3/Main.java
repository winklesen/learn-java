package id.winklesen.learn_java.oop.access_modifier.package3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nilainya adalah " + Perhitungan.nilai);

        for (int x = 0 ; x < 5; x++){
            new Perhitungan();
        }

        System.out.println("Sampai "+Perhitungan.nilai);

        System.out.println("getNilai memiliki nilai " + Perhitungan.getNilai());
    }
}