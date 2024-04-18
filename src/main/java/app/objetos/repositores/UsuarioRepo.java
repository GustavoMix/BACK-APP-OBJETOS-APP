package app.objetos.repositores;

import bo.gestora.common.data_base.annot.QueryRepository;
import bo.gestora.common.data_base.annot.SqlNativeQuery;
import bo.gestora.common.data_base.annot.SqlParam;
import java.util.List;

@QueryRepository
public interface UsuarioRepo {
    @SqlNativeQuery(sql = """
                      INSERT INTO public.usuario 
                      (nombres, apellidos, email, contraseña, telefono, direccion, imagen_perfil_base64, fecha_registro, api_transaccion, usu_cre, fec_cre)
                      VALUES (:nombres, :apellidos, :email, :contraseña, :telefono, :direccion, :imagen_perfil_base64, now(), 'CREAR',:usu_cre, now());
                      """)
    public void nuevoUsuario(
        @SqlParam("nombres") String nombres,
        @SqlParam("apellidos") String apellidos,
        @SqlParam("email") String email,
        @SqlParam("contraseña") String contraseña,
        @SqlParam("telefono") long telefono,
        @SqlParam("direccion") String direccion,
        @SqlParam("usu_cre") String usu_cre,
        @SqlParam("imagen_perfil_base64") String imagenPerfilBase64
    );
    
    
    
@SqlNativeQuery(sql = """
    SELECT idactividad, usuario_id, tipo, detalle, fecha, api_estado, api_transaccion, usu_cre, fec_cre, usu_mod, fec_mod
    FROM public.actividad
""")
public void obtenerActividades();

}
