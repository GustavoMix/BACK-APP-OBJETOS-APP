package app.objetos.repositores;

import app.objetos.dto.ActividadRs;
import app.objetos.dto.EstadisticasRs;
import bo.gestora.common.data_base.annot.QueryRepository;
import bo.gestora.common.data_base.annot.SqlNativeQuery;
import java.util.List;


@QueryRepository
public interface EstadisticasRepo {
    @SqlNativeQuery(sql = """
SELECT 
        idestadistica AS "idEstadistica", 
        tipo, 
        valor, 
        fecha_creacion AS "fechaCreacion", 
        api_estado AS "apiEstado", 
        api_transaccion AS "apiTransaccion", 
        usu_cre AS "usuCre", 
        fec_cre AS "fecCre", 
        usu_mod AS "usuMod", 
        fec_mod AS "fecMod" 
    FROM public.estadisticas;
    """, type = EstadisticasRs.class)
    List<EstadisticasRs> obtenerEstadisticas();
}




