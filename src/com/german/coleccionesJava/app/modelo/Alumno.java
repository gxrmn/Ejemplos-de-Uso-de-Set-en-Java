package com.german.coleccionesJava.app.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{

    private int matricula;
    private Double nota;
    private String nombreCompleto;
    private static int numGenerado=0;

    public Alumno(String nombreCompleto, double nota){
        this.nombreCompleto = nombreCompleto;
        this.nota = nota;
        this.matricula = ++numGenerado;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public Double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "matricula=" + matricula +
                ", nombreCompleto='" + nombreCompleto +
                ", nota='" + nota + "\n";
    }

    @Override
    public int compareTo(Alumno a) {
       /* if(a == null){
            return 0;
        }
        return this.nombreCompleto.compareTo(a.getNombreCompleto());

        if(this.matricula == a.matricula){
            return 0;
        }
        if(this.matricula > a.matricula){
            return 1;
        }
        else{
            return -1;
        }
        */
        if(a == null){
            return 0;
        }
        return this.nota.compareTo(a.getNota());

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nota, alumno.nota) && Objects.equals(nombreCompleto, alumno.nombreCompleto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nota, nombreCompleto);
    }
}
