package app.objetos.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Getter
@Setter
@ToString
public class RespuestaGenericaRs {

    @NotBlank
    @Schema(title = "El código de respuesta según catalogo", required = true, pattern = "",
            description = """
                        <caption>Codigos de respuesta</caption>
                        <table border="1">
                            <tr>
                                <th scope="col">Código</th>
                                <th scope="col">Descripción</th>
                            </tr>
                            <tr>
                                <td>2000</td>
                                <td>La operación fué realizada correctamente</td>
                            </tr>
                        </table>
                       """)
    private String codigoRespuesta;
    private String mensaje;
    private Object data;

    public RespuestaGenericaRs() {
    }

    public RespuestaGenericaRs(String codigo, String message, Object obj) {
        codigoRespuesta = codigo;
        mensaje = message;
        data = obj;
    }
}
