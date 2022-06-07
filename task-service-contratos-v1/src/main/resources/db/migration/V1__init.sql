CREATE TABLE vacantes (
  id VARCHAR(255) PRIMARY KEY,
  id_empresa VARCHAR(255) NOT NULL,
  descripcion VARCHAR(255) NOT NULL,
  posicion VARCHAR(255) NOT NULL,
  puesto VARCHAR(255) NOT NULL
);

CREATE TABLE solicitudes (
  id VARCHAR(255) PRIMARY KEY,
  id_vacante VARCHAR(255) NOT NULL,
  numero_usuario VARCHAR(255) NOT NULL,
  CONSTRAINT fk_id_vacante FOREIGN KEY (id_vacante) REFERENCES vacantes(id)
);

CREATE TABLE contratos (
  id VARCHAR(255) PRIMARY KEY,
  id_solicitud VARCHAR(255) NOT NULL,
  descripcion VARCHAR(255) NOT NULL,
  beneficios VARCHAR(255) NOT NULL,
  monto_salario DOUBLE PRECISION,
  CONSTRAINT fk_id_solicitud FOREIGN KEY (id_solicitud) REFERENCES solicitudes(id)
);

CREATE TABLE confirmaciones (
  id VARCHAR(255) PRIMARY KEY,
  id_contrato VARCHAR(255) NOT NULL,
  estatus BOOLEAN NOT NULL,
  motivo VARCHAR(255),
  CONSTRAINT fk_id_contrato FOREIGN KEY (id_contrato) REFERENCES contratos(id)
);


