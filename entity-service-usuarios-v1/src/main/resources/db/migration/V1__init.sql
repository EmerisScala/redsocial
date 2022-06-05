CREATE TABLE usuarios (
  numero VARCHAR(255) PRIMARY KEY,
  nombre VARCHAR(255) NOT NULL,
  apellido_paterno VARCHAR(255) NOT NULL,
  apellido_materno VARCHAR(255) NOT NULL,
  correo VARCHAR(255) NOT NULL,
  contrasenia VARCHAR(255) NOT NULL
);

CREATE TABLE certificados (
  id VARCHAR(255) PRIMARY KEY,
  numero_usuario VARCHAR(255) NOT NULL,
  nombre VARCHAR(255) NOT NULL,
  empresa_emisora VARCHAR(255) NOT NULL,
  fecha_expedicion timestamp without time zone NOT NULL DEFAULT (current_timestamp AT TIME ZONE 'UTC'),
  url_credencial VARCHAR(255) NOT NULL,
  CONSTRAINT fk_numero_usuario FOREIGN KEY (numero_usuario) REFERENCES usuarios (numero)
);

CREATE TABLE experiencias (
  id VARCHAR(255) PRIMARY KEY,
  numero_usuario VARCHAR(255) NOT NULL,
  empresa VARCHAR(255) NOT NULL,
  puesto VARCHAR(255) NOT NULL,
  fecha_inicio timestamp without time zone NOT NULL DEFAULT (current_timestamp AT TIME ZONE 'UTC'),
  fecha_termino timestamp without time zone NOT NULL DEFAULT (current_timestamp AT TIME ZONE 'UTC'),
  CONSTRAINT fk_numero_usuario2 FOREIGN KEY (numero_usuario) REFERENCES usuarios (numero)
);


