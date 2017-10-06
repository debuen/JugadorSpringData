package com.basquet.data.Service;

import com.basquet.data.Entity.Equipo;
import com.basquet.data.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service

public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;


    public void testEquipo(){

        Equipo e1 = new Equipo("FCB", "Barcelona", LocalDate.of(1899, 3,20));
        Equipo e2 = new Equipo("Real Madrid", "Madrid", LocalDate.of(1900, 8, 11));
        Equipo e3 = new Equipo("Atletico de Madrid", "Madrid", LocalDate.of(1930, 1, 30));
        Equipo e4 = new Equipo("Villareal", "Valencia", LocalDate.of(1950, 11, 20));
        Equipo e5 = new Equipo("Espanyol", "Barcelona", LocalDate.of(1930, 8, 2));
        Equipo error = new Equipo("FCB", "Barcelona", LocalDate.of(1899, 3,20));

        equipoRepository.save(e1);
        equipoRepository.save(e2);
        equipoRepository.save(e3);
        equipoRepository.save(e4);
        equipoRepository.save(e5);
       //equipoRepository.save(error);

        System.out.println();

        System.out.println("Buscar equipos por localidad: ");
        System.out.println(equipoRepository.findByLocalidad("Barcelona"));
        System.out.println();




    }

}
