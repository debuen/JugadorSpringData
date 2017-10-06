package com.basquet.data.Service;

import com.basquet.data.Entity.Jugador;
import com.basquet.data.Repository.EquipoRepository;
import com.basquet.data.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service

public class JugadorService {

    @Autowired
    private EquipoRepository equipoRepository;
    @Autowired
    private JugadorRepository jugadorRepository;

    public void testJugador(){

        Jugador j1 = new Jugador("Marc", LocalDate.of(1994, 11,30), 12, 30, 5, "base" );
        Jugador j2 = new Jugador("Victor", LocalDate.of(1994, 8,7), 10,20,5, "ala");
        Jugador j3 = new Jugador("Ferran", LocalDate.of(1995, 2,15), 20,10,3, "pivot");
        Jugador j4 = new Jugador("Jose", LocalDate.of(1993, 5, 12), 5, 25, 8, "base");
        Jugador j5 = new Jugador("Nestor", LocalDate.of(1990, 12,20), 15,5,20, "pivot");

        j1.setEquipo(equipoRepository.findOne(1L));
        j2.setEquipo(equipoRepository.findOne(1L));
        j3.setEquipo(equipoRepository.findOne(3L));
        j4.setEquipo(equipoRepository.findOne(4L));
        j5.setEquipo(equipoRepository.findOne(4L));


        jugadorRepository.save(j1);
        jugadorRepository.save(j2);
        jugadorRepository.save(j3);
        jugadorRepository.save(j4);
        jugadorRepository.save(j5);

        System.out.println("Buscar jugador por nombre: ");
        System.out.println(jugadorRepository.findByNombre("Marc"));
        System.out.println();

        System.out.println("Buscar jugadores, mayor o igual canastas: ");
        System.out.println(jugadorRepository.findByNumCanastasGreaterThanEqual(15));
        System.out.println();

        System.out.println("Buscar jugadores, rango asistencias ");
        System.out.println(jugadorRepository.findByNumAsistenciasBetween(5, 20));
        System.out.println();

        System.out.println("Buscar jugadores por posicion ");
        System.out.println(jugadorRepository.findByPosicion("base"));
        System.out.println();

        System.out.println("Buscar jugadores, fecha nacimiento anterior ");
        System.out.println(jugadorRepository.findByFechaNacimientoAfter(LocalDate.of(1994, 4, 1)));
        System.out.println();

        System.out.println("Agrupar jugadores por posicion de campo, AVG ");
        System.out.println(jugadorRepository.AVGJugador());
        System.out.println();

        System.out.println("Agrupar jugadores por posicion de campo, AVG, MIN, MAX ");
        System.out.println(jugadorRepository.AVGMaxMinJugador());
        System.out.println();

        System.out.println();
        System.out.println("CONSULTAS EQUIPO ");
        System.out.println();
        System.out.println("Buscar jugadores, por nombre equipo: ");
        System.out.println(jugadorRepository.findByEquipoNombre("FCB"));
        System.out.println();

        System.out.println("Buscar jugadores, por nombre equipo y posicion: ");
        System.out.println(jugadorRepository.findByEquipoNombreAndPosicion("FCB", "base"));
        System.out.println();

        System.out.println("Buscar jugador, por nombre equipo y max canastas: ");
        Pageable topPlayer = new PageRequest(0, 1);
        System.out.println(jugadorRepository.nombreJugador("FCB", topPlayer));
        System.out.println();

        System.out.println("2 -> Buscar jugador, por nombre equipo y max canastas: ");
        System.out.println(jugadorRepository.findFirstByEquipoNombreOrderByNumCanastasDesc("FCB"));
        System.out.println();

    }


}
