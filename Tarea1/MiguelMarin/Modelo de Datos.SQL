-- DROP TABLE Bitacora
;
-- DROP TABLE Calificacion
;
-- DROP TABLE Comentario
;
-- DROP TABLE Contador
;
-- DROP TABLE Disciplina
;
-- DROP TABLE Especie
;
-- DROP TABLE Especie_tesis
;
-- DROP TABLE Estado
;
-- DROP TABLE Institucion_adscripcion
;
-- DROP TABLE Material_adicional
;
-- DROP TABLE Pais
;
-- DROP TABLE Permiso
;
-- DROP TABLE Permiso_rol
;
-- DROP TABLE Rol
;
-- DROP TABLE Subdisciplina
;
-- DROP TABLE Tesis
;
-- DROP TABLE Usuario
;

CREATE TABLE Bitacora ( 
	idbitacora INTEGER NOT NULL,
	idusuario INTEGER,
	ip VARCHAR(20) NOT NULL,
	fecha_reg DATE NOT NULL,
	idpais INTEGER NOT NULL,
	idtesis INTEGER
)
;

CREATE TABLE Calificacion ( 
	idcalificacion INTEGER NOT NULL,
	calificacion SMALINT NOT NULL,
	idusuario INTEGER NOT NULL,
	idtesis INTEGER NOT NULL,
	fecha_reg DATE NOT NULL
)
;

CREATE TABLE Comentario ( 
	idcomentario INTEGER NOT NULL,
	comentario VARCHAR(200) NOT NULL,
	idtesis INTEGER,
	idusuario INTEGER,
	fecha_reg DATE,
	tipo_comentario SMALINT NOT NULL,
	estatus SMALINT DEFAULT 0 NOT NULL
)
;

CREATE TABLE Contador ( 
	idcontador INTEGER NOT NULL,
	numero_visitas BIGINT NOT NULL
)
;

CREATE TABLE Disciplina ( 
	iddisciplina INTEGER NOT NULL,
	disciplina VARCHAR(60) NOT NULL
)
;

CREATE TABLE Especie ( 
	idespecie INTEGER NOT NULL,
	nombre VARCHAR(60) NOT NULL
)
;

CREATE TABLE Especie_tesis ( 
	idespecie_tesis INTEGER NOT NULL,
	idtesis INTEGER NOT NULL,
	idespacie INTEGER NOT NULL
)
;

CREATE TABLE Estado ( 
	idestado INTEGER NOT NULL,
	nombre VARCHAR(30) NOT NULL
)
;

CREATE TABLE Institucion_adscripcion ( 
	idistitucion_adscripcion INTEGER NOT NULL,
	nombre VARCHAR(40) NOT NULL
)
;

CREATE TABLE Material_adicional ( 
	idmaterial_adicional INTEGER NOT NULL,
	archivo  NOT NULL,
	idtesis INTEGER NOT NULL,
	tipo_archivo SMALINT NOT NULL
)
;

CREATE TABLE Pais ( 
	idpais INTEGER NOT NULL,
	nombre VARCHAR(50) NOT NULL
)
;

CREATE TABLE Permiso ( 
	idpermiso INTEGER NOT NULL,
	modulo  NOT NULL,
	permiso SMALINT NOT NULL
)
;

CREATE TABLE Permiso_rol ( 
	idrol INTEGER,
	idpermiso INTEGER NOT NULL
)
;

CREATE TABLE Rol ( 
	idrol INTEGER NOT NULL,
	rol VARCHAR(50) NOT NULL
)
;

CREATE TABLE Subdisciplina ( 
	idsubdisciplina INTEGER NOT NULL,
	nombre BIGINT NOT NULL
)
;

CREATE TABLE Tesis ( 
	idtesis INTEGER NOT NULL,
	titulo VARCHAR(30) NOT NULL,
	autor_tesis VARCHAR(60) NOT NULL,
	grado_obtenido SMALINT,
	anio_titulacion BIGINT NOT NULL,
	idinstitucion_adscripcion INTEGER NOT NULL,
	director_tesis VARCHAR(70) NOT NULL,
	condicion_sitio VARCHAR(150) NOT NULL,
	idestado INTEGER NOT NULL,
	iddisciplina INTEGER NOT NULL,
	idsubdisciplina INTEGER NOT NULL,
	archivo_tesis VARCHAR(50) NOT NULL,
	estatus SMALINT DEFAULT 1 NOT NULL,
	fecha_reg DATE NOT NULL
)
;

