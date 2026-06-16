package com.german.coleccionesJava.app.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        Set<String> ts = new TreeSet<>(Comparator.reverseOrder());

        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        System.out.println(ts);

        Set<Integer> numeros = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b.compareTo(a);
            }
        });
        numeros.add(100);
        numeros.add(20);
        numeros.add(47);
        numeros.add(62);
        numeros.add(23);

        System.out.println(numeros);

    }
}
