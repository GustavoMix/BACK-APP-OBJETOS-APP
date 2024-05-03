/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.objetos.services;

import app.objetos.dto.EstadisticasRs;
import app.objetos.dto.ObjetosEncontradosRs;
import app.objetos.facade.EstadisticasFacade;
import app.objetos.facade.ObjetosEncontradosFacade;
import java.util.List;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author grover.tintaya
 */
@Path("/objetos")
public class ObjetosEncontradosService {
    private static final Logger LOG = Logger.getLogger(ObjetosEncontradosService.class.getSimpleName());

    @Inject
    ObjetosEncontradosFacade objetosEncontradosFacade;
    @GET
    @Path("/objetosEncontrados")
    @Produces(MediaType.APPLICATION_JSON)
    //@ProtectedAccess
    //@SecurityRequirement(name = "apiKey")
    public List<ObjetosEncontradosRs> obtenerObjetosEncontrados() {
        LOG.info("GET /ObjetosEncontrados/ -> ");
        return objetosEncontradosFacade.obtenerObjetosEncontrados();
    }
}
