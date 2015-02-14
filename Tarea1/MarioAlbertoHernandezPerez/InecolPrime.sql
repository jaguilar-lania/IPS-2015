DROP TABLE autor
;
DROP TABLE calificacion
;
DROP TABLE catalogo
;
DROP TABLE comentario
;
DROP TABLE director
;
DROP TABLE documento
;
DROP TABLE entidadfederativa
;
DROP TABLE menu
;
DROP TABLE municipio
;
DROP TABLE pais
;
DROP TABLE parametro
;
DROP TABLE permiso
;
DROP TABLE persona
;
DROP TABLE rol
;
DROP TABLE rolPermiso
;
DROP TABLE sugerencia
;
DROP TABLE tesis
;
DROP TABLE tipoDocumento
;
DROP TABLE usuario
;
DROP TABLE visita
;

CREATE TABLE autor ( 
	idAutor INTEGER NOT NULL,
	fechaDebut DATE,
	alias VARCHAR(255),
	idInstitucion INTEGER,
	idGradoAcademico INTEGER,
	idProfesion INTEGER
)
;

CREATE TABLE calificacion ( 
	idCalificacion INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	idTesis INTEGER,
	idUsuario INTEGER,
	tiempoCreacion TIMESTAMP,
	comentario VARCHAR(255),
	calificacion INTEGER
)
;

CREATE TABLE catalogo ( 
	idCatalogo INTEGER NOT NULL,
	idCategoria INTEGER DEFAULT NULL,
	nombre VARCHAR(255)
)
;

CREATE TABLE comentario ( 
	idComentario INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	idTesis INTEGER,
	idUsuario INTEGER,
	tiempoCreacion TIMESTAMP,
	comentario VARCHAR(1000)
)
;

CREATE TABLE director ( 
	idDirector INTEGER NOT NULL,
	idInstitucion INTEGER,
	idGradoAcademico INTEGER,
	idProfesion INTEGER
)
;

CREATE TABLE documento ( 
	idTesis INTEGER NOT NULL,
	idTipoDocumento INTEGER NOT NULL,
	nombre VARCHAR(50),
	url VARCHAR(255)
)
;

CREATE TABLE entidadfederativa ( 
	idEntidadFederativa INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	nombre VARCHAR(50),
	clave VARCHAR(4),
	idPais INTEGER
)
;

CREATE TABLE menu ( 
	idMenu INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	nombre VARCHAR(255),
	idMenuContenedor INTEGER,
	orden INTEGER,
	idTipo INTEGER,
	enlace VARCHAR(255)
)
;

CREATE TABLE municipio ( 
	idMunicipio INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	idEntidadFederativa INTEGER NOT NULL,
	nombre VARCHAR(60),
	clave VARCHAR(5)
)
;

CREATE TABLE pais ( 
	idPais INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	nombre VARCHAR(50),
	nacionalidad VARCHAR(50),
	codigo VARCHAR(2)
)
;

CREATE TABLE parametro ( 
	idParametro INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	idTipo CHAR(1) DEFAULT 'U' NOT NULL,
	nombre VARCHAR(50),
	descripcion VARCHAR(255),
	valor CLOB,
	idCategoria INTEGER
)
;

CREATE TABLE permiso ( 
	idPermiso INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	nombre VARCHAR(50),
	descripcion VARCHAR(255),
	permisos VARCHAR(255),
	idMenu INTEGER
)
;

CREATE TABLE persona ( 
	idPersona INTEGER NOT NULL,
	idMunicipio INTEGER,
	nombre VARCHAR(50),
	apellidos VARCHAR(50),
	fechaNacimiento DATE,
	email VARCHAR(50),
	idPais INTEGER,
	idEntidadFederativa INTEGER,
	curp VARCHAR(18)
)
;

CREATE TABLE rol ( 
	idRol INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	nombre VARCHAR(50),
	idEstatus INTEGER NOT NULL,
	tiempoSesion INTEGER,
	spMiperfil CHAR(1) DEFAULT 'N'
)
;

