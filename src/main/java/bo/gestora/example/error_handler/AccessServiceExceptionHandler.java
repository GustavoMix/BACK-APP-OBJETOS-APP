package bo.gestora.example.error_handler;


import javax.annotation.Priority;
import javax.ws.rs.Priorities;

import javax.ws.rs.ext.Provider;

@Provider
@Priority(Priorities.AUTHENTICATION)
public class AccessServiceExceptionHandler {
    
  /*  @Override
    public Response toResponse(AccessServiceException e) {
        RespuestaGenericaRs respuestaGenericaRs = new RespuestaGenericaRs();
        respuestaGenericaRs.setMensaje(e.getMessage());
        return Response.status(Response.Status.FORBIDDEN)
                       .entity(respuestaGenericaRs)
                       .type("application/json")
                       .build();
    }*/
}