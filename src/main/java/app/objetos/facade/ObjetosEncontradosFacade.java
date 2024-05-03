package app.objetos.facade;

import app.objetos.dto.EstadisticasRs;
import app.objetos.dto.ObjetosEncontradosRs;
import app.objetos.repositores.EstadisticasRepo;
import app.objetos.repositores.ObjetosEncontradosRepo;
import bo.gestora.common.data_base.DBConnector;
import bo.gestora.common.data_base.error.NoFountRepoException;
import bo.gestora.example.AppConfig;
import java.util.List;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class ObjetosEncontradosFacade {
    private static final Logger LOG = Logger.getLogger(EstadisticasFacade.class.getSimpleName());

    @Inject
    DBConnector dBConnector;

    @Inject
    AppConfig appConfig;
    
    public List<ObjetosEncontradosRs> obtenerObjetosEncontrados() throws NoFountRepoException {
    LOG.info("Rq-> Obteniendo lista");
    ObjetosEncontradosRepo objetosEncontradosRepo = dBConnector.getQueryRepository(ObjetosEncontradosRepo.class);
    List<ObjetosEncontradosRs> lista = objetosEncontradosRepo.obtenerObjetosEncontrados();
    return lista;
}
    
}
