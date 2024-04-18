
    package bo.gestora.example.facade;

    import bo.gestora.common.data_base.DBConnector;
import bo.gestora.common.data_base.error.NoFountRepoException;
    import bo.gestora.example.AppConfig;
    import bo.gestora.example.dto.Reporte;
    import java.util.List;
import java.util.logging.Level;
    import java.util.logging.Logger;
    import javax.enterprise.context.RequestScoped;
    import javax.inject.Inject;
import bo.gestora.example.repositories.idRepo;

    @RequestScoped
    public class ReporteFacade {
          private static final Logger LOG = Logger.getLogger(CuaFacade.class.getSimpleName());
/*
        @Inject
        DBConnector dBConnector;

        @Inject
        AppConfig appConfig;

        //BUSCAR POR ID SI ES PERDIDO O ENCONTRADO
        public List<Reporte> buscarPorId(int id) {
            LOG.info("Buscando facade con ID " + id);
            try {
                RepoId repoId = dBConnector.getQueryRepository(RepoId.class);
                List<Reporte> resultado = repoId.buscarPorId(id);
                return resultado;
            } catch (NoFountRepoException e) {
                LOG.log(Level.WARNING, "Error al obtener el repositorio: " + e.getMessage());
                return null;
            }
        }
*/
    }
