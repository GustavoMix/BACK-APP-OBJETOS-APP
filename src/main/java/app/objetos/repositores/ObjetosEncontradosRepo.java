package app.objetos.repositores;

import app.objetos.dto.EstadisticasRs;
import app.objetos.dto.ObjetosEncontradosRs;
import bo.gestora.common.data_base.annot.QueryRepository;
import bo.gestora.common.data_base.annot.SqlNativeQuery;
import java.util.List;


@QueryRepository
public interface ObjetosEncontradosRepo {
       @SqlNativeQuery(sql = """
SELECT 
    idobjetoencontrado AS "idObjetoEncontrado", 
    usuario_id AS "usuarioId", 
    nombre, 
    descripcion, 
    fecha_encontrado AS "fechaEncontrado", 
    ubicacion, 
    foto_base64 AS "fotoBase64", 
    estado, 
    fecha_creacion AS "fechaCreacion", 
    api_estado AS "apiEstado", 
    api_transaccion AS "apiTransaccion", 
    usu_cre AS "usuCre", 
    fec_cre AS "fecCre", 
    usu_mod AS "usuMod", 
    fec_mod AS "fecMod" 
FROM public.objetos_encontrados;
    """, type = ObjetosEncontradosRs.class)
    List<ObjetosEncontradosRs> obtenerObjetosEncontrados();
}


