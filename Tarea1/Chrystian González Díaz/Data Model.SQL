CREATE TABLE MD Comentarios ( 
	id_coment INTEGER NOT NULL,
	id_usuario INTEGER NOT NULL,
	descripcion VARCHAR(50),
	id_tesis INTEGER NOT NULL
)
;

CREATE TABLE MD Direccion ( 
	pais VARCHAR(20) NOT NULL,
	estado VARCHAR(20) NOT NULL,
	id_usuario INTEGER NOT NULL
)
;

CREATE TABLE MD Estado ( 
	id_estado INTEGER NOT NULL,
	nom_estado VARCHAR(20) NOT NULL
)
;

CREATE TABLE MD Estado ( 
	id_estado INTEGER NOT NULL,
	nom_estado VARCHAR(20) NOT NULL
)
;

CREATE TABLE MD Pais ( 
	id_pais INTEGER NOT NULL,
	nom_pais VARCHAR(20) NOT NULL,
	id_estado INTEGER NOT NULL
)
;

CREATE TABLE MD Tesis ( 
	id_tesis INTEGER NOT NULL,
	autor VARCHAR(50),
	titulo VARCHAR(50),
	id_usuario INTEGER NOT NULL
)
;

CREATE TABLE MD Usuario ( 
	id_usuario INTEGER NOT NULL,
	nombre VARCHAR(20) NOT NULL,
	apellidos VARCHAR(40) NOT NULL,
	fech_nac DATE NOT NULL,
	contraseña VARCHAR(15) NOT NULL,
	correo VARCHAR(20) NOT NULL,
	facebook VARCHAR(20),
	id_pais INTEGER NOT NULL
)
;


ALTER TABLE MD Comentarios ADD CONSTRAINT PK_MD Comentarios 
	PRIMARY KEY (id_coment)
;


ALTER TABLE MD Estado ADD CONSTRAINT PK_MD Estado 
	PRIMARY KEY (id_estado)
;


ALTER TABLE MD Estado ADD CONSTRAINT PK_MD Estado 
	PRIMARY KEY (id_estado)
;


ALTER TABLE MD Pais ADD CONSTRAINT PK_Pais 
	PRIMARY KEY (id_pais)
;


ALTER TABLE MD Tesis ADD CONSTRAINT PK_MD tesis 
	PRIMARY KEY (id_tesis)
;


ALTER TABLE MD Usuario ADD CONSTRAINT PK_MD Usuario 
	PRIMARY KEY (id_usuario)
;



ALTER TABLE MD Comentarios
	ADD CONSTRAINT UQ_MD Comentarios_id_tesis UNIQUE (descripcion)
;
ALTER TABLE MD Comentarios
	ADD CONSTRAINT UQ_MD Comentarios_id_tesis UNIQUE (id_tesis)
;
ALTER TABLE MD Comentarios
	ADD CONSTRAINT UQ_MD Comentarios_id_usuario UNIQUE (id_usuario)
;
ALTER TABLE MD Direccion
	ADD CONSTRAINT UQ_MD Direccion_id_usuario UNIQUE (id_usuario)
;
ALTER TABLE MD Estado
	ADD CONSTRAINT UQ_MD Estado_id_estado UNIQUE (id_estado)
;
ALTER TABLE MD Estado
	ADD CONSTRAINT UQ_MD Estado_nom_estado UNIQUE (nom_estado)
;
ALTER TABLE MD Estado
	ADD CONSTRAINT UQ_MD Estado_id_estado UNIQUE (id_estado)
;
ALTER TABLE MD Estado
	ADD CONSTRAINT UQ_MD Estado_nom_estado UNIQUE (nom_estado)
;
ALTER TABLE MD Pais
	ADD CONSTRAINT UQ_MD Pais_id_estado UNIQUE (id_estado)
;
ALTER TABLE MD Pais
	ADD CONSTRAINT UQ_Pais_id_pais UNIQUE (id_pais)
;
ALTER TABLE MD Pais
	ADD CONSTRAINT UQ_Pais_nom_pais UNIQUE (nom_pais)
;
ALTER TABLE MD Tesis
	ADD CONSTRAINT UQ_MD Tesis_id_tesis UNIQUE (id_tesis)
;
ALTER TABLE MD Tesis
	ADD CONSTRAINT UQ_MD Tesis_id_usuario UNIQUE (id_usuario)
;
ALTER TABLE MD Usuario
	ADD CONSTRAINT UQ_MD Usuario_id_pais UNIQUE (id_pais)
;
ALTER TABLE MD Usuario
	ADD CONSTRAINT UQ_MD Usuario_id_usuario UNIQUE (id_usuario)
;

ALTER TABLE MD Direccion ADD CONSTRAINT FK_MD Direccion_MD Usuario 
	FOREIGN KEY (id_usuario) REFERENCES MD Usuario (id_usuario)
;
