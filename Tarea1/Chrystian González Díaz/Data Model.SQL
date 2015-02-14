CREATE TABLE MD_Comentarios ( 
	id_coment INTEGER NOT NULL,
	id_usuario INTEGER NOT NULL,
	descripcion VARCHAR(50),
	id_tesis INTEGER NOT NULL
)
;

CREATE TABLE MD_Estado ( 
	id_estado INTEGER NOT NULL,
	nom_estado VARCHAR(20) NOT NULL
)
;

CREATE TABLE MD_Pais ( 
	id_estado INTEGER NOT NULL,
	id_pais INTEGER NOT NULL,
	nom_pais VARCHAR(20) NOT NULL
)
;

CREATE TABLE MD_Tesis ( 
	id_tesis INTEGER NOT NULL,
	autor VARCHAR(50),
	titulo VARCHAR(50),
	id_usuario INTEGER NOT NULL
)
;

CREATE TABLE MD_Usuario ( 
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


ALTER TABLE MD_Comentarios ADD CONSTRAINT PK_MD_Comentarios 
	PRIMARY KEY (id_coment)
;


ALTER TABLE MD_Estado ADD CONSTRAINT PK_MD_Estado 
	PRIMARY KEY (id_estado)
;


ALTER TABLE MD_Pais ADD CONSTRAINT PK_Pais 
	PRIMARY KEY (id_pais)
;


ALTER TABLE MD_Tesis ADD CONSTRAINT PK_MD_tesis 
	PRIMARY KEY (id_tesis)
;


ALTER TABLE MD_Usuario ADD CONSTRAINT PK_MD_Usuario 
	PRIMARY KEY (id_usuario)
;



ALTER TABLE MD_Comentarios
	ADD CONSTRAINT UQ_MD_Comentarios_id_tesis UNIQUE (descripcion)
;
ALTER TABLE MD_Comentarios
	ADD CONSTRAINT UQ_MD_Comentarios_id_tesis UNIQUE (id_tesis)
;
ALTER TABLE MD_Comentarios
	ADD CONSTRAINT UQ_MD_Comentarios_id_usuario UNIQUE (id_usuario)
;

ALTER TABLE MD_Estado
	ADD CONSTRAINT UQ_MD_Estado_nom_estado UNIQUE (nom_estado)
;

ALTER TABLE MD_Pais
	ADD CONSTRAINT UQ_MD_Pais_id_estado UNIQUE (id_estado)
;

ALTER TABLE MD_Pais
	ADD CONSTRAINT UQ_Pais_nom_pais UNIQUE (nom_pais)
;

ALTER TABLE MD_Tesis
	ADD CONSTRAINT UQ_MD_Tesis_id_usuario UNIQUE (id_usuario)
;
ALTER TABLE MD_Usuario
	ADD CONSTRAINT UQ_MD_Usuario_id_pais UNIQUE (id_pais)
;
ALTER TABLE MD_Usuario
	ADD CONSTRAINT UQ_MD_Usuario_id_usuario UNIQUE (id_usuario)
;
