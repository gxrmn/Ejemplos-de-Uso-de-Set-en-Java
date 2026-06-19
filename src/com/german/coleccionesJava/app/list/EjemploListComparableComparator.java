package com.german.coleccionesJava.app.list;

import com.german.coleccionesJava.app.modelo.Alumno;

import java.util.*;
import static java.util.Comparator.comparing;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>();

        sa.add(new Alumno("Juanito Dominguez", 3));
        sa.add(new Alumno("Alexa Juarez", 5.5));
        sa.add(new Alumno("Enrique Gutierrez", 3.5));
        sa.add(new Alumno("Geronimo Chavez",2.1));
        sa.add(new Alumno("Pablo Ordoñez",7.6));
        sa.add(new Alumno("Alexa Juarez", 5.5));

        //Collections.sort(sa, (a,b) -> a.getNota().compareTo(b.getNota()));
        //sa.sort((a,b) -> b.getNota().compareTo(a.getNota()));
        //sa.sort(Comparator.comparing((Alumno a) -> a.getNota()).reversed());
        sa.sort(comparing(Alumno::getNota).reversed());

        System.out.println(sa);

        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);

    }
}