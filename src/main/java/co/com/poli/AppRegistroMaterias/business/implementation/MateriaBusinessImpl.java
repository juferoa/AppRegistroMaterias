/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppRegistroMaterias.business.implementation;

import co.com.poli.AppRegistroMaterias.business.IMateriaBusiness;
import co.com.poli.AppRegistroMaterias.dao.implementation.MateriaDaoImpl;
import co.com.poli.AppRegistroMaterias.model.Materia;
import co.com.poli.AppRegistroMaterias.model.Registro;
import java.util.List;

/**
 *
 * @author sala313
 */
public class MateriaBusinessImpl implements IMateriaBusiness{

    private MateriaDaoImpl materiaDaoImpl = new MateriaDaoImpl();
    
    @Override
    public List<Materia> obtenerListaMaterias() {
        return materiaDaoImpl.obtenerListaMaterias();
    }

    @Override
    public Materia obtenerMateria(String idMateria) {
        return materiaDaoImpl.obtenerMateria(idMateria);
    }

    @Override
    public List<Registro> registrosMatriculados(String idMateria) {
        return materiaDaoImpl.registrosMatriculados(obtenerMateria(idMateria));
    }
    
}
