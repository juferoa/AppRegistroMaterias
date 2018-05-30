package co.com.poli.AppRegistroMaterias.dao;

import co.com.poli.AppRegistroMaterias.model.Materia;
import co.com.poli.AppRegistroMaterias.model.Registro;
import java.util.List;

public interface IMateriaDao {

    List<Materia> obtenerListaMaterias();

    Materia obtenerMateria(String idMateria);

    List<Registro> registrosMatriculados(Materia materia);
}
