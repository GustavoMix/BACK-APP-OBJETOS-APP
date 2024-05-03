package app.objetos.services;

import app.objetos.dto.ActividadRs;
import app.objetos.dto.UsuarioRs;
import app.objetos.dto.RespuestaGenericaRs; // Importa la clase RespuestaGenericaRs
import app.objetos.facade.UsuarioFacade;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.core.Response;

@Path("/objetos")
public class UsuarioService {
    private static final Logger LOG = Logger.getLogger(UsuarioService.class.getSimpleName());

    @Inject
    UsuarioFacade usuarioFacade;

    @POST
    @Path("/usuario")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response registrar(@Valid UsuarioRs usuarioRs) {
        LOG.info("POST /usuarios/ -> ");
        try {
            usuarioFacade.registrarUsuario(usuarioRs);
            RespuestaGenericaRs respuesta = new RespuestaGenericaRs("200", "La operación fue realizada correctamente","ok" );
            return Response.ok(respuesta).build();
        } catch (Exception e) {
            RespuestaGenericaRs respuesta = new RespuestaGenericaRs("500", "Error al intentar registrar el usuario", null);
            LOG.severe(respuesta.toString());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                           .entity(respuesta)
                           .build();
        }
    }
    
 
    
    
}
