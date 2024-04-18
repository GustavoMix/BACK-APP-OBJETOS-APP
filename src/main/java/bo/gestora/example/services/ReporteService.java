
package bo.gestora.example.services;

import bo.gestora.example.dto.Reporte;

import bo.gestora.example.facade.ReporteFacade;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/repo")
public class ReporteService {
      private static final Logger LOG = Logger.getLogger(CuaService.class.getSimpleName());
     /*
    @Inject
    ReporteFacade reporteFacade;
    
@GET
@Path("/ids")
@Produces(MediaType.APPLICATION_JSON)
public Response buscarPorId(@QueryParam("idusuario") int id) {
   
    LOG.info("Buscando services con ID " + id);
    List<Reporte> resultado = reporteFacade.buscarPorId(id);
    Map<String,Object> respuesta = new HashMap<>();
    respuesta.put("Respuesta", resultado);
    return Response.ok(respuesta).build();

}
*/
}
