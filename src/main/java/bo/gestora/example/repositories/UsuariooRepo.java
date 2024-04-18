/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bo.gestora.example.repositories;

import bo.gestora.common.data_base.annot.QueryRepository;
import bo.gestora.common.data_base.annot.SqlNativeQuery;
import bo.gestora.common.data_base.annot.SqlParam;
import javax.transaction.Transactional;

/**
 *
 * @author gustavo
 */
@QueryRepository
public interface UsuariooRepo {
 /*      @SqlNativeQuery(sql = """
        INSERT INTO Usuario (idUsuario, nombres, apellidos, email, telefono, contraseña, direccion) VALUES (:idUsuario, :nombres, :apellidos, :email, :telefono, :contraseña, :direccion)
        """)
    @Transactional
    void crearUsuario(
        @SqlParam("idUsuario") int idUsuario,
        @SqlParam("nombres") String nombres,
        @SqlParam("apellidos") String apellidos,
        @SqlParam("email") String email,
        @SqlParam("telefono") String telefono,
        @SqlParam("contraseña") String contraseña,
        @SqlParam("direccion") String direccion
    );
 */
}
