package bo.gestora.example;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.enums.SecuritySchemeType;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.security.SecurityScheme;
import org.eclipse.microprofile.openapi.annotations.security.SecuritySchemes;
import org.eclipse.microprofile.openapi.annotations.servers.Server;
import org.eclipse.microprofile.openapi.annotations.servers.Servers;

@OpenAPIDefinition(
    tags = {
        
    },
    info = @Info(
        title="Proyecto Ejemplo",
        version = "1.1.0",
        contact = @Contact(
            name = "Grover Gustavo Tintaya Apaza",
            url = "https://www.gestora.bo/Comunicacion/Contacto",
            email = "nemecio.coarite@gestora.bo"))
)
@Servers( value = {
    @Server(url = "https://pruebas.gestora.bo/servicios/proyect_example/" ),
    @Server(url = "http://localhost:8888/" )
})
@SecuritySchemes(value = {
    @SecurityScheme(securitySchemeName = "apiKey", 
                    type = SecuritySchemeType.HTTP,
                    scheme = "Bearer")}
)
@ApplicationPath("/api")
public class JaxrsConfig extends Application {}