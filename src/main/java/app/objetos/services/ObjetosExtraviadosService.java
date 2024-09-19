/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.objetos.services;

import app.objetos.dto.ObjetosEncontradosRs;
import app.objetos.dto.ObjetosExtraviadosRs;
import app.objetos.dto.RespuestaGenericaRs;
import app.objetos.facade.ObjetosEncontradosFacade;
import app.objetos.facade.ObjetosExtraviadosFacade;
import java.util.List;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/objetos")
public class ObjetosExtraviadosService {
    private static final Logger LOG = Logger.getLogger(ObjetosEncontradosService.class.getName());

    @Inject
    ObjetosExtraviadosFacade objetosExtraviadosFacade;

    @GET
    @Path("/objetosExtraviados")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    //@ProtectedAccess
    //@SecurityRequirement(name = "apiKey")
    public RespuestaGenericaRs obtenerObjetosExtraviados() {
        LOG.info("GET /objetos/objetosEncontrados -> ");
        try {
            List<ObjetosExtraviadosRs> objetosExtraviados = objetosExtraviadosFacade.obtenerObjetosExtraviados();
            return new RespuestaGenericaRs("2000", "La operación fue realizada correctamente", objetosExtraviados);
        } catch (Exception e) {
            LOG.severe("Error al obtener objetos encontrados: " + e.getMessage());
            return new RespuestaGenericaRs("5000", "Error interno del servidor", null);
        }
    }
}
