package com.ejercicio1;

import java.util.Optional;

public class Person {
    private String nombre, ciudad;
    private Optional<Integer> edad;

    private Integer edadInt;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Optional<Integer> getEdad() {
        return edad;
    }

    public void setEdad(Optional<Integer> edad) {
        this.edad = edad;
    }

    public Integer getEdadInt() {
        return edadInt;
    }

    public void setEdadInt(Integer edadInt) {
        this.edadInt = edadInt;
    }
}