CREATE TABLE rolPermiso ( 
	idRol INTEGER NOT NULL,
	idPermiso INTEGER NOT NULL
)
;

CREATE TABLE sugerencia ( 
	idSugerencia INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	sugerencia VARCHAR(1000),
	tiempoCreacion TIMESTAMP,
	idUsuario INTEGER
)
;

CREATE TABLE tesis ( 
	idTesis INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	titulo VARCHAR(255),
	idPais INTEGER,
	idEntidadFederativa INTEGER,
	idDisciplina INTEGER,
	idSubdisciplina INTEGER,
	idInstitucion INTEGER,
	idGrado INTEGER,
	idEspecie INTEGER,
	idDirector INTEGER,
	condiciones VARCHAR(255),
	anio INTEGER,
	idAutor INTEGER,
	sintesis VARCHAR(8000)
)
;

CREATE TABLE tipoDocumento ( 
	idTipoDocumento INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	descripcion VARCHAR(50),
	extensiones VARCHAR(50)
)
;

CREATE TABLE usuario ( 
	idUsuario INTEGER NOT NULL,
	idRol INTEGER,
	tiempoRegistro TIMESTAMP,
	user VARCHAR(25),
	password VARCHAR(50)
)
;

CREATE TABLE visita ( 
	idVisita INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	tiempoVisita TIMESTAMP,
	idUsuario INTEGER,
	idTesis INTEGER,
	idPais INTEGER
)
;


CREATE INDEX Catalogo_FKIndex1 ON catalogo
	(idCategoria)
;
CREATE INDEX Municipio_FKIndex1 ON municipio
	(idEntidadFederativa)
;
CREATE INDEX Rol_FKIndex1 ON rol
	(idEstatus)
;
CREATE INDEX Perfil_FKIndex1 ON rolPermiso
	(idRol)
;
CREATE INDEX Perfil_FKIndex2 ON rolPermiso
	(idPermiso)
;
ALTER TABLE autor ADD CONSTRAINT PK__autor__9AE8206A036B7E3B 
	PRIMARY KEY (idAutor)
;


ALTER TABLE calificacion ADD CONSTRAINT PK__comentar__C74515DA2C6D93CE 
	PRIMARY KEY (idCalificacion)
;


ALTER TABLE catalogo ADD CONSTRAINT PK__catalogo__C615E0E807020F21 
	PRIMARY KEY (idCatalogo)
;


ALTER TABLE comentario ADD CONSTRAINT PK__comentar__C74515DA26B4BA78 
	PRIMARY KEY (idComentario)
;


ALTER TABLE director ADD CONSTRAINT PK__director__92E1D6EE66CF3F8D 
	PRIMARY KEY (idDirector)
;


ALTER TABLE documento ADD CONSTRAINT PK__document__683FAC721D2B503E 
	PRIMARY KEY (idTesis, idTipoDocumento)
;


ALTER TABLE entidadfederativa ADD CONSTRAINT PK__entidadF__464652044E7E8A33 
	PRIMARY KEY (idEntidadFederativa)
;


ALTER TABLE menu ADD CONSTRAINT PK__menu__C26AF4831209AD79 
	PRIMARY KEY (idMenu)
;


ALTER TABLE municipio ADD CONSTRAINT PK__municipi__FD10E4000BC6C43E 
	PRIMARY KEY (idMunicipio)
;


ALTER TABLE pais ADD CONSTRAINT PK__pais__BD2285E31920BF5C 
	PRIMARY KEY (idPais)
;


ALTER TABLE parametro ADD CONSTRAINT PK__parametr__9C816E5F3CD905C1 
	PRIMARY KEY (idParametro)
;


ALTER TABLE permiso ADD CONSTRAINT PK__permiso__06A584864589517F 
	PRIMARY KEY (idPermiso)
;


ALTER TABLE persona ADD CONSTRAINT PK__personal__D840C9FD6AFACD50 
	PRIMARY KEY (idPersona)
;


ALTER TABLE rol ADD CONSTRAINT PK__rol__3C872F766D9742D9 
	PRIMARY KEY (idRol)
;


