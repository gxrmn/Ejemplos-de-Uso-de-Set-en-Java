package com.german.coleccionesJava.app.list;

import com.german.coleccionesJava.app.modelo.Alumno;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> ll = new LinkedList<>();
        System.out.println(ll + ", size: " + ll.size());
        System.out.println("Esta vacia la lista: " + ll.isEmpty());

        ll.add(new Alumno("Juanito Dominguez", 3));
        ll.add(new Alumno("Alexa Juarez", 5.5));
        ll.add(new Alumno("Enrique Gutierrez", 3.5));
        ll.add(new Alumno("Geronimo Chavez",2.1));
        ll.add(new Alumno("Pablo Ordoñez",7.6));
        ll.add(new Alumno("Alexa Juarez", 5.5));

        System.out.println(ll + ", size: " + ll.size());

        ll.addFirst(new Alumno("Daniel Park", 7.5));
        ll.addLast(new Alumno("Johan Seong", 7.1));

        System.out.println(ll + ", size: " + ll.size());

        System.out.println("Primero = " + ll.getFirst());
        System.out.println("Ultimo = " + ll.getLast());
        System.out.println("Indice 2 = " + ll.get(2));

        //ll.remove(2);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll + ", size: " + ll.size());
        //ll.pop(); Elimina el primer valor u objeto que hay en un linkedlist
        //ll.pollFirst(); Con este no regresa una excepcion, regresa un dato null en caso de que list este vacio
        //ll.pollLast() lo mismo que pollFirst()

    }
}