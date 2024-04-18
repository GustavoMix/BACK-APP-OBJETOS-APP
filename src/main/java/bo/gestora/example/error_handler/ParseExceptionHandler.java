package bo.gestora.example.error_handler;

import bo.gestora.example.dto.RespuestaGenericaRs;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ParseExceptionHandler implements ExceptionMapper<ParseException>{
    private static final Logger LOG = Logger.getLogger(ParseExceptionHandler.class.getSimpleName());
    
    @Override
    public Response toResponse(ParseException e) {
        LOG.log(Level.SEVERE, "Error en el parseo JSON", e);
        
        RespuestaGenericaRs respuestaGenericaRs = new RespuestaGenericaRs();
        respuestaGenericaRs.setMensaje("No se puede procesar el documento porque no es de tipo texto");
        return Response.status(Response.Status.OK)
                       .entity(respuestaGenericaRs)
                       .type("application/json")
                       .build();
    }
}
