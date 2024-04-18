-- Creación de tablas
CREATE TABLE usuuuuuario (
    id BIGSERIAL PRIMARY KEY,
    nro_documento VARCHAR(20),
    nombres VARCHAR(150) NOT NULL,
    primer_apellido VARCHAR(150),
    segundo_apellido VARCHAR(150),
    fecha_nacimiento TIMESTAMP default CURRENT_TIMESTAMP,
    correo VARCHAR(150),
    nro_celular VARCHAR(20)
);