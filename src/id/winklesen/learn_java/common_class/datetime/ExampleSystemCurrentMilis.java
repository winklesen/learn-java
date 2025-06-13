package id.winklesen.learn_java.common_class.datetime;

public class ExampleSystemCurrentMilis {
    public static void main(String[] args) {
        long timeNow = System.currentTimeMillis();

        System.out.println("Waktu sekarang adalah " + timeNow + " milisecond");
    }
}
