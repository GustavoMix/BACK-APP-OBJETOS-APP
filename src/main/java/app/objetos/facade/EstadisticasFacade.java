package app.objetos.facade;

import app.objetos.dto.ActividadRs;
import app.objetos.dto.EstadisticasRs;
import app.objetos.repositores.ActividadRepo;
import app.objetos.repositores.EstadisticasRepo;
import bo.gestora.common.data_base.DBConnector;
import bo.gestora.common.data_base.error.NoFountRepoException;
import bo.gestora.example.AppConfig;
import java.util.List;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class EstadisticasFacade {
    private static final Logger LOG = Logger.getLogger(EstadisticasFacade.class.getSimpleName());

    @Inject
    DBConnector dBConnector;

    @Inject
    AppConfig appConfig;
    
    public List<EstadisticasRs> obtenerEstadisticas() throws NoFountRepoException {
    LOG.info("Rq-> Obteniendo lista de dependientes");
    EstadisticasRepo estadisticasRepo = dBConnector.getQueryRepository(EstadisticasRepo.class);
    List<EstadisticasRs> lista = estadisticasRepo.obtenerEstadisticas();
    return lista;
}
}
