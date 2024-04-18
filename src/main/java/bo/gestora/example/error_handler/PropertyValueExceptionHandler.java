package bo.gestora.example.error_handler;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import org.hibernate.PropertyValueException;
/**
 *
 * @author Gerencia Nacional de sistemas - Gestora
 */

@Provider
public class PropertyValueExceptionHandler implements ExceptionMapper<PropertyValueException>{
    @Override
    public Response toResponse(PropertyValueException e) {
        String message = null;
        System.out.println("CLASE: "+e.getCause().getClass().getName());
        PropertyValueException pve = PropertyValueException.class.cast(e.getCause());
        message = pve.getPropertyName()+" mensaje =  "+pve.getMessage();
        
        return Response.status(Response.Status.BAD_REQUEST)
//                       .entity("PersistenceException de entrada invalida: "+e.getCause().getMessage())
                       .entity(message)
                       .type("text/plain")
                       .build();
    }
}
