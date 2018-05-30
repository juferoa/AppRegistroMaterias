/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppRegistroMaterias.data;

import co.com.poli.AppRegistroMaterias.model.Materia;
import co.com.poli.AppRegistroMaterias.model.Registro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sala313
 */
public class MateriasData {

    private static List<Materia> listaMaterias;
    

    static {
            
        listaMaterias = new ArrayList<Materia>() {
            {
                add(new Materia("1010", "Geometría", 3, 5, 10));
                add(new Materia("1020", "Álgebra", 2, 2, 8));   
                add(new Materia("1030", "Arte", 1, 2, 15));   
            }
        };
    }

    public static List<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public static void setListaMaterias(List<Materia> aListaMaterias) {
        listaMaterias = aListaMaterias;
    }

}
