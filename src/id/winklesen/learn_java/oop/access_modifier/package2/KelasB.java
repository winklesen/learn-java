package id.winklesen.learn_java.oop.access_modifier.package2;

import com.dicoding.javafundamental.accessmodifier.package1.KelasA;

public class KelasB extends KelasA {

    @Override
    protected void methodC() {
        super.methodC();

        System.out.println("Contoh pemanggilan protected dari package luar");
    }
}
