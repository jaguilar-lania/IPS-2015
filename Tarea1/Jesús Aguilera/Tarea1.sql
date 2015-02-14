DROP TABLE MaterialAdicional
;
DROP TABLE Comentarios
;
DROP TABLE Tesis
;
DROP TABLE Visitas
;
DROP TABLE Usuario
;

CREATE TABLE MaterialAdicional ( 
	idMaterial INTEGER NOT NULL,
	idTesis INTEGER NOT NULL,
	archivo VARCHAR(15) NOT NULL
)
;

CREATE TABLE Comentarios ( 
	idComentario INTEGER NOT NULL,
	idTesis INTEGER NOT NULL,
	comentario VARCHAR(100),
	calificacion INTEGER
)
;

CREATE TABLE Tesis ( 
	idTesis INTEGER NOT NULL,
	autor VARCHAR(40),
	titulo VARCHAR(40)
)
;

CREATE TABLE Visitas ( 
	idVisita INTEGER NOT NULL,
	origenVisita VARCHAR(15)
)
;

CREATE TABLE Usuario ( 
	idUsuario INTEGER NOT NULL,
	correoUsuario VARCHAR(40) NOT NULL,
	nombreUsuario VARCHAR(20) NOT NULL,
	rol INTEGER NOT NULL
)
;


ALTER TABLE MaterialAdicional ADD CONSTRAINT PK_MaterialAdicional 
	PRIMARY KEY (idMaterial)
;


ALTER TABLE Comentarios ADD CONSTRAINT PK_Comentarios 
	PRIMARY KEY (idComentario)
;


ALTER TABLE Tesis ADD CONSTRAINT PK_Tesis 
	PRIMARY KEY (idTesis)
;


ALTER TABLE Visitas ADD CONSTRAINT PK_Visitas 
	PRIMARY KEY (idVisita)
;


ALTER TABLE Usuario ADD CONSTRAINT PK_Usuario 
	PRIMARY KEY (idUsuario)
;




ALTER TABLE Tesis ADD CONSTRAINT FK_Tesis_Comentarios 
	FOREIGN KEY (idTesis) REFERENCES Comentarios (idTesis)
ON DELETE RESTRICT ON UPDATE NO ACTION
;

ALTER TABLE Tesis ADD CONSTRAINT FK_Tesis_MaterialAdicional 
	FOREIGN KEY (idTesis) REFERENCES MaterialAdicional (idTesis)
ON DELETE RESTRICT ON UPDATE NO ACTION
;