ALTER TABLE rolPermiso ADD CONSTRAINT PK__perfil__4CED773E42ACE4D4 
	PRIMARY KEY (idRol, idPermiso)
;


ALTER TABLE sugerencia ADD CONSTRAINT PK__sugerenc__A4668EAA11B99D92 
	PRIMARY KEY (idSugerencia)
;


ALTER TABLE tesis ADD CONSTRAINT PK__tesis__2E2073ED6E706155 
	PRIMARY KEY (idTesis)
;


ALTER TABLE tipoDocumento ADD CONSTRAINT PK__tipoDocu__61FDF9F520FBE122 
	PRIMARY KEY (idTipoDocumento)
;


ALTER TABLE usuario ADD CONSTRAINT PK__usuario__645723A60C00C43C 
	PRIMARY KEY (idUsuario)
;


ALTER TABLE visita ADD CONSTRAINT PK__visita__0F55DBEC167E52AF 
	PRIMARY KEY (idVisita)
;




ALTER TABLE autor ADD CONSTRAINT fk_autor_1 
	FOREIGN KEY (idAutor) REFERENCES persona (idPersona)
;

ALTER TABLE autor ADD CONSTRAINT fk_autor_2 
	FOREIGN KEY (idInstitucion) REFERENCES catalogo (idCatalogo)
;

ALTER TABLE autor ADD CONSTRAINT fk_autor_3 
	FOREIGN KEY (idGradoAcademico) REFERENCES catalogo (idCatalogo)
;

ALTER TABLE autor ADD CONSTRAINT fk_autor_4 
	FOREIGN KEY (idProfesion) REFERENCES catalogo (idCatalogo)
;

ALTER TABLE calificacion ADD CONSTRAINT fk_calificacion_1 
	FOREIGN KEY (idTesis) REFERENCES tesis (idTesis)
;

ALTER TABLE calificacion ADD CONSTRAINT fk_calificacion_2 
	FOREIGN KEY (idUsuario) REFERENCES usuario (idUsuario)
;

ALTER TABLE catalogo ADD CONSTRAINT fk_catalogo_1 
	FOREIGN KEY (idCategoria) REFERENCES catalogo (idCatalogo)
;

ALTER TABLE comentario ADD CONSTRAINT fk_comentario_1 
	FOREIGN KEY (idTesis) REFERENCES tesis (idTesis)
;

ALTER TABLE comentario ADD CONSTRAINT fk_comentario_2 
	FOREIGN KEY (idUsuario) REFERENCES usuario (idUsuario)
;

ALTER TABLE director ADD CONSTRAINT fk_director_1 
	FOREIGN KEY (idDirector) REFERENCES persona (idPersona)
;

ALTER TABLE director ADD CONSTRAINT fk_director_2 
	FOREIGN KEY (idInstitucion) REFERENCES catalogo (idCatalogo)
;

ALTER TABLE director ADD CONSTRAINT fk_director_3 
	FOREIGN KEY (idGradoAcademico) REFERENCES catalogo (idCatalogo)
;

ALTER TABLE director ADD CONSTRAINT fk_director_4 
	FOREIGN KEY (idProfesion) REFERENCES catalogo (idCatalogo)
;

ALTER TABLE documento ADD CONSTRAINT fk_documentotesis_1 
	FOREIGN KEY (idTesis) REFERENCES tesis (idTesis)
;

ALTER TABLE documento ADD CONSTRAINT fk_documentotesis_2 
	FOREIGN KEY (idTipoDocumento) REFERENCES tipoDocumento (idTipoDocumento)
;

ALTER TABLE entidadfederativa ADD CONSTRAINT fk_entidadfederativa_1 
	FOREIGN KEY (idPais) REFERENCES pais (idPais)
;

ALTER TABLE menu ADD CONSTRAINT fk_menu_1 
	FOREIGN KEY (idMenuContenedor) REFERENCES menu (idMenu)
;

ALTER TABLE menu ADD CONSTRAINT fk_menu_2 
	FOREIGN KEY (idTipo) REFERENCES catalogo (idCatalogo)
;

