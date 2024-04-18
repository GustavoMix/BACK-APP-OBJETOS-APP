


package app.objetos.facade;

import app.objetos.dto.ActividadRs;
import app.objetos.dto.UsuarioRs;
import app.objetos.repositores.UsuarioRepo;
import bo.gestora.common.data_base.DBConnector;
import bo.gestora.example.dto.RespuestaGenericaRs;
import javax.inject.Inject;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class UsuarioFacade {
    private static final Logger LOG = Logger.getLogger(UsuarioFacade.class.getSimpleName());

    @Inject
    DBConnector dBConnector;

public RespuestaGenericaRs registrarUsuario(UsuarioRs usuario) {
    RespuestaGenericaRs res = new RespuestaGenericaRs();
    UsuarioRepo usuarioRepo = dBConnector.getQueryRepository(UsuarioRepo.class);
        usuarioRepo.nuevoUsuario(
            usuario.getNombres(),
            usuario.getApellidos(),
            usuario.getEmail(),
            "", 
            Long.parseLong(usuario.getTelefono()),
            usuario.getDireccion(),
            usuario.getUsu_cre(), 
            usuario.getImagenPerfilBase64() 
        );    
    res.setMensaje("Usuario registrado exitosamente");
    return res;
}




public RespuestaGenericaRs actividad(ActividadRs actividad) {
    RespuestaGenericaRs res = new RespuestaGenericaRs();
    UsuarioRepo usuarioRepo = dBConnector.getQueryRepository(UsuarioRepo.class);
        usuarioRepo.obtenerActividades(
            actividad.getNombres(),
            actividad.getApellidos(),
            actividad.getEmail(),
            "", 
            Long.parseLong(actividad.getTelefono()),
            actividad.getDireccion(),
            actividad.getImagenPerfilBase64() 
        );    
    res.setMensaje("Usuario registrado exitosamente");
    return res;
}



}



