package org.edu.cac;

import org.edu.cac.enums.Club;
import org.edu.cac.enums.Posicion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        //Sistema para poder crear Equipos de fútbol,hockey,rugby,etc.

        //Creo posiciones en ligas:
        Map<String, Integer> posiciones = new HashMap<>();
        posiciones.put("LFP", 1);
        posiciones.put("Copa Sudamericana", 3);
        posiciones.put("Copa Libertadores", 1);

        //Creo Equipo con Club River y posiciones en ligas:
        Equipo equipo1 = new Equipo(Club.RIVER, posiciones);

        //Creo jugadores:
        Jugador jugador1 = new Jugador("Franco Armani", 1, equipo1, Posicion.ARQUERO);
        Jugador jugador2 = new Jugador("Enzo Díaz", 13, equipo1, Posicion.DEFENSOR);
        Jugador jugador3 = new Jugador("Enzo Pérez", 24, equipo1, Posicion.MEDIO_CAMPISTA);
        Jugador jugador4 = new Jugador("Lucas Beltrán", 18, equipo1, Posicion.DELANTERO);

        //Agrego jugadores al equipo:
        equipo1.agregarJugador(jugador1);
        equipo1.agregarJugador(jugador2);
        equipo1.agregarJugador(jugador3);
        equipo1.agregarJugador(jugador4);

        System.out.println("Los jugadores del equipo de " + equipo1.getNombreClub() + " , fueron: ");
        //Recorremos todos los jugadores para luego poder mostrarlos a todos:
        Iterator it = equipo1.getJugadores().keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + equipo1.getJugadores().get(key));
        }

    }
}
