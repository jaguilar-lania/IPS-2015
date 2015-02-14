CREATE TABLE Calificacion ( 
	idCalificacion INTEGER NOT NULL,
	idTesis INTEGER,
	calificacion INTEGER,
	idUsuario INTEGER
)
;

CREATE TABLE CatalogoTesis ( 
	idTesis INTEGER NOT NULL,
	titulo VARCHAR(10) NOT NULL,
	autor VARCHAR(10) NOT NULL,
	disciplina VARCHAR(10) NOT NULL,
	especie VARCHAR(10) NOT NULL,
	subdisciplina VARCHAR(10) NOT NULL
)
;

CREATE TABLE Comentario ( 
	idComentario INTEGER NOT NULL,
	descripcion VARCHAR(10),
	idUsuario INTEGER,
	idTesis INTEGER
)
;

CREATE TABLE MaterialExtra ( 
	idMaterialExtra INTEGER NOT NULL,
	titulo VARCHAR(10) NOT NULL,
	idTesis INTEGER
)
;

CREATE TABLE RegistroEstadisticas ( 
	idRegistro INTEGER NOT NULL,
	fechaVisita DATE NOT NULL,
	idUsuario INTEGER NOT NULL,
	idMaterialExtra INTEGER,
	idTesis INTEGER,
	Ip INTEGER
)
;

CREATE TABLE Roles ( 
	idRol INTEGER NOT NULL,
	idUsuario INTEGER,
	descripcion VARCHAR(10)
)
;

CREATE TABLE Usuario ( 
	idUsuario INTEGER NOT NULL,
	nombre VARCHAR(10) NOT NULL,
	correoElectronico VARCHAR(10) NOT NULL,
	genero VARCHAR(10) NOT NULL,
	ocupacion VARCHAR(10) NOT NULL,
	gradoAcademico VARCHAR(10),
	facebook VARCHAR(10),
	contrasena VARCHAR(10)
)
;


ALTER TABLE Calificacion ADD CONSTRAINT PK_Calificacion 
	PRIMARY KEY (idCalificacion)
;


ALTER TABLE CatalogoTesis ADD CONSTRAINT PK_CatalogoTesis 
	PRIMARY KEY (idTesis)
;


ALTER TABLE Comentario ADD CONSTRAINT PK_Comentario 
	PRIMARY KEY (idComentario)
;


ALTER TABLE MaterialExtra ADD CONSTRAINT PK_MaterialExtra 
	PRIMARY KEY (idMaterialExtra)
;


ALTER TABLE RegistroEstadisticas ADD CONSTRAINT PK_registroEstadisticas 
	PRIMARY KEY (idRegistro)
;


ALTER TABLE Roles ADD CONSTRAINT PK_Roles 
	PRIMARY KEY (idRol)
;


ALTER TABLE Usuario ADD CONSTRAINT PK_Usuario 
	PRIMARY KEY (idUsuario)
;




ALTER TABLE Calificacion ADD CONSTRAINT FK_Calificacion_CatalogoTesis 
	FOREIGN KEY (idTesis) REFERENCES CatalogoTesis (idTesis)
;

ALTER TABLE Comentario ADD CONSTRAINT FK_Comentario_CatalogoTesis 
	FOREIGN KEY (idTesis) REFERENCES CatalogoTesis (idTesis)
;

ALTER TABLE MaterialExtra ADD CONSTRAINT FK_MaterialExtra_CatalogoTesis 
	FOREIGN KEY (idTesis) REFERENCES CatalogoTesis (idTesis)
;

ALTER TABLE RegistroEstadisticas ADD CONSTRAINT FK_RegistroEstadisticas_CatalogoTesis 
	FOREIGN KEY (idTesis) REFERENCES CatalogoTesis (idTesis)
;

ALTER TABLE RegistroEstadisticas ADD CONSTRAINT FK_RegistroEstadisticas_Usuario 
	FOREIGN KEY (idUsuario) REFERENCES Usuario (idUsuario)
;

ALTER TABLE Roles ADD CONSTRAINT FK_Roles_Usuario 
	FOREIGN KEY (idUsuario) REFERENCES Usuario (idUsuario)
;
