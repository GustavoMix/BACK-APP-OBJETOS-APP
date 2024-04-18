/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo.gestora.example.services;

import bo.gestora.common.data_base.annot.SqlNativeQuery;
import bo.gestora.common.data_base.annot.SqlParam;
import bo.gestora.example.dto.Usuarioo;
import bo.gestora.example.repositories.UsuariooRepo;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author gustavo
 */
@Path("/usuario")
public class UsuariooService {
   /* @Inject
    UsuariooRepo usuarioRepo;

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response crearUsuario(Usuarioo usuarioDto) {
        int idUsuario = usuarioDto.getIdUsuario();
        String nombres = usuarioDto.getNombres();
        String apellidos = usuarioDto.getApellidos();
        String email = usuarioDto.getEmail();
        String telefono = usuarioDto.getTelefono();
        String contraseña = usuarioDto.getContraseña();
        String direccion = usuarioDto.getDireccion();

        usuarioRepo.crearUsuario(idUsuario, nombres, apellidos, email, telefono, contraseña, direccion);

        return Response.ok().build();
    }  */
}


