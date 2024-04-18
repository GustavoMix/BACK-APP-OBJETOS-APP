package app.objetos.dto;

import lombok.Data;


@Data
public class UsuarioRs {
    private int idUsuario;
    private String nombres;
    private String apellidos;
    private String email;
    private String telefono;
    private String direccion;
    private String imagenPerfilBase64;
    private String usu_cre;
    private String fechaRegistro;
}
