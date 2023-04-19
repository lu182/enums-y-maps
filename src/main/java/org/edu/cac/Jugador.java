package org.edu.cac;

import org.edu.cac.enums.Posicion;

public class Jugador {

    private String nombre;
    private Integer nro_camiseta;
    private Equipo equipo;
    private Posicion posicion;


    public Jugador(String nombre, Integer nro_camiseta, Equipo equipo, Posicion posicion) {
        this.nombre = nombre;
        this.nro_camiseta = nro_camiseta;
        this.equipo = equipo;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNro_camiseta() {
        return nro_camiseta;
    }

    public void setNro_camiseta(Integer nro_camiseta) {
        this.nro_camiseta = nro_camiseta;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
}
