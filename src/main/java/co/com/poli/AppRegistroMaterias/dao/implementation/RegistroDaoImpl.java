package co.com.poli.AppRegistroMaterias.dao.implementation;

import co.com.poli.AppRegistroMaterias.dao.IRegistroDao;
import co.com.poli.AppRegistroMaterias.data.RegistrosData;
import co.com.poli.AppRegistroMaterias.model.Materia;
import co.com.poli.AppRegistroMaterias.model.Registro;
import java.util.List;

public class RegistroDaoImpl implements IRegistroDao {

    @Override
    public List<Registro> obtenerListaRegistros() {
        return RegistrosData.getListaRegistros();
    }

    @Override
    public String crearRegistro(Registro registro) {
        List<Registro> listaRegistros = obtenerListaRegistros();
        listaRegistros.add(registro);
        RegistrosData.setListaRegistros(listaRegistros);
        return "Registro Creado";
    }

    @Override
    public String eliminarRegistro(String idRegistro) {
        List<Registro> listaRegistros = obtenerListaRegistros();
        listaRegistros.remove(obtenerRegistro(idRegistro));
        RegistrosData.setListaRegistros(listaRegistros);
        return "Registro Eliminado";

    }

    @Override
    public String obtenerMateriaMasCostosa() {
        return null;
    }

    @Override
    public Registro obtenerRegistro(String idRegistro) {
        Registro registro = null;
        List<Registro> listaRegistros = obtenerListaRegistros();
        for (Registro item : listaRegistros) {
            if (item.getIdRegistro().equals(idRegistro)) {
                registro = item;
            }
        }
        return registro;
    }

}
