package com.german.coleccionesJava.app.set;

import com.german.coleccionesJava.app.modelo.Alumno;

import java.util.HashSet;
import java.util.Set;


public class EjemploHashSetUnicidad {

    public static void main(String[] args) {

        Set<Alumno> sa = new HashSet<>();

        sa.add(new Alumno("Juanito Dominguez", 3));
        sa.add(new Alumno("Alexa Juarez", 5.5));
        sa.add(new Alumno("Enrique Gutierrez", 3.5));
        sa.add(new Alumno("Geronimo Chavez",2.1));
        sa.add(new Alumno("Pablo Ordoñez",7.6));
        sa.add(new Alumno("Alexa Juarez", 5.5));

        System.out.println(sa);

    }

}
