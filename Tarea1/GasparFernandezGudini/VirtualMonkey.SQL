-- DROP TABLE Anexos
;
-- DROP TABLE CATAutores
;
-- DROP TABLE CATDirectores_tesis
;
-- DROP TABLE CATDisciplina
;
-- DROP TABLE CATPaises
;
-- DROP TABLE CATPrimates
;
-- DROP TABLE CATSubdisciplina
;
-- DROP TABLE Comentarios
;
-- DROP TABLE Reportes
;
-- DROP TABLE Tesis
;
-- DROP TABLE tesis_anexo
;
-- DROP TABLE Usuarios
;

CREATE TABLE Anexos ( 
	id_anexo INTEGER NOT NULL,
	nombre_archivo VARCHAR(20),
	tipo_de_archivo VARCHAR(10),
	url VARCHAR(70)
)
;

CREATE TABLE CATAutores ( 
	id_autor INTEGER NOT NULL,
	nombre VARCHAR(80),
	grado_academico VARCHAR(10)
)
;

CREATE TABLE CATDirectores_tesis ( 
	id_director_tesis INTEGER NOT NULL,
	nombre VARCHAR(80)
)
;

CREATE TABLE CATDisciplina ( 
	id_disciplina INTEGER NOT NULL,
	nombre VARCHAR(20)
)
;

CREATE TABLE CATPaises ( 
	id_pais INTEGER NOT NULL,
	pais VARCHAR(20)
)
;

CREATE TABLE CATPrimates ( 
	id_primates INTEGER NOT NULL,
	nombre_comun VARCHAR(20),
	nombre_cientifico VARCHAR(30)
)
;

CREATE TABLE CATSubdisciplina ( 
	id_subdisciplina INTEGER NOT NULL,
	nombre VARCHAR(20)
)
;

CREATE TABLE Comentarios ( 
	id_comentario INTEGER NOT NULL,
	comentario LONG VARCHAR,
	id_tesis INTEGER,
	aprovacion SMALLINT,
	id_usuario INTEGER
)
;

CREATE TABLE Reportes ( 
	id_reporte INTEGER NOT NULL,
	nombre_reporte VARCHAR(20),
	url_reporte VARCHAR(70),
	fecha_reporte TIMESTAMP
)
;

CREATE TABLE Tesis ( 
	id_tesis INTEGER NOT NULL,
	nombre VARCHAR(80),
	id_autor INTEGER,
	id_disciplina INTEGER,
	id_subdisciplina INTEGER,
	id_director_tesis INTEGER,
	id_primate INTEGER,
	fecha_registro TIMESTAMP,
	anexos SMALLINT
)
;

CREATE TABLE tesis_anexo ( 
	id_tesis INTEGER NOT NULL,
	id_anexo INTEGER NOT NULL
)
;

CREATE TABLE Usuarios ( 
	id_usuario INTEGER NOT NULL,
	nombre VARCHAR(50),
	usuario VARCHAR(20),
	email VARCHAR(30),
	id_pais INTEGER
)
;


ALTER TABLE Anexos ADD CONSTRAINT PK_Anexos 
	PRIMARY KEY (id_anexo)
;


ALTER TABLE CATAutores ADD CONSTRAINT PK_CATAutores 
	PRIMARY KEY (id_autor)
;


ALTER TABLE CATDirectores_tesis ADD CONSTRAINT PK_CATDirectores_tesis 
	PRIMARY KEY (id_director_tesis)
;


ALTER TABLE CATDisciplina ADD CONSTRAINT PK_CATDisciplina 
	PRIMARY KEY (id_disciplina)
;


ALTER TABLE CATPaises ADD CONSTRAINT PK_CATPaises 
	PRIMARY KEY (id_pais)
;


ALTER TABLE CATPrimates ADD CONSTRAINT PK_CATPrimates 
	PRIMARY KEY (id_primates)
;


ALTER TABLE CATSubdisciplina ADD CONSTRAINT PK_CATSubdisciplina 
	PRIMARY KEY (id_subdisciplina)
;


ALTER TABLE Comentarios ADD CONSTRAINT PK_Comentarios 
	PRIMARY KEY (id_comentario)
;


ALTER TABLE Reportes ADD CONSTRAINT PK_Reportes 
	PRIMARY KEY (id_reporte)
;


ALTER TABLE Tesis ADD CONSTRAINT PK_Tesis 
	PRIMARY KEY (id_tesis)
;


ALTER TABLE tesis_anexo ADD CONSTRAINT PK_tesis_anexo 
	PRIMARY KEY (id_tesis, id_anexo)
;


ALTER TABLE Usuarios ADD CONSTRAINT PK_Usuarios 
	PRIMARY KEY (id_usuario)
;
