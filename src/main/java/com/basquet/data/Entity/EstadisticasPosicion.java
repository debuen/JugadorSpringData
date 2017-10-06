package com.basquet.data.Entity;

public class EstadisticasPosicion {

    private String posicion;
    private Double numCanastas;
    private Double numRebotes;
    private Double numAsistencias;

    private int maxCanastas;
    private int minCanastas;
    private int maxRebotes;
    private int minRebotes;
    private int maxAsistencias;
    private int minAsistencias;

    public EstadisticasPosicion(String posicion, Double numCanastas, Double numRebotes, Double numAsistencias) {
        this.posicion = posicion;
        this.numCanastas = numCanastas;
        this.numRebotes = numRebotes;
        this.numAsistencias = numAsistencias;
    }

    public EstadisticasPosicion(String posicion, Double numCanastas, Double numRebotes, Double numAsistencias, int maxCanastas, int minCanastas, int maxRebotes, int minRebotes, int maxAsistencias, int minAsistencias) {
        this.posicion = posicion;
        this.numCanastas = numCanastas;
        this.numRebotes = numRebotes;
        this.numAsistencias = numAsistencias;
        this.maxCanastas = maxCanastas;
        this.minCanastas = minCanastas;
        this.maxRebotes = maxRebotes;
        this.minRebotes = minRebotes;
        this.maxAsistencias = maxAsistencias;
        this.minAsistencias = minAsistencias;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Double getNumCanastas() {
        return numCanastas;
    }

    public void setNumCanastas(Double numCanastas) {
        this.numCanastas = numCanastas;
    }

    public Double getNumRebotes() {
        return numRebotes;
    }

    public void setNumRebotes(Double numRebotes) {
        this.numRebotes = numRebotes;
    }

    public Double getNumAsistencias() {
        return numAsistencias;
    }

    public void setNumAsistencias(Double numAsistencias) {
        this.numAsistencias = numAsistencias;
    }

    public int getMaxCanastas() {
        return maxCanastas;
    }

    public void setMaxCanastas(int maxCanastas) {
        this.maxCanastas = maxCanastas;
    }

    public int getMinCanastas() {
        return minCanastas;
    }

    public void setMinCanastas(int minCanastas) {
        this.minCanastas = minCanastas;
    }

    public int getMaxRebotes() {
        return maxRebotes;
    }

    public void setMaxRebotes(int maxRebotes) {
        this.maxRebotes = maxRebotes;
    }

    public int getMinRebotes() {
        return minRebotes;
    }

    public void setMinRebotes(int minRebotes) {
        this.minRebotes = minRebotes;
    }

    public int getMaxAsistencias() {
        return maxAsistencias;
    }

    public void setMaxAsistencias(int maxAsistencias) {
        this.maxAsistencias = maxAsistencias;
    }

    public int getMinAsistencias() {
        return minAsistencias;
    }

    public void setMinAsistencias(int minAsistencias) {
        this.minAsistencias = minAsistencias;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EstadisticasPosicion{");
        sb.append("posicion='").append(posicion).append('\'');
        sb.append(", numCanastas=").append(numCanastas);
        sb.append(", numRebotes=").append(numRebotes);
        sb.append(", numAsistencias=").append(numAsistencias);
        if (maxCanastas != 0)sb.append(", maxCanastas=").append(maxCanastas);
        if (minCanastas != 0)sb.append(", minCanastas=").append(minCanastas);
        if (maxRebotes != 0)sb.append(", maxRebotes=").append(maxRebotes);
        if (minRebotes != 0)sb.append(", minRebotes=").append(minRebotes);
        if (maxAsistencias != 0)sb.append(", maxAsistencias=").append(maxAsistencias);
        if (minAsistencias != 0)sb.append(", minAsistencias=").append(minAsistencias);

        sb.append('}');
        return sb.toString();
    }
}
