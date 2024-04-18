package bo.gestora.example.services;



import bo.gestora.example.facade.UsuariosFacade;
import bo.gestora.example.dto.InformacionUsuario;
import bo.gestora.lib.security.data.ProtectedAccess;
import bo.gestora.lib.security.services.BaseService;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Gerencia Nacional de sistemas - Gestora
 */
@Path("/usuarios")
public class UsuarioService extends BaseService {

   @Inject
    UsuariosFacade usuariosFacade;

    @GET
    @Path("/info")
    @Produces(MediaType.APPLICATION_JSON)
    @ProtectedAccess(authorizedRoles = {"ROL_PRUEBA"})
    public InformacionUsuario getInfo(
            @Valid
            @NotNull @NotBlank
            @QueryParam("nroDocumento") String nroDocumento) {
        //UserInfo userInfo = getUserInfo();
        return usuariosFacade.getInfo(nroDocumento);
    }    
}
