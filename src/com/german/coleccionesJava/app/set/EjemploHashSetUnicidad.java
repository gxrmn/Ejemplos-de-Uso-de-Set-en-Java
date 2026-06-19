package com.german.coleccionesJava.app.set;

import com.german.coleccionesJava.app.modelo.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        Set<Alumno> sa = new HashSet<>();
        //List<Alumno> sa = new ArrayList<>();
        //List<Alumno> sa = new LinkedList<>();

        sa.add(new Alumno("Juanito Dominguez", 3));
        sa.add(new Alumno("Alexa Juarez", 5.5));
        sa.add(new Alumno("Enrique Gutierrez", 3.5));
        sa.add(new Alumno("Geronimo Chavez",2.1));
        sa.add(new Alumno("Pablo Ordoñez",7.6));
        sa.add(new Alumno("Alexa Juarez", 5.5));

        System.out.println(sa);

        System.out.println("Iterando con forEach");
        for(Alumno a: sa){
            System.out.println(a);
        }

        /*System.out.println("Iterando con un for clasico");
        for(int i = 0; i < sa.size(); i++){
            System.out.println(sa.get(i));
        }*/

        System.out.println("Iterando usando while y iterator");
        Iterator<Alumno> it = sa.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a);
        }

        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);

    }
}