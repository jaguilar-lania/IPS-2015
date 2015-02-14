CREATE TABLE Genero ( 
	id INTEGER NOT NULL,
	clave VARCHAR(10),
	nombre VARCHAR(20) NOT NULL
)
;

CREATE TABLE Rol ( 
	id INTEGER NOT NULL,
	nivel VARCHAR(100)
)
;

CREATE TABLE subdisciplina ( 
	idDisciplina INTEGER NOT NULL,
	id INTEGER NOT NULL,
	nombre VARCHAR(200)
)
;

CREATE TABLE GradoAcademico ( 
	id INTEGER NOT NULL,
	grado VARCHAR(250)
)
;

CREATE TABLE EspeciePrimate ( 
	id INTEGER NOT NULL,
	nombre VARCHAR(200)
)
;

CREATE TABLE DisciplinaEstudio ( 
	id INTEGER NOT NULL,
	nombre VARCHAR(200)
)
;

CREATE TABLE CondicionSitio ( 
	id INTEGER NOT NULL,
	Descripcion VARCHAR(100)
)
;

CREATE TABLE PersonalTesis ( 
	id INTEGER NOT NULL,
	Nombre VARCHAR(100),
	tipo INTEGER
)
;

CREATE TABLE Estado ( 
	id INTEGER NOT NULL,
	nombre BIGINT,
	idPais BIGINT
)
;

CREATE TABLE Pais ( 
	id INTEGER NOT NULL,
	nombre VARCHAR(100)
)
;

CREATE TABLE Retroalimentacion ( 
	idUsuario INTEGER NOT NULL,
	idTesis INTEGER NOT NULL,
	Calificacion INTEGER,
	comentario VARCHAR(250)
)
;

CREATE TABLE MaterialExtra ( 
	Archivo BLOB(0),
	Tipo INTEGER,
	id INTEGER NOT NULL,
	idTesis BIGINT NOT NULL
)
;

CREATE TABLE Consulta ( 
	idUsuario INTEGER NOT NULL,
	idTesis INTEGER NOT NULL
)
;

CREATE TABLE Sesion ( 
	idUsuario  NOT NULL,
	id INTEGER NOT NULL,
	FechaIngreso DATE,
	HoraIngreso TIME,
	FechaSalida DATE,
	HoraSalida DATE
)
;

CREATE TABLE Tesis ( 
	Año INTEGER,
	Archivo VARCHAR(200),
	idAutor INTEGER,
	idCondicionSitio INTEGER,
	IdDirectorTesis INTEGER,
	idEspeciePrimate INTEGER,
	idEstado INTEGER,
	idGradoObtenido INTEGER,
	idInstitucion INTEGER,
	idSubdisciplina INTEGER,
	Titulo VARCHAR(200),
	id INTEGER NOT NULL
)
;

CREATE TABLE Usuario ( 
	contraseña CHAR(10),
	Email VARCHAR(20),
	facebook VARCHAR(30),
	idGenero INTEGER,
	idGradoAcademico INTEGER,
	Nombre VARCHAR(10),
	ocupacion VARCHAR(10),
	idPais INTEGER,
	idRol INTEGER,
	id INTEGER NOT NULL
)
;


ALTER TABLE Genero ADD CONSTRAINT PK_Genero 
	PRIMARY KEY (id)
;


ALTER TABLE Rol ADD CONSTRAINT PK_Rol 
	PRIMARY KEY (id)
;


ALTER TABLE subdisciplina ADD CONSTRAINT PK_subdisciplina 
	PRIMARY KEY (idDisciplina, id)
;


ALTER TABLE GradoAcademico ADD CONSTRAINT PK_GradoAcademico 
	PRIMARY KEY (id)
;


ALTER TABLE EspeciePrimate ADD CONSTRAINT PK_EspeciePrimate 
	PRIMARY KEY (id)
;


ALTER TABLE DisciplinaEstudio ADD CONSTRAINT PK_DisciplinaEstudio 
	PRIMARY KEY (id)
;


ALTER TABLE CondicionSitio ADD CONSTRAINT PK_CondicionSitio 
	PRIMARY KEY (id)
;


ALTER TABLE PersonalTesis ADD CONSTRAINT PK_PersonalTesis 
	PRIMARY KEY (id)
;


ALTER TABLE Estado ADD CONSTRAINT PK_Estado 
	PRIMARY KEY (id)
;


ALTER TABLE Pais ADD CONSTRAINT PK_Pais 
	PRIMARY KEY (id)
;


ALTER TABLE Retroalimentacion ADD CONSTRAINT PK_Retroalimentacion 
	PRIMARY KEY (idUsuario, idTesis)
;


ALTER TABLE MaterialExtra ADD CONSTRAINT PK_MaterialExtra 
	PRIMARY KEY (id, idTesis)
;


ALTER TABLE Consulta ADD CONSTRAINT PK_Consulta 
	PRIMARY KEY (idUsuario, idTesis)
;


ALTER TABLE Sesion ADD CONSTRAINT PK_Sesion 
	PRIMARY KEY (idUsuario, id)
;


ALTER TABLE Tesis ADD CONSTRAINT PK_Tesis 
	PRIMARY KEY (id)
;


ALTER TABLE Usuario ADD CONSTRAINT PK_Usuario 
	PRIMARY KEY (id)
;



ALTER TABLE Genero
	ADD CONSTRAINT UQ_Genero_id UNIQUE (id)
;
ALTER TABLE Rol
	ADD CONSTRAINT UQ_Rol_id UNIQUE (id)
;
ALTER TABLE subdisciplina
	ADD CONSTRAINT UQ_subdisciplina_id UNIQUE (id)
;
ALTER TABLE GradoAcademico
	ADD CONSTRAINT UQ_GradoAcademico_id UNIQUE (id)
;
ALTER TABLE EspeciePrimate
	ADD CONSTRAINT UQ_EspeciePrimate_id UNIQUE (id)
;
ALTER TABLE DisciplinaEstudio
	ADD CONSTRAINT UQ_DisciplinaEstudio_id UNIQUE (id)
;
ALTER TABLE CondicionSitio
	ADD CONSTRAINT UQ_CondicionSitio_id UNIQUE (id)
;
ALTER TABLE PersonalTesis
	ADD CONSTRAINT UQ_PersonalTesis_id UNIQUE (id)
;
ALTER TABLE Estado
	ADD CONSTRAINT UQ_Estado_id UNIQUE (id)
;
ALTER TABLE Pais
	ADD CONSTRAINT UQ_Pais_id UNIQUE (id)
;
ALTER TABLE Retroalimentacion
	ADD CONSTRAINT UQ_Retroalimentacion_idTesis UNIQUE (idTesis)
;
ALTER TABLE Retroalimentacion
	ADD CONSTRAINT UQ_Retroalimentacion_idUsuario UNIQUE (idUsuario)
;
ALTER TABLE MaterialExtra
	ADD CONSTRAINT UQ_MaterialExtra_id UNIQUE (id)
;
ALTER TABLE Consulta
	ADD CONSTRAINT UQ_Consulta_idTesis UNIQUE (idTesis)
;
ALTER TABLE Consulta
	ADD CONSTRAINT UQ_Consulta_idUsuario UNIQUE (idUsuario)
;
ALTER TABLE Sesion
	ADD CONSTRAINT UQ_Sesion_id UNIQUE (id)
;
ALTER TABLE Tesis
	ADD CONSTRAINT UQ_Tesis_id UNIQUE (id)
;
ALTER TABLE Usuario
	ADD CONSTRAINT UQ_Usuario_id UNIQUE (id)
;
