/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.objetos.repositores;

import app.objetos.dto.ObjetosEncontradosRs;
import app.objetos.dto.ObjetosExtraviadosRs;
import bo.gestora.common.data_base.annot.QueryRepository;
import bo.gestora.common.data_base.annot.SqlNativeQuery;
import java.util.List;

/**
 *
 * @author grover.tintaya
 */
@QueryRepository
public interface ObjetosExtraviadosRepo {
       @SqlNativeQuery(sql = """
SELECT 
    idobjetoextraviado AS "idObjetoExtraviado", 
    usuario_id AS "usuarioId", 
    nombre, 
    descripcion, 
    fecha_extravio AS "fechaExtravio", 
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
FROM public.objetos_extraviados;
    """, type = ObjetosExtraviadosRs.class)
    List<ObjetosExtraviadosRs> obtenerObjetosExtraviados();
}