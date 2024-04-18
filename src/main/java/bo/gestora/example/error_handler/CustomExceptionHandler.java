package bo.gestora.example.error_handler;

import bo.gestora.example.error.CustomException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
/**
 *
 * @author Gerencia Nacional de sistemas - Gestora
 */

@Provider
public class CustomExceptionHandler implements ExceptionMapper<CustomException>{
    @Override
    public Response toResponse(CustomException e) {
        return Response.status(Response.Status.BAD_REQUEST)
                       .entity("error")
                       .type("text/plain")
                       .build();
    }
}
