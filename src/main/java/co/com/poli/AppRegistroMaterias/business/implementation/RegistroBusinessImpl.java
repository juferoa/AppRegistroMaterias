/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppRegistroMaterias.business.implementation;

import co.com.poli.AppRegistroMaterias.business.IRegistroBusiness;
import co.com.poli.AppRegistroMaterias.dao.implementation.RegistroDaoImpl;
import co.com.poli.AppRegistroMaterias.model.Registro;
import java.util.List;

/**
 *
 * @author sala313
 */
public class RegistroBusinessImpl implements IRegistroBusiness {

    RegistroDaoImpl registroDaoImpl = new RegistroDaoImpl();

    @Override
    public List<Registro> obtenerListaRegistros() {

        return registroDaoImpl.obtenerListaRegistros();
    }

    @Override
    public String crearRegistro(Registro registro) {
        List<Registro> registros = obtenerListaRegistros();
        for (Registro item : registros) {
            if (item.equals(registro)) {
                if (item.getMateria().equals(registro.getMateria())) {
                    return "Usuario ya existe en esa materia";
                }
            }
        }
        return registroDaoImpl.crearRegistro(registro);
    }

    @Override
    public String eliminarRegistro(String idRegistro) {
        Registro registro = obtenerRegistro(idRegistro);
        if (registro != null) {
            return registroDaoImpl.eliminarRegistro(idRegistro);
        }

        return "Registro no existe";
    }

    @Override
    public Registro obtenerRegistro(String idRegistro) {
        Registro registro = obtenerRegistro(idRegistro);
        if (registro != null) {
            return registroDaoImpl.obtenerRegistro(idRegistro);
        }
        return null;
    }

    @Override
    public String obtenerMateriaMasCostosa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
