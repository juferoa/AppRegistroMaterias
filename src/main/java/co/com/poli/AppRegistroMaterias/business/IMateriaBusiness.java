package co.com.poli.AppRegistroMaterias.business;

import co.com.poli.AppRegistroMaterias.dao.*;
import co.com.poli.AppRegistroMaterias.model.Materia;
import co.com.poli.AppRegistroMaterias.model.Registro;
import java.util.List;

public interface IMateriaBusiness {

    List<Materia> obtenerListaMaterias();

    Materia obtenerMateria(String idMateria);

    List<Registro> registrosMatriculados(String idMateria);
}
