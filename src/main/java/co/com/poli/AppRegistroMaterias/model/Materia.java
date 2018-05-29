package co.com.poli.AppRegistroMaterias.model;

import java.util.Objects;

public class Materia {
    private String idMateria;
    private String nombre;
    private double numCreditos;
    private double cupoMin;
    private double cupoMax;

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(double numCreditos) {
        this.numCreditos = numCreditos;
    }

    public double getCupoMin() {
        return cupoMin;
    }

    public void setCupoMin(double cupoMin) {
        this.cupoMin = cupoMin;
    }

    public double getCupoMax() {
        return cupoMax;
    }

    public void setCupoMax(double cupoMax) {
        this.cupoMax = cupoMax;
    }

    public Materia() {
    }
        
    public Materia(String idMateria, String nombre, double numCreditos, double cupoMin, double cupoMax) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.numCreditos = numCreditos;
        this.cupoMin = cupoMin;
        this.cupoMax = cupoMax;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.idMateria);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        if (!Objects.equals(this.idMateria, other.idMateria)) {
            return false;
        }
        return true;
    }
    
    
    
}
