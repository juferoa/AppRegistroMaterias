
package co.com.poli.AppRegistroMaterias.business;

import co.com.poli.AppRegistroMaterias.dao.*;
import co.com.poli.AppRegistroMaterias.model.Registro;
import java.util.List;


public interface IRegistroBusiness {
    
    List<Registro> obtenerListaRegistros ();
    String crearRegistro (Registro registro);
    String eliminarRegistro (String idRegistro);
    Registro obtenerRegistro (String idRegistro);
    String obtenerMateriaMasCostosa();
}
