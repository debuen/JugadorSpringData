package com.basquet.data.Repository;

import com.basquet.data.Entity.Equipo;
import com.basquet.data.Entity.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipoRepository extends JpaRepository<Equipo, Long> {

    //EQUIPO
    //A
    List<Equipo> findByLocalidad(String localidad);
    //Equipo findByNombre(String nombre);

}
