
package app.objetos.dto;

import java.util.Date;
import lombok.Data;


@Data
public class ActividadRs {
    private int idUsuario;
    private String nombres;
    private String apellidos;
    private String email;
    private String contraseña;
    private String telefono;
    private String direccion;
    private String imagenPerfilBase64;
    private Date fechaRegistro;
    private Date fechaModificacion;
    private String apiEstado;
    private String apiTransaccion;
    private String usuCre;
    private Date fecCre;
    private String usuMod;
    private Date fecMod;
}
