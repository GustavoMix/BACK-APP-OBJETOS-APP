package bo.gestora.example;

import bo.gestora.auth.validator.KeyCloakValidator;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.Startup;
import io.quarkus.runtime.StartupEvent;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

/**
 *
 * @author Gerencia Nacional de sistemas - Gestora
 */
@Startup 
@ApplicationScoped
public class StartApp {
    private static final Logger LOG = Logger.getLogger(StartApp.class.getSimpleName());
    

    
    @Inject
    AppConfig appConfig;
    
  
    
     @Inject
    KeyCloakValidator keyCloakValidator;

    @SuppressWarnings({"Convert2Lambda", "LoggerStringConcat"})
    void onStart(@Observes StartupEvent ev) {
        LOG.info("La Aplicacion esta Iniciando...");
        LOG.info("*********************************************");
        LOG.info("***** GESTORA PUBLICA DE LA SEGURIDAD DE LARGO PLAZO ***********");
        LOG.info("************  APLICACION INICIADA ***********");
        LOG.info("************  URL: http://localhost:"+appConfig.getHttpPortServer()+" ***********");
        LOG.info("*********************************************");
        keyCloakValidator.validateAuth();
        LOG.info("*********************************************");
        // aAFilter.setAuthValidator(clientAuth.getAuthValidator());
    }

    void onStop(@Observes ShutdownEvent ev) {               
        LOG.info("La aplicacion se esta deteniendo...");
    }
}