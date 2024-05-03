package app.objetos.services;

import app.objetos.dto.ActividadRs;
import app.objetos.dto.EstadisticasRs;
import app.objetos.facade.EstadisticasFacade;
import java.util.List;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/objetos")
public class EstadisticasService {
        private static final Logger LOG = Logger.getLogger(ActividadService.class.getSimpleName());

    @Inject
    EstadisticasFacade estadisticasFacade;
    @GET
    @Path("/estadisticas")
    @Produces(MediaType.APPLICATION_JSON)
    //@ProtectedAccess
    //@SecurityRequirement(name = "apiKey")
    public List<EstadisticasRs> obtenerEstadisticas() {
        LOG.info("GET /estadisticas/ -> ");
        return estadisticasFacade.obtenerEstadisticas();
    }
}
