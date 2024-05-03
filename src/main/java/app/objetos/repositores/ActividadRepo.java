package app.objetos.repositores;

import app.objetos.dto.ActividadRs;
import bo.gestora.common.data_base.annot.QueryRepository;
import bo.gestora.common.data_base.annot.SqlNativeQuery;

import java.util.List;

@QueryRepository
public interface ActividadRepo {

    @SqlNativeQuery(sql = """
    SELECT idactividad AS "idActividad", 
               usuario_id AS "idUsuario", 
               tipo, detalle, fecha, 
               api_estado AS "apiEstado", 
               api_transaccion AS "apiTransaccion", 
               usu_cre AS "usuCre", 
               fec_cre AS "fecCre", 
               usu_mod AS "usuMod", 
               fec_mod AS "fecMod"
    FROM public.actividad
    """, type = ActividadRs.class)
    List<ActividadRs> obtenerActividades();
}




