package com.german.coleccionesJava.app.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String, Object> persona = new HashMap<>();
        Map<String, String> direccion = new HashMap<>();
        System.out.println("Tiene objetos?: "+!persona.isEmpty());

        persona.put(null, null);
        persona.put(null, "12345");
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

        String nombre = (String) persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellidoPaterno = (String) persona.get("apellidoPaterno");
        System.out.println("apellidoPaterno = " + apellidoPaterno);


        //String apellidoP = persona.remove("apellidoPaterno");
        boolean apellidoP = persona.remove("apellidoPaterno","Pérez");
        System.out.println("Eliminado: " + apellidoP);
        System.out.println("persona: " + persona);

        boolean b = persona.containsKey("apellidoPaterno");
        System.out.println("b = " + b);

        System.out.println("================================= Entry");
        for(Map.Entry<String, Object> entry : persona.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("================================= forEach");
        persona.forEach((llave,valor) ->
                System.out.println(llave+ " -> " + valor)
                );

        System.out.println("================================= obtener los valores con Collection");
        Collection<Object> valores = persona.values();
        for(Object v:valores){
            System.out.println(v);
        }

        System.out.println("================================= obtener las llaves en un set");
        Set<String> llaves = persona.keySet();
        for(String k: llaves){
            System.out.println(k);
        }


        System.out.println("================================= Imprimiendo si el map tiene valores");
        System.out.println("Tiene objetos?: "+!persona.isEmpty());

    }
}
