
package bo.gestora.example.repositories;

import bo.gestora.common.data_base.annot.QueryRepository;
import bo.gestora.common.data_base.annot.SqlNativeQuery;
import bo.gestora.common.data_base.annot.SqlParam;
import bo.gestora.example.dto.CuaPersonas;
import java.util.List;
import org.jboss.logging.annotations.Param;
import org.jboss.resteasy.annotations.Query;

@QueryRepository
public interface CuaRepo {
    
     //INGRESA DOS DATOS CI Y COMPLEMENTO Y DEVUELVE CUA         
        @SqlNativeQuery(sql = """
        SELECT cen_personas.f_obtienecua(:ci, :co);
        """, type = CuaPersonas.class)
        public List<CuaPersonas> getEditarPorId(
            @SqlParam("ci") String ci,
            @SqlParam("co") String co
    );        
}
