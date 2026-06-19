package com.german.coleccionesJava.app.set;

import com.german.coleccionesJava.app.modelo.Alumno;

import static java.util.Comparator.comparing;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {

    public static void main(String[] args) {

        /*Set<Alumno> sa = new TreeSet<>(new Comparator<Alumno>() {
            @Override
            public int compare(Alumno a, Alumno b) {
                return b.getNota().compareTo(a.getNota());
            }
        });*/

        //Set<Alumno> sa = new TreeSet<>((a,b) -> b.getNota().compareTo(a.getNota()));
        Set<Alumno> sa = new TreeSet<>(comparing(Alumno::getNota).reversed());

        sa.add(new Alumno("Juanito Dominguez", 3));
        sa.add(new Alumno("Alexa Juarez", 5.5));
        sa.add(new Alumno("Enrique Gutierrez", 3.5));
        sa.add(new Alumno("Geronimo Chavez",2.1));
        sa.add(new Alumno("Pablo Ordoñez",7.6));

        System.out.println(sa);

    }

}
