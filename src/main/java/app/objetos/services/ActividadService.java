package app.objetos.services;

import app.objetos.dto.ActividadRs;
import app.objetos.dto.RespuestaGenericaRs;
import app.objetos.facade.ActividadFacade;
import java.util.List;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;

@Path("/objetos")
public class ActividadService {
    private static final Logger LOG = Logger.getLogger(ActividadService.class.getSimpleName());

    @Inject
    ActividadFacade actividadFacade;
    @GET
    @Path("/actividad")
    @Produces(MediaType.APPLICATION_JSON)
    //@ProtectedAccess
    //@SecurityRequirement(name = "apiKey")
    public List<ActividadRs> obtenerActividades() {
        LOG.info("GET /dependientes/ -> ");
        return actividadFacade.obtenerActividades();
    }
}