CREATE TABLE Usuario ( 
	idusuario INTEGER NOT NULL,
	nombre VARCHAR(70) NOT NULL,
	usuario VARCHAR(20) NOT NULL,
	password VARCHAR(300) NOT NULL,
	fecha_reg DATE NOT NULL,
	estatus SMALINT NOT NULL,
	correo VARCHAR(40) NOT NULL,
	idpais INTEGER NOT NULL,
	idrol INTEGER NOT NULL
)
;


ALTER TABLE Bitacora ADD CONSTRAINT PK_Bitacora 
	PRIMARY KEY (idbitacora)
;


ALTER TABLE Calificacion ADD CONSTRAINT PK_Calificacion 
	PRIMARY KEY (idcalificacion)
;


ALTER TABLE Comentario ADD CONSTRAINT PK_Comentario 
	PRIMARY KEY (idcomentario)
;


ALTER TABLE Contador ADD CONSTRAINT PK_Contador 
	PRIMARY KEY (idcontador)
;


ALTER TABLE Disciplina ADD CONSTRAINT PK_Disciplina 
	PRIMARY KEY (iddisciplina)
;


ALTER TABLE Especie ADD CONSTRAINT PK_Especie 
	PRIMARY KEY (idespecie)
;


ALTER TABLE Especie_tesis ADD CONSTRAINT PK_tesis_especie 
	PRIMARY KEY (idespecie_tesis)
;


ALTER TABLE Estado ADD CONSTRAINT PK_Estado 
	PRIMARY KEY (idestado)
;


ALTER TABLE Institucion_adscripcion ADD CONSTRAINT PK_Institucion_adscripcion 
	PRIMARY KEY (idistitucion_adscripcion)
;


ALTER TABLE Material_adicional ADD CONSTRAINT PK_Material_adicional 
	PRIMARY KEY (idmaterial_adicional)
;


ALTER TABLE Pais ADD CONSTRAINT PK_Pais 
	PRIMARY KEY (idpais)
;


ALTER TABLE Permiso ADD CONSTRAINT PK_Permiso 
	PRIMARY KEY (idpermiso)
;


ALTER TABLE Rol ADD CONSTRAINT PK_Rol 
	PRIMARY KEY (idrol)
;


ALTER TABLE Subdisciplina ADD CONSTRAINT PK_Subdisciplina 
	PRIMARY KEY (idsubdisciplina)
;


ALTER TABLE Tesis ADD CONSTRAINT PK_Tesis 
	PRIMARY KEY (idtesis)
;


ALTER TABLE Usuario ADD CONSTRAINT PK_Usuario 
	PRIMARY KEY (idusuario)
;



ALTER TABLE Bitacora
	ADD CONSTRAINT UQ_Bitacora_idbitacora UNIQUE (idbitacora)
;
ALTER TABLE Comentario
	ADD CONSTRAINT UQ_Comentario_idcomentario UNIQUE (idcomentario)
;
ALTER TABLE Contador
	ADD CONSTRAINT UQ_Contador_idcontador UNIQUE (idcontador)
;
ALTER TABLE Disciplina
	ADD CONSTRAINT UQ_Disciplina_disciplina UNIQUE (disciplina)
;
ALTER TABLE Disciplina
	ADD CONSTRAINT UQ_Disciplina_iddisciplina UNIQUE (iddisciplina)
;
ALTER TABLE Especie
	ADD CONSTRAINT UQ_Especie_idespecie UNIQUE (idespecie)
;
ALTER TABLE Especie
	ADD CONSTRAINT UQ_Especie_nombre UNIQUE (nombre)
;
ALTER TABLE Especie_tesis
	ADD CONSTRAINT UQ_tesis_especie_idespecie_tesis UNIQUE (idespecie_tesis)
;
ALTER TABLE Estado
	ADD CONSTRAINT UQ_Estado_idestado UNIQUE (idestado)
;
ALTER TABLE Estado
	ADD CONSTRAINT UQ_Estado_nombre UNIQUE (nombre)
;
ALTER TABLE Institucion_adscripcion
	ADD CONSTRAINT UQ_Institucion_adscripcion_idistitucion_adscripcion UNIQUE (idistitucion_adscripcion)
;
ALTER TABLE Institucion_adscripcion
	ADD CONSTRAINT UQ_Institucion_adscripcion_nombre UNIQUE (nombre)
;
ALTER TABLE Material_adicional
	ADD CONSTRAINT UQ_Material_adicional_idmaterial_adicional UNIQUE (idmaterial_adicional)
