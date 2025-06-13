package id.winklesen.learn_java.common_class.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class WildcardVSGenericsMethod {
    // mengunakan wildcards
    static void print(Collection<?> col) {
        for (Object o : col) {
            System.out.println(o);
        }
    }

    // menggunakan generic methods
    static <T> Collection arrayToCollection(T[] a) {
        Collection<T> c = new ArrayList();
        Collections.addAll(c, a);
        return c;
    }

    public static void main(String[] args) {
        String[] sa = { "Happy", "Coding" };

        Collection r = arrayToCollection(sa);

        print(r);
    }
}
