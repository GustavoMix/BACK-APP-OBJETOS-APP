
package bo.gestora.example.facade;

import bo.gestora.common.data_base.DBConnector;
import bo.gestora.common.data_base.error.NoFountRepoException;
import bo.gestora.example.AppConfig;
import bo.gestora.example.dto.CuaPersonas;
import bo.gestora.example.repositories.CuaRepo;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class CuaFacade {
        private static final Logger LOG = Logger.getLogger(CuaFacade.class.getSimpleName());
       
    @Inject
    DBConnector dBConnector;

    @Inject
    AppConfig appConfig;
        

//MOSTRAR SOLICITUDES POR ID EN CASO DE QUE NO EXISTA MOSTRAR MENSAJE         
        public List<CuaPersonas> getEditar(String ci, String co) {
        LOG.info("ingresa a la funcion getEditar");
        try {
            CuaRepo cuaRepo = dBConnector.getQueryRepository(CuaRepo.class);
            List<CuaPersonas> resultado = cuaRepo.getEditarPorId(ci, co);
            System.out.println("esto es el resultado: " + resultado.toString());
            return resultado;
        } catch (Exception e) {
            LOG.log(Level.WARNING, "ERROR DE BD " + e);
            List<CuaPersonas> error = null;
            return error;
        }

    } 


}




