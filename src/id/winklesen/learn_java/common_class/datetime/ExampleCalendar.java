package id.winklesen.learn_java.common_class.datetime;

import java.util.Calendar;

public class ExampleCalendar {
    public static void main(String[] args) {

        // Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());
    }
}