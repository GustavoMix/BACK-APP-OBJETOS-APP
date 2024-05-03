package app.objetos.dto;

import java.util.Date;
import lombok.Data;


@Data
public class ObjetosExtraviadosRs {
    private int idObjetoExtraviado;
    private int usuarioId;
    private String nombre;
    private String descripcion;
    private Date fechaExtravio;
    private String ubicacion;
    private String fotoBase64;
    private String estado;
    private Date fechaCreacion;
    private String apiEstado;
    private String apiTransaccion;
    private String usuCre;
    private Date fecCre;
    private String usuMod;
    private Date fecMod;
}
