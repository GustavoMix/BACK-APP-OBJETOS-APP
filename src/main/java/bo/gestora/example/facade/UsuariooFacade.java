/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo.gestora.example.facade;

import bo.gestora.common.data_base.DBConnector;
import bo.gestora.example.AppConfig;
import bo.gestora.example.dto.CuaPersonas;
import bo.gestora.example.dto.Usuarioo;
import bo.gestora.example.repositories.CuaRepo;
import bo.gestora.example.repositories.UsuariooRepo;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

/**
 *
 * @author gustavo
 */
@RequestScoped
public class UsuariooFacade {
   /* private static final Logger LOG = Logger.getLogger(UsuariooFacade.class.getSimpleName());

    @Inject
    DBConnector dbConnector;

    @Inject
    AppConfig appConfig;
    
    @Transactional
    public void crearUsuario(Usuarioo usuario) {
        try {
            UsuariooRepo usuariooRepo = dbConnector.getQueryRepository(UsuariooRepo.class);
            usuariooRepo.crearUsuario(usuario.getIdUsuario(), usuario.getNombres(),
                    usuario.getApellidos(), usuario.getEmail(), usuario.getTelefono(),
                    usuario.getContraseña(), usuario.getDireccion());
        } catch (Exception e) {
            LOG.log(Level.WARNING, "ERROR DE BD " + e);
        }
    }
  */
}
