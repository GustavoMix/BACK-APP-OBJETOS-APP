import app.objetos.dto.ActividadRs;
import app.objetos.dto.RespuestaGenericaRs;
import app.objetos.facade.ActividadFacade;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
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
    public Response obtenerActividades() {
        LOG.info("GET /objetos/actividad -> Obteniendo actividades");
        try {
            List<ActividadRs> actividades = actividadFacade.obtenerActividades();
            RespuestaGenericaRs respuesta = new RespuestaGenericaRs("2000", "Operación realizada correctamente", actividades);
            return Response.ok(respuesta).build();
        } catch (Exception e) {
            LOG.severe("Error al obtener actividades: " + e.getMessage());
            RespuestaGenericaRs respuestaError = new RespuestaGenericaRs("5000", "Error al obtener actividades", null);
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(respuestaError).build();
        }
    }
}
