package com.german.coleccionesJava.app.map;

import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {

        Map<String, Object> persona = new TreeMap<>();

        Map<String, String> direccion = new TreeMap<>(Comparator.comparing(String::length).reversed());

        persona.put("nombre", "Juan");
        persona.put("apellidoPaterno", "Pérez");
        persona.put("apellidoMaterno", "Rosas");
        persona.put("email", "juanRosas22@gmail.com");
        persona.put("edad", "28");

        direccion.put("pais", "mexico");
        direccion.put("estado", "tabasco");
        direccion.put("ciudad", "villa hermosa");

        persona.put("direccion", direccion);
        System.out.println("persona = " + persona);

    }
}
