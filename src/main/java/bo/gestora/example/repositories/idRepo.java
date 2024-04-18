
package bo.gestora.example.repositories;

import bo.gestora.common.data_base.annot.QueryRepository;
import bo.gestora.common.data_base.annot.SqlNativeQuery;
import bo.gestora.common.data_base.annot.SqlParam;
import bo.gestora.example.dto.Reporte;
import java.util.List;



@QueryRepository
public interface idRepo {
/*
    @SqlNativeQuery(sql = """
       SELECT * FROM public.reporte WHERE id = :ids;
        """, type = Reporte.class)
    public List<Reporte> buscarPorId(@SqlParam("ids") int id);   
*/ 
}
