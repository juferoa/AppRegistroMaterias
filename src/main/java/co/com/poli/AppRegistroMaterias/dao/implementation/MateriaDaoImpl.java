
package co.com.poli.AppRegistroMaterias.dao.implementation;

import co.com.poli.AppRegistroMaterias.dao.IMateriaDao;
import co.com.poli.AppRegistroMaterias.dao.IRegistroDao;
import co.com.poli.AppRegistroMaterias.data.MateriasData;
import co.com.poli.AppRegistroMaterias.data.RegistrosData;
import co.com.poli.AppRegistroMaterias.model.Materia;
import co.com.poli.AppRegistroMaterias.model.Registro;
import java.util.List;


public class MateriaDaoImpl implements IMateriaDao{

    @Override
    public List<Materia> obtenerListaMaterias() {
        return MateriasData.getListaMaterias();
    }

    @Override
    public Materia obtenerMateria(String idMateria) {
        Materia materia = null;
        List<Materia> listaMaterias = obtenerListaMaterias();
        for (Materia item : listaMaterias){
            if (item.getIdMateria().equals(idMateria)){
                materia = item;
            }
        }
        return materia;
    }

    @Override
    public List<Registro> registrosMatriculados(Materia materia) {
        List<Registro> usuariosRegistrados = RegistrosData.getListaRegistros();
        List<Registro> matriculados = null;
        int cont =  0;
        for (Registro usuariosRegistrado : usuariosRegistrados) {
            if(usuariosRegistrado.getMateria().equals(materia)){
                matriculados.add(usuariosRegistrado);
            }
        }
        return matriculados;
    }


    
}
