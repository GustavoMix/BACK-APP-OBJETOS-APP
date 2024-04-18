package bo.gestora.example.facade;

import bo.gestora.common.data_base.DBConnector;
import bo.gestora.common.data_base.error.NoFountRepoException;
import bo.gestora.example.repositories.UsuarioRepo;
import bo.gestora.example.dto.InformacionUsuario;
import bo.gestora.example.services.HomeService;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author Gerencia Nacional de sistemas - Gestora
 */
@RequestScoped
public class UsuariosFacade { 
    private static final Logger LOG = Logger.getLogger(UsuariosFacade.class.getSimpleName());
    
   @Inject
    DBConnector dBConnector;

    public InformacionUsuario getInfo(String nroDocumento) throws NoFountRepoException{
        LOG.log(Level.INFO, "Obteniendo datos de usuario:{0}", nroDocumento);
        UsuarioRepo usuarioRepo = dBConnector.getQueryRepository(UsuarioRepo.class);
        return usuarioRepo.consultarUsuario(nroDocumento);
    }   
}