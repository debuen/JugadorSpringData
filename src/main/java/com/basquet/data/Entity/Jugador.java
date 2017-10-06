package com.basquet.data.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity

public class Jugador{

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private Integer numAsistencias;
    private Integer numCanastas;
    private Integer numRebotes;
    private String posicion;

    @ManyToOne
    private Equipo equipo;

    public Jugador() {
    }

    public Jugador(String nombre, LocalDate fechaNacimiento, Integer numAsistencias, Integer numCanastas, Integer numRebotes, String posicion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.numAsistencias = numAsistencias;
        this.numCanastas = numCanastas;
        this.numRebotes = numRebotes;
        this.posicion = posicion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getNumAsistencias() {
        return numAsistencias;
    }

    public void setNumAsistencias(Integer numAsistencias) {
        this.numAsistencias = numAsistencias;
    }

    public Integer getNumCanastas() {
        return numCanastas;
    }

    public void setNumCanastas(Integer numCanastas) {
        this.numCanastas = numCanastas;
    }

    public Integer getNumRebotes() {
        return numRebotes;
    }

    public void setNumRebotes(Integer numRebotes) {
        this.numRebotes = numRebotes;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jugador jugador = (Jugador) o;

        if (id != null ? !id.equals(jugador.id) : jugador.id != null) return false;
        if (nombre != null ? !nombre.equals(jugador.nombre) : jugador.nombre != null) return false;
        if (fechaNacimiento != null ? !fechaNacimiento.equals(jugador.fechaNacimiento) : jugador.fechaNacimiento != null)
            return false;
        if (numAsistencias != null ? !numAsistencias.equals(jugador.numAsistencias) : jugador.numAsistencias != null)
            return false;
        if (numCanastas != null ? !numCanastas.equals(jugador.numCanastas) : jugador.numCanastas != null) return false;
        if (numRebotes != null ? !numRebotes.equals(jugador.numRebotes) : jugador.numRebotes != null) return false;
        if (posicion != null ? !posicion.equals(jugador.posicion) : jugador.posicion != null) return false;
        return equipo != null ? equipo.equals(jugador.equipo) : jugador.equipo == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (fechaNacimiento != null ? fechaNacimiento.hashCode() : 0);
        result = 31 * result + (numAsistencias != null ? numAsistencias.hashCode() : 0);
        result = 31 * result + (numCanastas != null ? numCanastas.hashCode() : 0);
        result = 31 * result + (numRebotes != null ? numRebotes.hashCode() : 0);
        result = 31 * result + (posicion != null ? posicion.hashCode() : 0);
        result = 31 * result + (equipo != null ? equipo.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", numAsistencias=").append(numAsistencias);
        sb.append(", numCanastas=").append(numCanastas);
        sb.append(", numRebotes=").append(numRebotes);
        sb.append(", posicion='").append(posicion).append('\'');
        sb.append(", equipo=").append(equipo);
        sb.append('}');
        return sb.toString();
    }
}

