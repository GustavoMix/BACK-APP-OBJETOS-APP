package app.objetos.facade;

import app.objetos.dto.ObjetosEncontradosRs;
import app.objetos.dto.ObjetosExtraviadosRs;
import app.objetos.repositores.ObjetosEncontradosRepo;
import app.objetos.repositores.ObjetosExtraviadosRepo;
import bo.gestora.common.data_base.DBConnector;
import bo.gestora.common.data_base.error.NoFountRepoException;
import bo.gestora.example.AppConfig;
import java.util.List;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;


@RequestScoped
public class ObjetosExtraviadosFacade {
    private static final Logger LOG = Logger.getLogger(EstadisticasFacade.class.getSimpleName());

    @Inject
    DBConnector dBConnector;

    @Inject
    AppConfig appConfig;
    
    public List<ObjetosExtraviadosRs> obtenerObjetosEncontrados() throws NoFountRepoException {
    LOG.info("Rq-> Obteniendo lista");
    ObjetosExtraviadosRepo objetosExtraviadosRepo = dBConnector.getQueryRepository(ObjetosExtraviadosRepo.class);
    List<ObjetosExtraviadosRs> lista = objetosExtraviadosRepo.obtenerObjetosExtraviados();
    return lista;
}  
}
