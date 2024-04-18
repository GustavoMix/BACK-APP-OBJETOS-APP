
package bo.gestora.example.services;
import bo.gestora.example.dto.CuaPersonas;
import bo.gestora.example.facade.CuaFacade;
import bo.gestora.lib.security.data.ProtectedAccess;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/cua")
public class CuaService {
    private static final Logger LOG = Logger.getLogger(CuaService.class.getSimpleName());
    
    @Inject
    CuaFacade cuaFacade;
    
    @GET
    @Path("/cuapersona")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMostrarrRegistro(@QueryParam("ci") String ci, @QueryParam("co") String co) {
        LOG.info("Ingresa al método para mostrar disponibles");
        List<CuaPersonas> resultado = cuaFacade.getEditar(ci, co);
        System.out.println("valores: " + resultado);
        Map<String,Object> respuesta = new HashMap<>();
        respuesta.put("Respuesta", resultado);
        return Response.ok(respuesta).build();
    }   
}