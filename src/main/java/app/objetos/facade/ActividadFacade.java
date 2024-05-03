package app.objetos.facade;

import app.objetos.dto.RespuestaGenericaRs;
import app.objetos.dto.ActividadRs;
import app.objetos.repositores.ActividadRepo;

import bo.gestora.common.data_base.DBConnector;
import bo.gestora.common.data_base.error.NoFountRepoException;
import bo.gestora.example.AppConfig;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class ActividadFacade {
    private static final Logger LOG = Logger.getLogger(ActividadFacade.class.getSimpleName());

    @Inject
    DBConnector dBConnector;

    @Inject
    AppConfig appConfig;
    
public List<ActividadRs> obtenerActividades() throws NoFountRepoException {
    LOG.info("Rq-> Obteniendo lista de dependientes");
    ActividadRepo actividadRepo = dBConnector.getQueryRepository(ActividadRepo.class);
    List<ActividadRs> lista = actividadRepo.obtenerActividades();
    return lista;
}


}