ALTER TABLE municipio ADD CONSTRAINT fk_municipio_1 
	FOREIGN KEY (idEntidadFederativa) REFERENCES entidadfederativa (idEntidadFederativa)
;

ALTER TABLE parametro ADD CONSTRAINT FK__parametro__idCat__40A996A5 
	FOREIGN KEY (idCategoria) REFERENCES catalogo (idCatalogo)
;

ALTER TABLE permiso ADD CONSTRAINT fk_permiso_1 
	FOREIGN KEY (idMenu) REFERENCES menu (idMenu)
;

ALTER TABLE persona ADD CONSTRAINT fk_personal_1 
	FOREIGN KEY (idPais) REFERENCES pais (idPais)
;

ALTER TABLE persona ADD CONSTRAINT fk_personal_2 
	FOREIGN KEY (idEntidadFederativa) REFERENCES entidadfederativa (idEntidadFederativa)
;

ALTER TABLE persona ADD CONSTRAINT fk_personal_3 
	FOREIGN KEY (idMunicipio) REFERENCES municipio (idMunicipio)
;

ALTER TABLE rol ADD CONSTRAINT fk_rol_1 
	FOREIGN KEY (idEstatus) REFERENCES catalogo (idCatalogo)
;

ALTER TABLE rolPermiso ADD CONSTRAINT fk_rolpermiso_1 
	FOREIGN KEY (idPermiso) REFERENCES permiso (idPermiso)
;

ALTER TABLE rolPermiso ADD CONSTRAINT fk_rolpermiso_2 
	FOREIGN KEY (idRol) REFERENCES rol (idRol)
;

ALTER TABLE sugerencia ADD CONSTRAINT fk_sugerencia_1 
	FOREIGN KEY (idUsuario) REFERENCES usuario (idUsuario)
;

ALTER TABLE tesis ADD CONSTRAINT fk_tesis_1 
	FOREIGN KEY (idPais) REFERENCES pais (idPais)
;

ALTER TABLE tesis ADD CONSTRAINT fk_tesis_2 
	FOREIGN KEY (idEntidadFederativa) REFERENCES entidadfederativa (idEntidadFederativa)
;

ALTER TABLE tesis ADD CONSTRAINT fk_tesis_3 
	FOREIGN KEY (idDisciplina) REFERENCES catalogo (idCatalogo)
;

ALTER TABLE tesis ADD CONSTRAINT fk_tesis_4 
	FOREIGN KEY (idSubdisciplina) REFERENCES catalogo (idCatalogo)
;

ALTER TABLE tesis ADD CONSTRAINT fk_tesis_5 
	FOREIGN KEY (idInstitucion) REFERENCES catalogo (idCatalogo)
;

ALTER TABLE tesis ADD CONSTRAINT fk_tesis_6 
	FOREIGN KEY (idGrado) REFERENCES catalogo (idCatalogo)
;

ALTER TABLE tesis ADD CONSTRAINT fk_tesis_7 
	FOREIGN KEY (idEspecie) REFERENCES catalogo (idCatalogo)
;

ALTER TABLE tesis ADD CONSTRAINT fk_tesis_8 
	FOREIGN KEY (idDirector) REFERENCES director (idDirector)
;

ALTER TABLE tesis ADD CONSTRAINT fk_tesis_9 
	FOREIGN KEY (idAutor) REFERENCES autor (idAutor)
;

ALTER TABLE usuario ADD CONSTRAINT fk_usuario_1 
	FOREIGN KEY (idUsuario) REFERENCES persona (idPersona)
;

ALTER TABLE usuario ADD CONSTRAINT fk_usuario_2 
	FOREIGN KEY (idRol) REFERENCES rol (idRol)
;

ALTER TABLE visita ADD CONSTRAINT fk_visita_1 
	FOREIGN KEY (idUsuario) REFERENCES usuario (idUsuario)
;

ALTER TABLE visita ADD CONSTRAINT fk_visita_2 
	FOREIGN KEY (idTesis) REFERENCES tesis (idTesis)
;

ALTER TABLE visita ADD CONSTRAINT fk_visita_3 
	FOREIGN KEY (idPais) REFERENCES pais (idPais)
;
