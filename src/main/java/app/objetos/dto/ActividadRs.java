package app.objetos.dto;

import java.util.Date;
import lombok.Data;

@Data
public class ActividadRs {
    private int idActividad;
    private int idUsuario;
    private String tipo;
    private String detalle;
    private Date fecha;
    private String apiEstado;
    private String apiTransaccion;
    private String usuCre;
    private Date fecCre;
    private String usuMod;
    private Date fecMod;
}
