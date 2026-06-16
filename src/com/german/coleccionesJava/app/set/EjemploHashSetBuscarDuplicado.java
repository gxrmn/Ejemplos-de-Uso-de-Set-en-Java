package com.german.coleccionesJava.app.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {

        String[] peces = {"Payaso", "Bagre", "Mojarra", "Mojarra", "Tiburon", "Pupito", "Pupito"};
        Set<String> setPeces = new HashSet<>();
        Set<String> setPecesDuplicados = new HashSet<>();

        for(String p: peces){
            if(setPeces.contains(p)){
                System.out.println("Duplicado: " + p);
                setPecesDuplicados.add(p);
            }
            setPeces.add(p);
        }
        setPeces.removeAll(setPecesDuplicados);

        System.out.println("Peces: " + setPeces);
        System.out.println("Peces Duplicados: "  + setPecesDuplicados);
    }
}
