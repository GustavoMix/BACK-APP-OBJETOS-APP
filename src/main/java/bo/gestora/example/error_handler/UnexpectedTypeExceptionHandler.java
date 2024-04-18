package bo.gestora.example.error_handler;

import bo.gestora.example.dto.RespuestaGenericaRs;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.validation.UnexpectedTypeException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


@Provider
public class UnexpectedTypeExceptionHandler implements ExceptionMapper<UnexpectedTypeException>{
    private static final Logger LOG = Logger.getLogger(UnexpectedTypeExceptionHandler.class.getSimpleName());
    
    @Override
    public Response toResponse(UnexpectedTypeException e) {
        LOG.log(Level.SEVERE, "Tipo de valor no aceptado", e);
        RespuestaGenericaRs respuestaGenericaRs = new RespuestaGenericaRs();
        respuestaGenericaRs.setMensaje("Uno los valores no concide con los definidos en el Pojo");
        return Response.status(Response.Status.OK)
                       .entity(respuestaGenericaRs)
                       .type("application/json")
                       .build();
    }
}