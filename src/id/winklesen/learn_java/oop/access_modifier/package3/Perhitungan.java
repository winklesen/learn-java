package id.winklesen.learn_java.oop.access_modifier.package3;

public class Perhitungan {
    public static int nilai = 0;

    protected static int getNilai(){
        return nilai;
    }

    Perhitungan() {
        nilai++;
    }
}
