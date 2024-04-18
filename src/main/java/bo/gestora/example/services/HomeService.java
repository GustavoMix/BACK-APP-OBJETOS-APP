package bo.gestora.example.services;


import bo.gestora.lib.security.services.BaseService;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

import java.util.HashMap;
import java.util.logging.Logger;

/**
 *
 * @author Gerencia Nacional de sistemas - Gestora
 */
@Path("/")
public class HomeService extends BaseService {
    private static final Logger LOG = Logger.getLogger(HomeService.class.getSimpleName());
    
    @Path("info")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
            summary = "Información de Servicio",
            description = "Detalla la informacion de la aplicación")
    @APIResponses(value = {
        @APIResponse(
            links = {},
            description = "<strong>Información de Servicio</strong>",
            responseCode = "200",
            content = {
                @Content(
                    mediaType = "application/json",
                    example = """
                            {
                                "info": "Hola mundo desde Quarkus",
                                "fechaConsulta": "07/05/2022 12:16:10"
                            }
                            """
                )
            }
        ),
        @APIResponse(links = {},responseCode = "500", description = "Error interno no controlado")
    })
    public HashMap<String,Object> getInfo() {
        LOG.info("Obteniendo información de aplicación");
        HashMap<String,Object> serviceInfo = new HashMap<>();
        serviceInfo.put("info", "Hola mundo desde Quarkus");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        serviceInfo.put("fechaConsulta",dateFormat.format(new Date()));
        return serviceInfo;
    }
}