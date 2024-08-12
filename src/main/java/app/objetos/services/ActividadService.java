package app.objetos.services;

import app.objetos.dto.ActividadRs;
import app.objetos.facade.ActividadFacade;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.logging.Logger;

@Path("/objetos")
public class ActividadService {
    private static final Logger LOG = Logger.getLogger(ActividadService.class.getSimpleName());

    @Inject
    ActividadFacade actividadFacade;

    @GET
    @Path("/actividad")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ActividadRs> obtenerActividades() {
        LOG.info("GET /objetos/actividad -> Obteniendo actividades");
        try {
            return actividadFacade.obtenerActividades();
        } catch (Exception e) {
            LOG.severe("Error al obtener actividades: " + e.getMessage());
            // Aquí podrías lanzar una excepción específica o manejar el error de otra forma
            throw new RuntimeException("Error al obtener actividades", e);
        }
    }
}
