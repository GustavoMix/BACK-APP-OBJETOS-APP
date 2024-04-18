package bo.gestora.example.error_handler;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
/**
 *
 * @author Gerencia Nacional de sistemas - Gestora
 */

@Provider

public class InvalidFormatExceptionHandler implements ExceptionMapper<InvalidFormatException>{
    @Override
    public Response toResponse(InvalidFormatException e) {
        return Response.status(Response.Status.BAD_REQUEST)
                       .entity("Custom MESSAGE: "+e.getMessage())
                       .type("text/plain")
                       .build();
    }
}
