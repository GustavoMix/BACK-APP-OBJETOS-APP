package app.objetos.services;

import app.objetos.dto.RespuestaGenericaRs;
import app.objetos.dto.EstadisticasRs;
import app.objetos.facade.EstadisticasFacade;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.transaction.Transactional;
import java.util.List;
import java.util.logging.Logger;

@Path("/objetos")
public class EstadisticasService {
    private static final Logger LOG = Logger.getLogger(EstadisticasService.class.getName());

    @Inject
    EstadisticasFacade estadisticasFacade;

    @GET
    @Path("/estadisticas")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    //@ProtectedAccess
    //@SecurityRequirement(name = "apiKey")
    public RespuestaGenericaRs obtenerEstadisticas() {
        LOG.info("GET /objetos/estadisticas -> ");
        try {
            List<EstadisticasRs> estadisticas = estadisticasFacade.obtenerEstadisticas();
            return new RespuestaGenericaRs("2000", "La operación fue realizada correctamente", estadisticas);
        } catch (Exception e) {
            LOG.severe("Error al obtener estadísticas: " + e.getMessage());
            return new RespuestaGenericaRs("5000", "Error interno del servidor", null);
        }
    }
}
