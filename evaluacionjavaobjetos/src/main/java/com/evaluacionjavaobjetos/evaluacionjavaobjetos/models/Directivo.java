// ISABELLA PARRY - COHORTE 4 (HAMILTON) - GENERATION
package com.evaluacionjavaobjetos.evaluacionjavaobjetos.models;

public class Directivo extends Persona {
    public String cargo;

    //CONSTRUCTORES
    public Directivo() {
        super();
    }

    public Directivo(String cargo) {
        this.cargo = cargo;
    }

    public Directivo(String nombre, String apellido, String rut, String cargo) {
        super(nombre, apellido, rut);
        this.cargo = cargo;
    }

    //GETTERS Y SETTERS
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Directivo [cargo=" + cargo + "]";
    }
    
}
