package org.edu.cac;

import org.edu.cac.enums.Club;

import java.util.HashMap;
import java.util.Map;

public class Equipo {
    //Para poder jugar un partido necesitamos crear un Equipo.
    //Dentro del Equipo vamos a tener: Un nombre del Club, jugadores y posiciones en ligas:

    //Nombre del club:
    Club nombreClub; //enum
    //Nro de la camiseta y nombre del jugador:
    Map<Integer, String> jugadores;
    //Nombre de la liga y posicion:
    Map<String, Integer> posicionEnLigas;

    //CONSTRUCTOR:
    public Equipo(Club nombreClub, Map<String, Integer> posicionEnLigas) {
        this.nombreClub = nombreClub;
        this.posicionEnLigas = posicionEnLigas;
        this.jugadores = new HashMap<>();
    }

    //GETTERS Y SETTERS:
    public Club getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(Club nombreClub) {
        this.nombreClub = nombreClub;
    }

    public Map<Integer, String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Map<Integer, String> jugadores) {
        this.jugadores = jugadores;
    }

    public Map<String, Integer> getPosicionEnLigas() {
        return posicionEnLigas;
    }

    public void setPosicionEnLigas(Map<String, Integer> posicionEnLigas) {
        this.posicionEnLigas = posicionEnLigas;
    }

    //El Equipo necesita tener Jugadores, para ello debemos poder Agregar jugadores:
    public void agregarJugador(Jugador jugador){
        //Podemos validar que si el jugador ya existe, no lo agregamos.
        //Pero como acá estamos utilizando un HashMap jugadores, el mismo no permite claves duplicadas
        jugadores.put(jugador.getNro_camiseta(), jugador.getNombre());
    }
}
