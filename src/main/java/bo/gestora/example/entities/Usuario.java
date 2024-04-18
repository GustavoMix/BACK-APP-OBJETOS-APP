package bo.gestora.example.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

import lombok.ToString;

/**
 *
 * @author Gerencia Nacional de sistemas - Gestora
 */
@Table(name = "usuario")
@Entity
@Getter
@Setter
@ToString
public class Usuario implements Serializable{
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_gen")
    @SequenceGenerator(name = "usuario_gen", sequenceName = "usuario_id_seq", allocationSize = 1)
    protected long id;

    @Column(name = "nro_documento", nullable = false)
    protected String nroDocumento;

    @Column(name = "nombres", nullable = false)
    protected String nombres;
    
    @Column(name = "primer_apellido", nullable = false ,length = 200)
    protected String primerApellido;
    
    @Column(name = "segundo_apellido", nullable = false ,length = 200)
    protected String segundoApellido;
    
    @Column(name = "fecha_nacimiento", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    protected Date fechaNacimiento;
    
    @Column(name = "correo", nullable = false,length = 150)
    protected String correo;
    
    @Column(name = "nro_celular", nullable = false)
    protected String nroCelular;

    @PrePersist
    public void posLoad() {
        
    }
}