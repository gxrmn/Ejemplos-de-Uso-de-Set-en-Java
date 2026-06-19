package com.german.coleccionesJava.app.list;

import com.german.coleccionesJava.app.modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size: " + al.size());
        System.out.println("Esta vacia la lista: " + al.isEmpty());

        al.add(new Alumno("Juanito Dominguez", 3));
        al.add(new Alumno("Alexa Juarez", 5.5));
        al.add(new Alumno("Enrique Gutierrez", 3.5));
        al.add(2, new Alumno("Geronimo Chavez",2.1));
        al.add(new Alumno("Pablo Ordoñez",7.6));
        al.set(3, new Alumno("Alexa Juarez", 5.5));

        System.out.println(al + ", size: " + al.size());

        //al.remove(new Alumno("Alexa Juarez",5.5));
        al.remove(4);

        System.out.println(al + ", size: " + al.size());

        Object a[] = al.toArray();
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}