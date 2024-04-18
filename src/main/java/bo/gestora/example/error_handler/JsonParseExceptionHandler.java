package bo.gestora.example.error_handler;

import bo.gestora.example.dto.RespuestaGenericaRs;
import com.fasterxml.jackson.core.JsonParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class JsonParseExceptionHandler implements ExceptionMapper<JsonParseException>{
    private static final Logger LOG = Logger.getLogger(JsonParseExceptionHandler.class.getSimpleName());
    
    @Override
    public Response toResponse(JsonParseException e) {
        LOG.log(Level.SEVERE, "Error con el documento", e);
        RespuestaGenericaRs respuestaGenericaRs = new RespuestaGenericaRs();
        respuestaGenericaRs.setMensaje("El Contenido no es un formato JSON");
        return Response.status(Response.Status.OK)
                       .entity(respuestaGenericaRs)
                       .type("application/json")
                       .build();
    }
}
