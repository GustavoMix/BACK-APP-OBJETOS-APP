package app.objetos.dto;

import java.util.Date;
import lombok.Data;

@Data
public class EstadisticasRs {
    private int idEstadistica;
    private String tipo;
    private Integer valor;
    private Date fechaCreacion;
    private String apiEstado;
    private String apiTransaccion;
    private String usuCre;
    private Date fecCre;
    private String usuMod;
    private Date fecMod;
}
