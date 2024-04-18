package bo.gestora.example.repositories;

import bo.gestora.common.data_base.annot.QueryRepository;
import bo.gestora.common.data_base.annot.SqlNativeQuery;
import bo.gestora.common.data_base.annot.SqlParam;
import bo.gestora.example.dto.InformacionUsuario;

/**
 *
 * @author Gerencia Nacional de sistemas - Gestora
 */
@QueryRepository
public interface UsuarioRepo {
    @SqlNativeQuery(sql = """
                    SELECT
                        (nombres ||' ' ||primer_apellido ||' '||segundo_apellido) AS "nombreCompleto", 
                        nro_documento AS "nroDocumento"
                    FROM usuario
                    WHERE nro_documento=:nroDocumento
                        """,
            type = InformacionUsuario.class)
    public InformacionUsuario consultarUsuario(@SqlParam("nroDocumento") String nroDocumento); 
}
