
package co.com.poli.AppRegistroMaterias.model;

import java.util.Objects;


public class Registro {
    private String idRegistro;
    private String documento;
    private String categoria;
    private double precio;
    private Materia materia;

    public Registro() {
    }

    public Registro(String idRegistro, String documento, String categoria, Materia materia) {
        this.idRegistro = idRegistro;
        this.documento = documento;
        this.categoria = categoria;
        this.materia = materia;
        
        if (categoria.equals("A")){
            this.precio = 2500;
        }else{
            this.precio = 4300;
        }
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.idRegistro);
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
        final Registro other = (Registro) obj;
        if (!Objects.equals(this.idRegistro, other.idRegistro)) {
            return false;
        }
        return true;
    }
    
    
    
}
