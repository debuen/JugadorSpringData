package com.basquet.data.Repository;

import com.basquet.data.Entity.Equipo;
import com.basquet.data.Entity.EstadisticasPosicion;
import com.basquet.data.Entity.Jugador;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Long>{

    //JUGADOR
    //A
    List<Jugador> findByNombre(String nombre);
    //B
    List<Jugador> findByNumCanastasGreaterThanEqual(Integer numcanastas);
    //C
    List<Jugador> findByNumAsistenciasBetween(Integer min, Integer max);
    //D
    List<Jugador> findByPosicion(String posicion);
    //E
    List<Jugador> findByFechaNacimientoAfter(LocalDate fechaNacimiento);
    //F
    @Query("select new com.basquet.data.Entity.EstadisticasPosicion (jugador.posicion, avg(jugador.numCanastas), avg(jugador.numAsistencias), avg(jugador.numRebotes)) " +
            "from Jugador jugador group by jugador.posicion")
    List<EstadisticasPosicion> AVGJugador();
    //G
    @Query("select new com.basquet.data.Entity.EstadisticasPosicion (jugador.posicion, avg(jugador.numCanastas), avg(jugador.numAsistencias), avg(jugador.numRebotes), max(jugador.numCanastas), min(jugador.numCanastas), max(jugador.numAsistencias), min(jugador.numAsistencias), max(jugador.numRebotes), max(jugador.numRebotes)) " +
            "from Jugador jugador group by jugador.posicion")
    List<EstadisticasPosicion> AVGMaxMinJugador();

    //EQUIPO
    //B
    List<Jugador> findByEquipoNombre(String nombre);
    //C
    List<Jugador> findByEquipoNombreAndPosicion(String nombre, String posicion);
    //D
    @Query("SELECT  jugador FROM Jugador jugador" + " WHERE jugador.equipo.nombre = :nombreEquipo " + " ORDER BY jugador.numCanastas desc")
    List<Jugador> nombreJugador(@Param("nombreEquipo") String nombre, Pageable pageable);

    List<Jugador> findFirstByEquipoNombreOrderByNumCanastasDesc(String nombre);


}
