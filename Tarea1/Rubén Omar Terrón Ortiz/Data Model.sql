DROP TABLE Autor
;
DROP TABLE Calificacion
;
DROP TABLE Comentario
;
DROP TABLE Director
;
DROP TABLE Pais
;
DROP TABLE Tesis
;
DROP TABLE Usuario
;
DROP TABLE Visitas
;

CREATE TABLE Autor ( 
	idAutor INTEGER NOT NULL,
	Carrera VARCHAR(100) NOT NULL,
	idUsuario INTEGER NOT NULL
)
;

CREATE TABLE Calificacion ( 
	idCalificacion INTEGER NOT NULL,
	Calificacion INTEGER NOT NULL,
	fCreacion DATE NOT NULL,
	idTesis INTEGER NOT NULL,
	idUsuario INTEGER NOT NULL
)
;

CREATE TABLE Comentario ( 
	idComentario INTEGER NOT NULL,
	Comentario VARCHAR(200) NOT NULL,
	fCreacion DATE NOT NULL,
	idTesis INTEGER NOT NULL,
	idUsuario INTEGER NOT NULL
)
;

CREATE TABLE Director ( 
	idDirector INTEGER NOT NULL,
	Profesion VARCHAR(80) NOT NULL,
	idUsuario INTEGER NOT NULL,
	idGrado INTEGER NOT NULL
)
;

CREATE TABLE Pais ( 
	idPais INTEGER NOT NULL,
	Descripcion VARCHAR(50) NOT NULL
)
;

CREATE TABLE Tesis ( 
	idTesis INTEGER NOT NULL,
	Titulo VARCHAR(350) NOT NULL,
	FGrado DATE NOT NULL,
	Disciplina VARCHAR(50) NOT NULL,
	IES VARCHAR(150) NOT NULL,
	idGrado INTEGER NOT NULL,
	idAutor INTEGER NOT NULL,
	idPais INTEGER NOT NULL,
	idDirector INTEGER NOT NULL
)
;

CREATE TABLE Usuario ( 
	idUsuario INTEGER NOT NULL,
	Nombre VARCHAR(50) NOT NULL,
	appaterno VARCHAR(50) NOT NULL,
	apmaterno VARCHAR(50) NOT NULL,
	fNacimiento DATE NOT NULL,
	idGrado INTEGER NOT NULL,
	idPais INTEGER NOT NULL,
	idPermiso INTEGER NOT NULL
)
;

CREATE TABLE Visitas ( 
	idVisita INTEGER NOT NULL,
	fVisita DATE NOT NULL,
	idTesis INTEGER NOT NULL,
	idPais INTEGER NOT NULL,
	idUsuario INTEGER NOT NULL
)
;


ALTER TABLE Autor ADD CONSTRAINT PK_Autor 
	PRIMARY KEY (idAutor)
;


ALTER TABLE Calificacion ADD CONSTRAINT PK_Calificacion 
	PRIMARY KEY (idCalificacion)
;


ALTER TABLE Comentario ADD CONSTRAINT PK_Comentario 
	PRIMARY KEY (idComentario)
;


ALTER TABLE Director ADD CONSTRAINT PK_Director 
	PRIMARY KEY (idDirector)
;


ALTER TABLE Pais ADD CONSTRAINT PK_Pais 
	PRIMARY KEY (idPais)
;


ALTER TABLE Tesis ADD CONSTRAINT PK_Tesis 
	PRIMARY KEY (idTesis)
;


ALTER TABLE Usuario ADD CONSTRAINT PK_Usuario 
	PRIMARY KEY (idUsuario)
;


ALTER TABLE Visitas ADD CONSTRAINT PK_Visitas 
	PRIMARY KEY (idVisita)
;
