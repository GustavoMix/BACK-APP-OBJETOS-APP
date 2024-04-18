package bo.gestora.example;

import javax.enterprise.context.ApplicationScoped;
import lombok.Getter;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
@Getter
public class AppConfig{
    
    @ConfigProperty(name = "security.auth.public_key")
    String rutaClavePublica;
    
    @ConfigProperty(name = "quarkus.http.port")
    int httpPortServer;
}