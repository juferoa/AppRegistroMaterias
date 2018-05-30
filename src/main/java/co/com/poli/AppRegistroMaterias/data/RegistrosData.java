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
public class RegistrosData {

    private static List<Registro> listaRegistros;
    

    static {
            
        listaRegistros = new ArrayList<Registro>() {
            {
                add(new Registro("1", "10", "A", new Materia("1010", "Geometría", 3, 5, 10)));
                add(new Registro("2", "20", "B", new Materia("1020", "Álgebra", 2, 2, 8)));            
                add(new Registro("3", "30", "B", new Materia("1010", "Geometría", 3, 5, 10)));            
            }
        };
    }

    public static List<Registro> getListaRegistros() {
        return listaRegistros;
    }

    public static void setListaRegistros(List<Registro> aListaRegistros) {
        listaRegistros = aListaRegistros;
    }

}