;
ALTER TABLE Pais
	ADD CONSTRAINT UQ_Pais_idpais UNIQUE (idpais)
;
ALTER TABLE Pais
	ADD CONSTRAINT UQ_Pais_nombre UNIQUE (nombre)
;
ALTER TABLE Permiso
	ADD CONSTRAINT UQ_Permiso_modulo UNIQUE (modulo)
;
ALTER TABLE Rol
	ADD CONSTRAINT UQ_Rol_idrol UNIQUE (idrol)
;
ALTER TABLE Subdisciplina
	ADD CONSTRAINT UQ_Subdisciplina_idsubdisciplina UNIQUE (idsubdisciplina)
;
ALTER TABLE Subdisciplina
	ADD CONSTRAINT UQ_Subdisciplina_nombre UNIQUE (nombre)
;
ALTER TABLE Tesis
	ADD CONSTRAINT UQ_Tesis_idtesis UNIQUE (idtesis)
;
ALTER TABLE Usuario
	ADD CONSTRAINT UQ_Usuario_idusuario UNIQUE (idusuario)
;
ALTER TABLE Usuario
	ADD CONSTRAINT UQ_Usuario_nombre UNIQUE (nombre)
;
ALTER TABLE Usuario
	ADD CONSTRAINT UQ_Usuario_usuario UNIQUE (usuario)
;

ALTER TABLE Bitacora ADD CONSTRAINT FK_Bitacora_Pais 
	FOREIGN KEY (idpais) REFERENCES Pais (idpais)
;

ALTER TABLE Bitacora ADD CONSTRAINT FK_Bitacora_Tesis 
	FOREIGN KEY (idtesis) REFERENCES Tesis (idtesis)
;

ALTER TABLE Bitacora ADD CONSTRAINT FK_Bitacora_Usuario 
	FOREIGN KEY (idusuario) REFERENCES Usuario (idusuario)
;

ALTER TABLE Calificacion ADD CONSTRAINT FK_Calificacion_Tesis 
	FOREIGN KEY (idtesis) REFERENCES Tesis (idtesis)
;

ALTER TABLE Calificacion ADD CONSTRAINT FK_Calificacion_Usuario 
	FOREIGN KEY (idusuario) REFERENCES Usuario (idusuario)
;

ALTER TABLE Comentario ADD CONSTRAINT FK_Comentario_Tesis 
	FOREIGN KEY (idtesis) REFERENCES Tesis (idtesis)
;

ALTER TABLE Comentario ADD CONSTRAINT FK_Comentario_Usuario 
	FOREIGN KEY (idusuario) REFERENCES Usuario (idusuario)
;

ALTER TABLE Especie_tesis ADD CONSTRAINT FK_especie_tesis_Especie 
	FOREIGN KEY (idespacie) REFERENCES Especie (idespecie)
;

ALTER TABLE Especie_tesis ADD CONSTRAINT FK_tesis_especie_Tesis 
	FOREIGN KEY (idtesis) REFERENCES Tesis (idtesis)
;

ALTER TABLE Material_adicional ADD CONSTRAINT FK_Material_adicional_Tesis 
	FOREIGN KEY (idtesis) REFERENCES Tesis (idtesis)
;

ALTER TABLE Permiso_rol ADD CONSTRAINT FK_Permiso_rol_Permiso 
	FOREIGN KEY (idpermiso) REFERENCES Permiso (idpermiso)
;

ALTER TABLE Permiso_rol ADD CONSTRAINT FK_Permiso_rol_Rol 
	FOREIGN KEY (idrol) REFERENCES Rol (idrol)
;

ALTER TABLE Tesis ADD CONSTRAINT FK_Tesis_Disciplina 
	FOREIGN KEY (iddisciplina) REFERENCES Disciplina (iddisciplina)
;

ALTER TABLE Tesis ADD CONSTRAINT FK_Tesis_Institucion_adscripcion 
	FOREIGN KEY (idinstitucion_adscripcion) REFERENCES Institucion_adscripcion (idistitucion_adscripcion)
;

ALTER TABLE Tesis ADD CONSTRAINT FK_Tesis_Subdisciplina 
	FOREIGN KEY (idsubdisciplina) REFERENCES Subdisciplina (idsubdisciplina)
;

ALTER TABLE Usuario ADD CONSTRAINT FK_Usuario_Pais 
	FOREIGN KEY (idpais) REFERENCES Pais (idpais)
;

ALTER TABLE Usuario ADD CONSTRAINT FK_Usuario_Rol 
	FOREIGN KEY (idrol) REFERENCES Rol (idrol)
;
